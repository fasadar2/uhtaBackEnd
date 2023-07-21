package com.example.uhta.service;

import org.springframework.stereotype.Service;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import javax.activation.*;
@Service
public class SendMailFileService {
    public void SendPdfOnMail(List<String> emails)
    {
        final String user="createreport@mail.ru"; //Email address of sender
        final String password="K1lnk2tJNhQDAa4TfsqX";  //Password of the sender's email

        //Get the session object
        Properties properties = System.getProperties();

        //Here pass your smtp server url
        properties.setProperty("mail.smtp.host", "mail.javatpoint.com");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user,password);    }   });
        for (String  email :emails){
        //Сборка и отправка сообщения
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));
            message.setSubject("Message Aleart");

            //тело сообщения !!!не забудь поменять!!!
            BodyPart messageBodyPart1 = new MimeBodyPart();
            LocalDate date = LocalDate.now();
            messageBodyPart1.setText("Отчет от "+date.toString());

            //создание нового MimeBodyPart object и установка данных для объекта
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
            String filename = ".\\Report.xls";// придумай что с этим сделать оставлять захардкодженное название негоже
            DataSource source = new FileDataSource(filename);
            messageBodyPart2.setDataHandler(new DataHandler(source));
            messageBodyPart2.setFileName(filename);

            //Создание объекта сообщения
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart1);
            multipart.addBodyPart(messageBodyPart2);

            //Сборка сообщения
            message.setContent(multipart );

            //Отправка сообщения
            Transport.send(message);
            //System.out.println("message sent....");

        }catch (MessagingException ex) {ex.printStackTrace();}
    }
}
}

