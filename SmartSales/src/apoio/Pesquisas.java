package apoio;

import entidades.Funcionario;
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Pesquisas {

    public static void PesquisaFuncionario(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Funcionario> resultado = new ArrayList();
        String sql = "FROM Funcionario "
                + "WHERE Nome LIKE '%" + nome + "%' "
                + "ORDER BY Nome";
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(140);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(150);

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Funcionario funcionario = resultado.get(i);
                modelo.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getCpf(), funcionario.getEmail(), funcionario.getLogin(), funcionario.getCargo(), funcionario.getStatus()});
            }
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

    public static void PesquisaProduto(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Produto> resultado = new ArrayList();
        String sql = "FROM Produto "
                + "WHERE Nome LIKE '%" + nome + "%' "
                + "ORDER BY Nome";

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Produto p = resultado.get(i);
                modelo.addRow(new Object[]{p.getNome(), p.getPreco(), p.getDescricao()});
            }
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }
}
