/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.UnsupportedEncodingException;
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
 * @author Ashantha
 */
public class Mail {
    
    private static Message setUp() {

        Properties props = new Properties();
        props.put("mail.smtp.socketFactory.port", Constants.MAILPORT);
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", Constants.MAILSERVER);
        props.put("mail.smtp.port", Constants.MAILPORT);

        Session session;

        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Constants.EMAIL_USERNAME, Constants.EMAIL_PASSWORD);
                    }
                });
        try {
            Message message = new MimeMessage(session);
            try {
                message.setFrom(new InternetAddress(Constants.EMAIL_USERNAME, "FileX"));
            } catch (UnsupportedEncodingException ex) {
                message.setFrom(new InternetAddress(Constants.EMAIL_USERNAME));
            }
//            message.addRecipient(Message.RecipientType.CC, new InternetAddress(
//                    "email"));
            return message;

        } catch (MessagingException e) {
            System.out.println("Email setup failed");
            System.out.println("Error " + e.getLocalizedMessage());
            return null;
        }
    }

    /**
     * methods used for emailing text
     *
     * @param email email address
     * @param title message title
     * @param text message content
     */
    public static void sendmail(String emails, String title, String text) {
        Message message = setUp();
        try {
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emails));
            
            message.setSubject(title);
            message.setText(text);
            
            Transport.send(message);
        } catch (MessagingException ex) {
            System.out.println("Email sending failed to " + emails);
            System.out.println("Error " + ex.getLocalizedMessage());
        }
    }
    
}
