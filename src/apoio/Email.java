/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author yNot
 */
public class Email {

    public void enviar() {

        Properties props = new Properties();

        //Parâmetros de conexão com servidor Gmail
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("dionatan.ritter@universo.univates.br",
                        "TGj157MNo234ZZa");
            }
        });
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dionatan.ritter@universo.univates.br"));//Remetente

            Address[] toUser = InternetAddress
                    .parse("dionatan.ritter@universo.univates.br"); //Destinatário(s)

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Teste Envio de email's");//Titulo
            message.setText("Testando o teste!");//Assunto 

            //  Método para enviar a mensagem criada
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email enviado com sucesso!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
