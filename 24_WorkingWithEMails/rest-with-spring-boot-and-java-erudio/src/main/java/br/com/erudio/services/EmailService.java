package br.com.erudio.services;

import br.com.erudio.config.EmailConfig;
import br.com.erudio.mail.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailSender emailSender;

    @Autowired
    private EmailConfig emailConfigs;

    public void sendSimpleEmail(String to, String subject, String body) {
        emailSender
            .to(to)
            .withSubject(subject)
            .withMessage(body)
            .send(emailConfigs);
    }
}
