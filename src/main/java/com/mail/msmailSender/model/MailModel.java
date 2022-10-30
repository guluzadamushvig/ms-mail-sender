package com.mail.msmailSender.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailModel {
        private String to;
        private String subject;
        private String mail;
}
