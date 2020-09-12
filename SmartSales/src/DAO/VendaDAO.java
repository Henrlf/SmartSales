/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import apoio.HibernateUtil;
import entidades.Pedido;
import entidades.Produtos_Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.Tela_Principal;

/**
 *
 * @author yNot
 */
public class VendaDAO {

    public static boolean cadastrar(Pedido pedido) {

        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(pedido);
            String sql = "SELECT MAX(id) FROM Pedido";
            int maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
            AuditoriaDAO.cadastroVenda(maiorId);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar cadastrar uma venda.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static boolean cadastrarProdutos(Produtos_Pedido p) {

        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(p);
            String sql = "SELECT MAX(id) FROM Produtos_Pedido";
            int maiorId = Integer.parseInt(sessao.createQuery(sql).list().toString().replaceAll("\\D", ""));
            AuditoriaDAO.cadastroVenda(maiorId);
            transacao.commit();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar cadastrar um produto da venda.", e);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static boolean ExcluirVenda(int id) {
        List resultado = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        try {
            Pedido venda = (Pedido) sessao.get(Pedido.class, id);
            venda.setStaus("I");
            sessao.delete(venda);
            transacao.commit();
            return true;
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar inativar uma venda.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            sessao.close();
        }
    }

    public static void pesquisa(JTable tabela, int id) {
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
                modelo.addRow(new Object[]{c.getId(), c.getProduto().getNome(), c.getPreco()});
            }
        } catch (HibernateException e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao tentar pesquisar um cliente.", e);
        } finally {
            sessao.close();
        }
    }

}
