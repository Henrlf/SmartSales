package smartsales;

import Telas.Cadastro_Funcionario;
import apoio.HibernateUtil;

public class SmartSales {

    public static void main(String[] args) {

        try {
            HibernateUtil.getSessionFactory().openSession();
            Cadastro_Funcionario cd = new Cadastro_Funcionario();
            cd.setVisible(true);
            cd.setLocationRelativeTo(null);
        } catch (Exception e) {
            System.out.println(e);;
        }

    }

}
