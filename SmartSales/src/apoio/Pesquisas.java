package apoio;

import entidades.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import org.hibernate.*;

public class Pesquisas {

    public static void pesquisaFuncionario(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Funcionario> resultado = new ArrayList();
        String sql = "FROM Funcionario "
                + "WHERE Nome LIKE '%" + nome + "%' AND Status = 'A'"
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

    public static void pesquisaCidade(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Cidade> resultado = new ArrayList();
        String sql = "FROM Cidade "
                + "WHERE Nome LIKE '%" + nome + "%' AND Status = 'A'"
                + "ORDER BY Nome";
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(40);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Cidade c = resultado.get(i);
                modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getUf()});
            }
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }

    public static void pesquisacliente(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        List<Cliente> resultado = new ArrayList();

        String sql = "FROM cliente "
                + "WHERE Nome LIKE '%" + nome + "%' AND Status = 'A' "
                + "ORDER BY Nome";

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                
                Cliente c = resultado.get(i);
                Cidade x = (Cidade) sessao.get(Cidade.class, c.getCidade());
                Funcionario y = (Funcionario) sessao.get(Funcionario.class, c.getFuncionario());

                System.out.println(c.getNome());
                System.out.println(x.getNome());
                System.out.println(y.getNome());

                modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getCpf(), c.getTelefone(), c.getRg(), c.getEmail(), x.getNome(), y.getNome()});
            }
        } catch (HibernateException e) {

        } finally {
            sessao.close();
        }
    }
}
