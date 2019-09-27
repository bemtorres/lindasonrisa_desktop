/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author benja
 */
public class ConectarMail {
//    CorreoAdmin c = (new CorreoAdminDAO()).buscar();

//    String Username = c.getEmailUsername();
//    String PassWord = c.getEmailPass();
//    String host = c.getEmailHost();
//    String port = c.getEmailPort();

    String Username = "contacto.lindasonrisa@gmail.com";
    String PassWord = "abcd14abcd";
    String host = "smtp.gmail.com";
    String port = "587";
    

    public int enviarMensaje(String correoDestinatario, String cc, String cc2, String mensaje, String asunto, int estado) {
        String Subject = asunto;
        String Mensaje = mensaje;
        String To = correoDestinatario;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session;

        session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Username, PassWord);
            }
        }
        );

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            if (estado == 1) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
            }
            if (estado == 2) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
                message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(cc2));
            }

            message.setSubject(Subject);
            message.setContent(Mensaje, "text/html; charset=utf-8");
            
            Transport.send(message);

        } catch (MessagingException e) {
            System.out.println("Error " + e.toString());
            return -1;
        }
        return 1;
    }
 
 
 
    public String formatoCorreoInterno(String titulo, String contenido) {
        String mensaje = "";
        mensaje = "<div bgcolor='#FFFFFF' marginwidth='0' marginheight='0' style='font-family:Arial,Helvetica,sans-serif;color:#454545'>"
                + "<table width='589' border='0' cellpadding='0' cellspacing='0' style='font-family:Arial,Helvetica,sans-serif;margin:0 auto;border:5px solid #edece8;color:#454545;padding:0'>"
                + "<tbody><tr><td width='370' height='96'>"
                + "<h1 style='font-size:20px;font-weight:normal;margin-left:10px'>"+titulo+"</h1>"
                + "</td>"
                + "</tr>"
                + contenido
                + "<tr>"
                + "<td width='589' height='50' colspan='4'>"
                + "<p style='font-size:14px;line-height:20px;margin:0px 20px 20px'>"
                + "Un cordial saludo,<br><br>"
                + "<strong>Sistema de Ondotólogia <br>LindaSonrisa</strong>"
                + "</p>"
                + "</td>"
                + "</tr>"
                + "<tr>"
                + "</tr>"
                + "<tr>"
                + "<td width='370' height='65' bgcolor='#242E44'><p style='font-size:12px;color:#575654;text-align:left;margin-left:10px'><a href='' style='color:#fff' target='_blank' data-saferedirecturl=''>LindaSonrisa</a></p></td>"
                + "<td width='149' height='65' bgcolor='#242E44' align='right'>"
                + "</td></tr></tbody></table>";
        return mensaje;
    }

}
