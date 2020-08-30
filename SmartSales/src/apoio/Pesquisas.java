package apoio;

import entidades.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import org.hibernate.*;

public class Pesquisas {

    public static void pesquisaProduto(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Produto> resultado = new ArrayList();
        String sql = "FROM Produto "
                + "WHERE Nome LIKE '%" + nome + "%' AND Status = 'A'"
                + "ORDER BY Nome";
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Produto p = resultado.get(i);
                modelo.addRow(new Object[]{p.getId(), p.getNome(), "R$ " + p.getPreco(), p.getDescricao()});
            }
        } catch (HibernateException e) {

           
        } finally {
            sessao.close();
        }
    }

}