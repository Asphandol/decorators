package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserConstructorAllFields() {
        User user = new User("John Doe", 25, Gender.MALE, 70.5, 175.0);
        assertEquals("John Doe", user.name);
        assertEquals(25, user.age);
        assertEquals(Gender.MALE, user.gender);
        assertEquals(70.5, user.weight);
        assertEquals(175.0, user.height);
    }

    @Test
    public void testUserConstructorWithoutWeightAndHeight() {
        User user = new User("Jane Doe", 30, Gender.FEMALE);
        assertEquals("Jane Doe", user.name);
        assertEquals(30, user.age);
        assertEquals(Gender.FEMALE, user.gender);
        assertEquals(0.0, user.weight);
        assertEquals(0.0, user.height);
    }

    @Test
    public void testUserConstructorWithNameAndGender() {
        User user = new User("Alice", Gender.FEMALE);
        assertEquals("Alice", user.name);
        assertEquals(Gender.FEMALE, user.gender);
        assertEquals(0, user.age);
        assertEquals(0.0, user.weight);
        assertEquals(0.0, user.height);
    }

    @Test
    public void testUserConstructorWithNameOnly() {
        User user = new User("Bob");
        assertEquals("Bob", user.name);
        assertNull(user.gender);
        assertEquals(0, user.age);
        assertEquals(0.0, user.weight);
        assertEquals(0.0, user.height);
    }
}
