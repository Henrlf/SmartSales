package DAO;

import apoio.HibernateUtil;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.Tela_Principal;

public class ClienteDAO {

    public static boolean cadastrar(Cliente cliente) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(cliente);
            String sql = "SELECT MAX(id) FROM Cliente";
            int maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
            AuditoriaDAO.cadastroCliente(maiorId);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar cadastrar um cliente.", e);
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
            Cliente cliente = (Cliente) sessao.get(Cliente.class, id);
            cliente.setStatus("I");
            sessao.update(cliente);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar inativar um cliente.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static Cliente getClienteBanco(int id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        Cliente cliente = new Cliente();
        try {            
            cliente = (Cliente) sessao.get(Cliente.class, id);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao buscar um cliente no banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cliente;
    }

    public static void pesquisa(JTable tabela, String nome) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Cliente> resultado = new ArrayList();
        String sql = "FROM Cliente "
                + "WHERE Nome LIKE '%" + nome + "%' AND Status = 'A' "
                + "ORDER BY Nome";
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Cliente c = resultado.get(i);
                modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getCpf(), c.getTelefone(), c.getRg(), c.getEmail(), c.getCidade().getNome(), c.getFuncionario().getNome()});
            }
        } catch (HibernateException e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar pesquisar um cliente.", e);
        } finally {
            sessao.close();
        }
    }

}
