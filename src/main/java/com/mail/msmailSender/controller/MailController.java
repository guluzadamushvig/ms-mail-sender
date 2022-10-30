package com.mail.msmailSender.controller;

import com.mail.msmailSender.model.MailModel;
import com.mail.msmailSender.service.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/send-mail")
public class MailController {
    private final EmailSenderService emailSenderService;

    @PostMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @EventListener(MailController.class)
    public void sendMail(@RequestBody MailModel mailModel) {
        emailSenderService.sendMail(mailModel.getTo(),mailModel.getSubject(),mailModel.getMail());
    }
}
