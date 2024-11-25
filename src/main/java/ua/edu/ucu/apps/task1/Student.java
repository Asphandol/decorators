package ua.edu.ucu.apps.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Student {
    public String firstName;
    public String lastName;
    public String gender;
    public String email;
    public int age;
    public List<String> courses;
}
