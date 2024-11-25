package ua.edu.ucu.apps;

import java.util.List;

import ua.edu.ucu.apps.task1.Student;
import ua.edu.ucu.apps.task2.*;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .gender("Male")
                .email("john.doe@example.com")
                .age(22)
                .courses(List.of("Math", "Science"))
                .build();
        Clien client = Client.builder()
                .name("Pupa")
                .age(12)
                .sex("male")
                .build();
        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);

        MyImage image = new ProxyImage("example.jpg");
        image.display();
    }
}
