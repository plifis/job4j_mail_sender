package ru.plifis.job4j_mail_sender.controllers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class MailController {

    @KafkaListener(id = "1", topics = {"mail"}, containerFactory = "batchFactory")
    public void sendEmail() {
            System.out.print("Есть истекшие паспорта" + System.lineSeparator());
    }
}