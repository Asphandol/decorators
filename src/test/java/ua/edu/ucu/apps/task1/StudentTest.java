package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentBuilder() {
        List<String> courses = Arrays.asList("Math", "Physics");
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .gender("Male")
                .email("john.doe@example.com")
                .age(20)
                .courses(courses)
                .build();

        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
        assertEquals("Male", student.getGender());
        assertEquals("john.doe@example.com", student.getEmail());
        assertEquals(20, student.getAge());
        assertEquals(courses, student.getCourses());
    }

    @Test
    void testUpdateStudentFields() {
        List<String> courses = Arrays.asList("Biology", "Chemistry");
        Student student = Student.builder()
                .firstName("Jane")
                .lastName("Smith")
                .gender("Female")
                .email("jane.smith@example.com")
                .age(22)
                .courses(courses)
                .build();

        student.setFirstName("Janet");
        student.setAge(23);

        assertEquals("Janet", student.getFirstName());
        assertEquals(23, student.getAge());
        assertEquals(courses, student.getCourses());
    }
}
