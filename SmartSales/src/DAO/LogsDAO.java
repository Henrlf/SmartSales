package DAO;

import apoio.HibernateUtil;
import entidades.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LogsDAO {

    public static void salvarLog(Funcionario funcionario, String acao, Exception e) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction transacao = sessao.beginTransaction();
            
            Logs log = new Logs();
            log.setFuncionario(funcionario);
            log.setAcao(acao);
            log.setErro(String.valueOf(e));
            
            sessao.save(log);
            transacao.commit();
        } catch (Exception er) {
            System.out.println("Erro: " + er);
        } finally {
            sessao.close();
        }

    }
}
