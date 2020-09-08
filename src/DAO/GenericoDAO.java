package DAO;

import apoio.HibernateUtil;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import org.hibernate.*;
import telas.Tela_Principal;

public class GenericoDAO {

    public static boolean cadastrar(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao realizar cadastro.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static boolean inativar(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.update(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao realizar uma inativação.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static Object getObjectBanco(int id, Class classe) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        Object obj = null;
        try {
            obj = sessao.get(classe, id);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao puxar algum registro do banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return obj;
    }

    public static void pesquisa(JTable tabela, String nome, String classe) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Object> resultado = new ArrayList();
        String sql = "FROM " + classe
                + " WHERE Nome LIKE '%" + nome + "%' AND Status = 'A'"
                + " ORDER BY Nome";
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            if (classe.equals("Cliente")) {
                tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(3).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(4).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(125);
                tabela.getColumnModel().getColumn(3).setPreferredWidth(125);
                tabela.getColumnModel().getColumn(4).setPreferredWidth(125);
                tabela.getColumnModel().getColumn(6).setPreferredWidth(125);
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Cliente c = (Cliente) resultado.get(i);
                    modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getCpf(), c.getTelefone(), c.getRg(), c.getEmail(), c.getCidade().getNome(), c.getFuncionario().getNome()});
                }
            } else if (classe.equals("Produto")) {
                tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Produto p = (Produto) resultado.get(i);
                    modelo.addRow(new Object[]{p.getId(), p.getNome(), "R$ " + p.getPreco(), p.getDescricao()});
                }
            } else if (classe.equals("Funcionario")) {
                tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(5).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(140);
                tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
                tabela.getColumnModel().getColumn(5).setPreferredWidth(150);
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Funcionario funcionario = (Funcionario) resultado.get(i);
                    modelo.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getCpf(), funcionario.getEmail(), funcionario.getLogin(), funcionario.getCargo(), funcionario.getStatus()});
                }
            } else if (classe.equals("Cidade")) {
                tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(40);
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Cidade c = (Cidade) resultado.get(i);
                    modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getUf()});
                }
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao realizar uma pesquisa de preenchimento de tabela.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
    }

    public static boolean salvarEdicao(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.update(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao realizar uma edição.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }
}
