package ua.edu.ucu.apps.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MailingSystemTest {

    @Test
    public void testMailingSystemEndToEnd() {
        Client client = Client.builder()
                .name("John Doe")
                .age(30)
                .sex("Male")
                .email("john.doe@example.com")
                .build();

        assertNotNull(client);
        assertEquals("John Doe", client.getName());
        assertEquals(30, client.getAge());
        assertEquals("Male", client.getSex());
        assertEquals("john.doe@example.com", client.getEmail());
        assertTrue(client.getId() > 0, "Client ID should be a positive number.");

        MailCode birthdayMailCode = new BirthdayMailCode();
        assertNotNull(birthdayMailCode);
        MailInfo mailInfo = new MailInfo(client, birthdayMailCode);
        assertNotNull(mailInfo);

        String generatedMail = mailInfo.generate();
        String expectedMail = "Dear John Doe! Happy 30 birthday!";
        assertEquals(expectedMail, generatedMail, "Generated mail content should match the expected format.");

        try {
            MailSender.sendMail(mailInfo);
        } catch (Exception e) {
            fail("MailSender.sendMail() should not throw any exceptions.");
        }
    }
}
