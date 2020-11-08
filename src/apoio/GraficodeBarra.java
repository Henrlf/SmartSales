/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import DAO.LogsDAO;
import entidades.Metas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import telas.Tela_Login;

/**
 *
 * @author yNot
 */
public class GraficodeBarra {

    public Metas getMetas(int id, int ano) {

        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        Metas x = new Metas();
        try {
            List<Object> resultado = new ArrayList();
            String sql = "FROM Metas "
                    + " WHERE funcionario_id = " + id + " "
                    + " AND ano_id = " + ano;

            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();

            for (int i = 0; i < resultado.size(); i++) {
                x = (Metas) resultado.get(i);
            }

        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao puxar algum registro do banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return x;
    }

    public CategoryDataset createDataSet(Metas m) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(m.getJaneiro(), "Janeiro", "");
        dataset.addValue(m.getFevereiro(), "Fevereiro", "");
        dataset.addValue(m.getMarco(), "Março", "");
        dataset.addValue(m.getAbril(), "Abril", "");
        dataset.addValue(m.getMaio(), "Maio", "");
        dataset.addValue(m.getJunho(), "Junho", "");
        dataset.addValue(m.getJulho(), "Julho", "");
        dataset.addValue(m.getAgosto(), "Agosto", "");
        dataset.addValue(m.getSetembro(), "Setembro", "");
        dataset.addValue(m.getOutubro(), "Outubro", "");
        dataset.addValue(m.getNovembro(), "Novembro", "");
        dataset.addValue(m.getDezembro(), "Dezembro", "");

        return dataset;
    }

    public JFreeChart createBarChart(CategoryDataset dataSet) {

        JFreeChart graficoBarras = ChartFactory.createBarChart("Metas do ano atual", "Mês", "Metas de Vendas", dataSet, PlotOrientation.VERTICAL, true, true, false);

        return graficoBarras;
    }

    public ChartPanel criarGrafico(Metas x) {

        CategoryDataset dataset = this.createDataSet(x);

        JFreeChart grafico = this.createBarChart(dataset);

        ChartPanel painelGrafico = new ChartPanel(grafico);

        return painelGrafico;

    }
    
    
    public ChartPanel atualizarGrafico(Metas x) {

        CategoryDataset datset = this.createDataSet(x);

        JFreeChart graf = this.createBarChart(datset);

        ChartPanel painelG = new ChartPanel(graf);

        return painelG;
    }

}
