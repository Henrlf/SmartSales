package apoio;

import DAO.LogsDAO;
import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import telas.Tela_Principal;

public class Validacoes {

    public static boolean logar(String login, String senha) {
        boolean pas = false;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Funcionario> resultado = new ArrayList();
        String sql = "FROM Funcionario";
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Funcionario funcionario = resultado.get(i);
                if (funcionario.getLogin().equals(login) && funcionario.getSenha().equals(senha)) {
                    if (funcionario.getStatus().equals("A")) {
                        Tela_Principal.funcionarioLogado = funcionario;
                        sessao.byId(Funcionario.class);
                        System.out.println(sessao.byId(Funcionario.class));
                        pas = true;
                    }
                }
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(null, "Erro ao validar o usúario no login.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return pas;
    }

    public static boolean validaCadastroLogin(String usu) {
        boolean pas = false;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Funcionario> resultado = new ArrayList();
        String sql = "FROM Funcionario";
        try {
            org.hibernate.Query query = sessao.createQuery(sql);
            resultado = query.list();
            for (int i = 0; i < resultado.size(); i++) {
                Funcionario funcionario = resultado.get(i);
                if (usu.equals(funcionario.getLogin())) {
                    pas = true;
                }
            }
        } catch (Exception e) {
            LogsDAO.salvarLog(Tela_Principal.getFunLog(), "Erro ao validar o usúario de cadastro.", e);
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
            pas = true;
        } finally {
            sessao.close();
        }
        return pas;
    }

}
