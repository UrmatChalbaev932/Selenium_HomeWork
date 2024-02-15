package org.example.ui.data;

import com.github.javafaker.Faker;
public class FakerBase {
    static Faker faker = new Faker();

    //создали метод для генерации пороля для пароля с требованиями
    public static String generatePassword() {
        Faker faker = new Faker();

        // Генерация пароля согласно заданному паттерну
        String lowercase = faker.regexify("[a-z]");
        String uppercase = faker.regexify("[A-Z]");
        String digit = faker.regexify("[0-9]");
        String specialChar = faker.regexify("[!@#/$%/^&/*]");

        // Объединение всех компонентов в один пароль
        String password = lowercase + uppercase + digit + specialChar + faker.regexify("[a-zA-Z0-9!@#\\$%\\^&\\*]{4,}");

        return password;
    }
}