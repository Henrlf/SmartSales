package DAO;

import apoio.HibernateUtil;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.Tela_Principal;

public class FuncionarioDAO {

    public static boolean cadastrar(Funcionario funcionario) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(funcionario);
            transacao.commit();
            String sql = "SELECT MAX(id) FROM Funcionario";
            int maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
            AuditoriaDAO.cadastroFuncionario(maiorId);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar cadastrar um funcionario.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static boolean inativar(int id) {
        List resultado = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try {
            Funcionario funcionario = (Funcionario) sessao.get(Funcionario.class, id);
            funcionario.setStatus("I");
            sessao.update(funcionario);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar inativar um fucnionario.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static void pesquisa(JTable tabela, String nome) {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao pesquisar um funcionario.", e);
        } finally {
            sessao.close();
        }
    }

    public static Funcionario getFuncionarioBanco(int id) {
        Funcionario funcionario = new Funcionario();
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            funcionario = (Funcionario) sessao.get(Funcionario.class, id);
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar buscar um fucnionario.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }

        return funcionario;
    }

    public static boolean salvarEdicao(Funcionario funcionario) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.update(funcionario);
            transacao.commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            sessao.close();
        }
    }
}
