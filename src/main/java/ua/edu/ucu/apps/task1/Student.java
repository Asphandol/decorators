package ua.edu.ucu.apps.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    private List<String> courses;
}
