package org.example.ui.entity;

import io.qameta.allure.Severity;
import lombok.*;
import org.openqa.selenium.NoSuchElementException;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String dateOfBirth;
    private String subjects;
    private String hobbies;
    private String picture;
    private String currentAddress;
    private String stateOnCity;

}
