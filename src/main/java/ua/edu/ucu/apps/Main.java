package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task1.Student;
import ua.edu.ucu.apps.task2.*;
import ua.edu.ucu.apps.task3.MyImage;
import ua.edu.ucu.apps.task3.ProxyImage;

public class Main {
    public static void main(String[] args) {
        sendBirthdayMail();

        displayImage("example.jpg");
    }

    private static void sendBirthdayMail() {
        Student student = Student.builder()
                .first_name("Client Name")
                .age(100)
                .email("test@client.mail")
                .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);

        MailSender.sendMail(mailInfo);
        System.out.println("Mail sent successfully!");
    }

    private static void displayImage(String filename) {
        MyImage image = new ProxyImage(filename);
        image.display();
        System.out.println("Image displayed: " + filename);
    }
}
