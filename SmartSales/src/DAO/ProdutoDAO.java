package DAO;

import apoio.HibernateUtil;
import apoio.Mascaras;
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.Tela_Principal;

public class ProdutoDAO {

    public static boolean cadastrar(Produto produto) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(produto);
            transacao.commit();
            String sql = "SELECT MAX(id) FROM Produto";
            int maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
            AuditoriaDAO.cadastroProduto(maiorId);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no cadastro de um produto.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static boolean inativar(int id) {
        List resultado = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            Transaction transacao = sessao.beginTransaction();
            Produto produto = new Produto();
            produto = (Produto) sessao.get(Produto.class, id);
            produto.setStatus("I");
            sessao.update(produto);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro na inativação de um produto.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static void pesquisa(JTable tabela, String nome) {
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
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro na pesquisa de um produto.", e);
        } finally {
            sessao.close();
        }
    }

    public static Produto getProdutoBanco(int id) {
        Produto produto = new Produto();
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            produto = (Produto) sessao.get(Produto.class, id);
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar buscar um produto.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return produto;
    }

    public static boolean salvarEdicao(Produto produto) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.update(produto);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao salvar edição de um produto.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }
}
