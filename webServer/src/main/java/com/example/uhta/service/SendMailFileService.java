package com.example.uhta.service;

import org.springframework.stereotype.Service;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.List;
import java.util.Properties;
import javax.activation.*;
@Service
public class SendMailFileService {
    public void SendPdfOnMail(List<String> emails,String fileName)
    {
        final String from = "createreport@mail.ru";
        final String password = "kQb3DGd8bJEu6pmhcPdv";//K1lnk2tJNhQDAa4TfsqX
        String host = "smtp.mail.ru";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtps.ssl.checkserveridentity", true);
        props.put("mail.smtps.ssl.trust", "*");
        props.put("mail.smtp.ssl.enable", "true");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator(){
                    protected PasswordAuthentication getPassAuth(){
                        return new PasswordAuthentication(from, password);
                    }
                });
for (String email :emails) {
    try {
        // Создание объекта MimeMessage по умолчанию
        MimeMessage message = new MimeMessage(session);

        // Установить От: поле заголовка
        message.setFrom(new InternetAddress(from));

        // Установить Кому: поле заголовка
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

        // Установить тему: поле заголовка
        message.setSubject("Отчет ");

        // Создание части сообщения
        BodyPart messageBodyPart = new MimeBodyPart();

        // Заполнение сообщения
        messageBodyPart.setText("По вашему запросу был сформирован отчет");

        // Создание составного сообщения
        Multipart multipart = new MimeMultipart();

        // Установить часть текстового сообщения
        multipart.addBodyPart(messageBodyPart);

        // Часть вторая вложения
        messageBodyPart = new MimeBodyPart();
        String filename = ".\\"+fileName;
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);

        // Отправить полные части сообщения
        message.setContent(multipart);

        // Отправить сообщение
        try {
            Transport.send(message, from, password);
        } catch (javax.mail.SendFailedException sendFailedException) {
        }
        System.out.println("Сообщение успешно отправлено.... на почту "+email);
    } catch (MessagingException mex) {
        mex.printStackTrace();
    }
}
    }
    }


