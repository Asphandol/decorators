package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentFields() {
        List<String> courses = Arrays.asList("Math", "Science", "History");
        Student student = new Student();

        student.firstName = "John";
        student.lastName = "Smith";
        student.gender = "Male";
        student.email = "john.smith@example.com";
        student.age = 20;
        student.courses = courses;

        assertEquals("John", student.firstName);
        assertEquals("Smith", student.lastName);
        assertEquals("Male", student.gender);
        assertEquals("john.smith@example.com", student.email);
        assertEquals(20, student.age);
        assertEquals(courses, student.courses);
    }
}
