package DAO;

import apoio.HibernateUtil;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import org.hibernate.*;
import telas.Tela_Login;

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
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar cadastro.", e);
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
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma inativação.", e);
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
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao puxar algum registro do banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return obj;
    }

    public static int getMetas(Ano ano, Funcionario fun) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        List<Object> resultado = new ArrayList();
        String sql = "FROM Metas"
                + " WHERE Funcionario_id = " + fun.getId() + " AND Ano_id = " + ano.getId();
        int id = 0;
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            Metas m = (Metas) resultado.get(0);
            id = m.getId();
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao puxar algum registro do banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return id;
    }

    public static boolean getValidaMetas(Ano ano, Funcionario fun) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        List<Object> resultado = new ArrayList();
        String sql = "FROM Metas"
                + " WHERE Funcionario_id = " + fun.getId() + " AND Ano_id = " + ano.getId();
        boolean pas = false;
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            if (!resultado.isEmpty()) {
                pas = true;
            }
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao puxar algum registro do banco de dados.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }        
        return pas;
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
            } else if (classe.equals("Auditoria")) {
                tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
                tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
                tabela.getColumnModel().getColumn(2).setPreferredWidth(40);
                org.hibernate.Query query = sessao.createQuery(sql);
                resultado = query.list();
                for (int i = 0; i < resultado.size(); i++) {
                    Auditoria aud = (Auditoria) resultado.get(i);
                    modelo.addRow(new Object[]{aud.getId(), aud.getOperacao(), aud.getTabela(), aud.getOld_value(), aud.getNew_value(), aud.getUsuario()});
                }
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma pesquisa de preenchimento de tabela.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
    }

    public static void pesquisaAuditoria(JTable tabela) {
        Session sessao = null;
        String sql = "FROM Auditoria";
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(50);
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            org.hibernate.Query query = sessao.createQuery(sql);
            transacao.commit();
            List<Auditoria> resultado = new ArrayList();
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Auditoria aud = resultado.get(i);
                modelo.addRow(new Object[]{aud.getId(), aud.getTabela(), aud.getOperacao(), aud.getOld_value(), aud.getNew_value(), aud.getData(), aud.getUsuario()});
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma pesquisa de preenchimento de tabela de auditoria.", e);
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
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma edição.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static void pesquisaPro_Ped(JTable tabela, int id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Produtos_Pedido> resultado = new ArrayList();
        String sql = "FROM Produtos_Pedido "
                + "WHERE pedido_id = " + id + " AND Status = 'A' ";
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Produtos_Pedido c = resultado.get(i);
//                modelo.addRow(new Object[]{c.getId(), c.getProduto().getNome(), c.getPreco()});
            }
        } catch (HibernateException e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao tentar pesquisar um cliente.", e);
        } finally {
            sessao.close();
        }
    }

    public static int getLastId(String classe) {
        Session sessao = null;
        int maiorId = 0;
        try {
            String sql = "SELECT MAX(id) FROM " + classe;
            sessao = HibernateUtil.getSessionFactory().openSession();
            maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma busca pelo ultimo id de cadastro.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return maiorId;
    }

    public static void pesquisaLogs(JTable tabela) {
        Session sessao = null;
        List<Logs> resultado = new ArrayList();
        String sql = "FROM Logs";
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            tabela.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tabela.getColumnModel().getColumn(1).setCellRenderer(centralizado);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(125);
            org.hibernate.Query query = sessao.createQuery(sql);
            transacao.commit();
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Logs log = resultado.get(i);
                Funcionario fun = (Funcionario) log.getFuncionario();
                modelo.addRow(new Object[]{log.getId(), String.valueOf(fun.getId()), fun.getNome(), log.getAcao(), log.getErro(), log.getData()});
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Login.fun, "Erro ao realizar uma pesquisa de preenchimento de tabela de logs.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
    }

}
