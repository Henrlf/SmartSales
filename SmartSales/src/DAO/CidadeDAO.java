package DAO;

import apoio.HibernateUtil;
import entidades.Cidade;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import org.hibernate.*;
import telas.Tela_Principal;

public class CidadeDAO {

    public static boolean cadastrar(Cidade cidade) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(cidade);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar cadastrar uma cidade.", e);
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
            Cidade cidade = (Cidade) sessao.get(Cidade.class, id);
            cidade.setStatus("I");
            sessao.update(cidade);
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

    public static void pesquisar(JTable tabela, String nome) {
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
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar inativar um fucnionario.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
    }
}
