package smartsales;

import javax.swing.UIManager;
import telas.Tela_Login;


public class SmartSales {

    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        }catch (Exception e){ 
        }
            Tela_Login log = new Tela_Login();
            log.setVisible(true);
            log.setLocationRelativeTo(null);
    }
}
