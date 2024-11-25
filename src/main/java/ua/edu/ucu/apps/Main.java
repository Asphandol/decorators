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

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(student, mailCode);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);

        MyImage image = new ProxyImage("example.jpg");
        image.display();
    }
}
