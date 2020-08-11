/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import javax.swing.JOptionPane;

/**
 *
 * @author yNot
 */
public class Login_Sistema {

    public static boolean logar(String login, String senha) {

        var NewLogin = "";
        var NewSenha = "";

        if (NewLogin.equals(login) && NewSenha.equals(senha)) {
            return true;
        } else {
            System.out.println("erro função logar");
            return false;
        }
    }

}
