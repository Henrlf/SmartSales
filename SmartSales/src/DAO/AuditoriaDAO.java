package DAO;

import apoio.HibernateUtil;
import entidades.Auditoria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import telas.Tela_Principal;

public class AuditoriaDAO {

    public static void cadastroFuncionario(int id_alvo) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            Auditoria aud = new Auditoria();
            aud.setFuncionario(Tela_Principal.getFunLog());
            aud.setAcao("Cadastro de Funcionario");
            aud.setId_alvo(id_alvo);
            sessao.save(aud);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no salvamento de auditoria(Cadastro funcionario).", e);
        } finally {
            sessao.close();
        }
    }

    public static void cadastroCliente(int id_alvo) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            Auditoria aud = new Auditoria();
            aud.setFuncionario(Tela_Principal.getFunLog());
            aud.setAcao("Cadastro de Cliente");
            aud.setId_alvo(id_alvo);
            sessao.save(aud);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no salvamento de auditoria(Cadastro funcionario).", e);
        } finally {
            sessao.close();
        }
    }

    public static void cadastroProduto(int id_alvo) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            Auditoria aud = new Auditoria();
            aud.setFuncionario(Tela_Principal.getFunLog());
            aud.setAcao("Cadastro de Produto");
            aud.setId_alvo(id_alvo);
            sessao.save(aud);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no salvamento de auditoria(Cadastro funcionario).", e);
        } finally {
            sessao.close();
        }
    }

    public static void cadastroCidade(int id_alvo) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            Auditoria aud = new Auditoria();
            aud.setFuncionario(Tela_Principal.getFunLog());
            aud.setAcao("Cadastro de Cidade");
            aud.setId_alvo(id_alvo);
            sessao.save(aud);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no salvamento de auditoria(Cadastro funcionario).", e);
        } finally {
            sessao.close();
        }
    }

    public static void cadastroVenda(int id_alvo) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            Auditoria aud = new Auditoria();
            aud.setFuncionario(Tela_Principal.getFunLog());
            aud.setAcao("Cadastro de Venda");
            aud.setId_alvo(id_alvo);
            sessao.save(aud);
            transacao.commit();
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro no salvamento de auditoria(Cadastro Venda).", e);
        } finally {
            sessao.close();
        }
    }

}
