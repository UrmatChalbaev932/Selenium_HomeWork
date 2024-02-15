package org.example.ui.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LoginUserEntity {
private String firstName;
private String lastName;
private String userName;
private String password;
}
