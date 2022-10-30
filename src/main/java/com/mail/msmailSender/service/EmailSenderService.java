package com.mail.msmailSender.service;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailSenderService {
    private final JavaMailSender mailSender ;

    public EmailSenderService(JavaMailSender mailSender){
        this.mailSender = mailSender;
   }
    public void sendMail(String to, String subject, String message){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        String from = "yourMailAddres";
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);
        log.info("sendMailService - Mail Send to "+to+ " started");
        mailSender.send(mailMessage);
        log.info("sendMailService - Mail Send to "+to+ " ended");
    }


}
