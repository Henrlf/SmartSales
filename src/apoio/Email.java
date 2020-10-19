/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;


/**
 *
 * @author yNot
 */
public class Email {
    
    
    
    
    
    

   /* public static void main(String[] args) {
        
        
        
       if (args.length != 5) {
            System.out.println("usage: java sendfile <to> <from> <smtp> <file>");
            System.exit(1);
        }

        String to = args[0];
        String from = args[1];
        String host = args[2];
        String filename = args[3];
        String msgText1 = "Enviando arquivo.\n";
        String subject = "Enviando arquivo";

        // cria algumas propriedades e obtem uma sessao padrao
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);

        Session session = Session.getInstance(props, null);

        try {
            // cria a mensagem
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);

            // cria a primeira parte da mensagem
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(msgText1);

            // cria a segunda parte da mensage
            MimeBodyPart mbp2 = new MimeBodyPart();

            // anexa o arquivo na mensagem
            FileDataSource fds = new FileDataSource(filename);
            mbp2.setDataHandler(new DataHandler(fds));
            mbp2.setFileName(fds.getName());

            // cria a Multipart
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);
            mp.addBodyPart(mbp2);

            // adiciona a Multipart na mensagem
            msg.setContent(mp);

            // configura a data: cabecalho
            msg.setSentDate(new Date());

            // envia a mensagem
            Transport.send(msg);

        } catch (MessagingException mex) {
            mex.printStackTrace();
            Exception ex = null;
            if ((ex = mex.getNextException()) != null) {
                ex.printStackTrace();
            }

        }
    }*/
    
   /* 
    
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.Multipart;

import org.apache.commons.mail.*;

public class Email {
public static void sendAttachEmail(List to, String subject, String body, String attach)
{
Properties p = getProps();

    Authenticator auth = new SMTPAuthenticator();
	
	Session session = Session.getInstance(p, auth);
	MimeMessage msg = new MimeMessage(session);
	MimeBodyPart mbp = new MimeBodyPart();

	try {
		// "de" e "para"!!
		msg.setFrom(new InternetAddress("mdapp@mobilescience.mobi"));
		
		InternetAddress [] emails = new InternetAddress[to.size()];
		int i = 0;
		for (Iterator iterator = to.iterator(); iterator.hasNext();) {
			String toAddr = (String) iterator.next();
			emails[i] = new InternetAddress(toAddr);
			i++;
		}
		msg.setRecipients(Message.RecipientType.TO, emails);
		msg.setSentDate(new Date());
		msg.setSubject(subject);
		msg.setText(body);
		
		//enviando anexo
		DataSource fds = new FileDataSource(attach);
		mbp.setDisposition(Part.ATTACHMENT);
		mbp.setDataHandler(new DataHandler(fds));
		mbp.setFileName(fds.getName());
		
		
                                            Multipart mp = new MimeMultipart();   
		mp.addBodyPart(mbp);
		msg.setContent(mp);
		
		// enviando mensagem
		Transport.send(msg);
	} catch (AddressException e) {
		e.printStackTrace();
	} catch (MessagingException e) {
		e.printStackTrace();
	}
	System.out.println("Enviado com sucesso!");
}

private static Properties getProps() {
	Properties p = new Properties();		
	p.put("mail.transport.protocol", "smtp");
	p.put("mail.smtp.starttls.enable","true");
    p.put("mail.smtp.host", "smtp.gmail.com");
    p.put("mail.smtp.auth", "true");
    
    return p;
}
}

class SMTPAuthenticator extends javax.mail.Authenticator {

public PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication ("mdapp@mobilescience.mobi", "marketd");
}
}[/code]

*/
}
