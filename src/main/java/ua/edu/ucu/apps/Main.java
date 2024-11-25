package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task1.Student;
import ua.edu.ucu.apps.task2.*;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                    .name("Client Name")
                    .age(100)
                    .email("test@client.mail")
                    .build();
        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }


}