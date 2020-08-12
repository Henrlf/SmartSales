package apoio;

import entidades.*;
import java.util.*;
import javax.swing.JOptionPane;
import org.hibernate.*;

public class Login_Sistema {

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
                    pas = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro imprevisto!\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return pas;
    }

}
