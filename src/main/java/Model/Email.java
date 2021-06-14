/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Model;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;
/**
 *
 * @author briananjune
 */
public class Email {

    
    public void EmailS  (String email) throws MessagingException{
      Properties pro = new Properties();
      
      pro.put("mail.smtp.auth", "true");
      pro.put("mail.smtp.starttls.enable", "true");
      pro.put("mail.smtp.host", "smtp.gmail.com");
      pro.put("mail.smtp.port", "587");
      
      String myAcc = "musicmart123@gmail.com" ;
      String pass = "0312240771";
      
      Session session = Session.getInstance(pro, new Authenticator()
       {
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(myAcc,pass);
           }
           
       });
      
      Message msg = prepareMessage(session, myAcc, email);
     
      Transport.send(msg);
      System.out.println("Message sent successfully");
   }
    
    private static Message prepareMessage(Session session, String myAcc, String email)
    {
        try{
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(myAcc));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            msg.setSubject("Regarding the Music Mart Order");
            msg.setText("You have successfully Ordered the Order from Music Mart");
            return msg;
            
        }catch(MessagingException e)
        {
           
        }
        return null;
    }
}
