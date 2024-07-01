package org.example.ui.data;

import com.github.javafaker.Faker;
import org.example.ui.entity.Student;

import java.io.File;
import java.text.DateFormatSymbols;
import java.util.*;

public class StudentFaker {
//    static Faker faker = new Faker();
//
//    public static Student createNewStudenteWithFakeData() {
//        Student student = new Student();
//        student.setName(faker.name().name());
//        student.setLastName(faker.name().lastName());
//        student.setEmail(faker.internet().emailAddress());
//        student.setGender(faker.demographic().sex());
//        student.setMobile(faker.phoneNumber().cellPhone());
//        student.setDateOfBirth(generateBirthDay());
//        student.setSubjects(generateSubjects());
//        student.setHobbies(generateHobbies());
//        student.setPicture(generateImage());
//        student.setCurrentAddress(faker.address().fullAddress());
//        student.setStateOnCity(generateStateOfCity());
//
//
//        return student;
//    }
//
//    public static String generateSubjects() {
//        Random random = new Random();
//        String[] firstTwoLettersOfSubjects = {"En", "Ec", "Ph", "Ac", "Ar", "So", "Hi", "Ch", "Co", "Ci", "Bi", "Ma"};
//        Set<String> set = new HashSet<>();
//        while (set.size() < 4) {
//            String subject = firstTwoLettersOfSubjects[random.nextInt(firstTwoLettersOfSubjects.length)];
//            if (set.contains(subject)) {
//            } else {
//                set.add(subject);
//            }
//        }
//        LinkedList<String> subjects = new LinkedList<>(set);
//        return subjects.get(0)+" "+subjects.get(1)+" "+subjects.get(2)+" "+subjects.get(3);
//    }
//
//    public static String generateBirthDay() {
//        Random random = new Random();
//        String[] monthsArray = new DateFormatSymbols(Locale.ENGLISH).getMonths();
//
//        int randomYear = random.nextInt(1960, 2010);
//        int randomDay = random.nextInt(30);
//        int randomMonth = random.nextInt(12);
//
//        return randomDay + " " + monthsArray[randomMonth] + " "
//                + randomYear;
//    }
//
//    public static String generateHobbies() {
//        Random random = new Random();
//        String[] hobbiesList = {"Sports", "Reading", "Music"};
//        String hobbies = hobbiesList[random.nextInt(hobbiesList.length)];
//        return hobbies;
//    }
//    public static String generateImage() {
//        Random random = new Random();
//        String path = "/Users/User/Downloads";
//        File[] fileList = new File(path).listFiles();
//        assert fileList != null;
//        File absf = fileList[random.nextInt(fileList.length)];
//        String absFile = absf.getAbsolutePath();
//        return absFile;
//    }
//
//    public static String generateStateOfCity() {
//        Random random = new Random();
//        String[] states = new String[]{"NC", "Ut", "Har", "Raj"};
//        String state = states[random.nextInt(states.length)];
//        String city ="";
//
//        switch (state) {
//            case "NC":
//                String[] citiesNC = {"De", "Gu", "No"};
//                city = citiesNC[random.nextInt(citiesNC.length)];
//                break;
//            case "Ut":
//                String[] citiesUt = {"Ag", "Lu", "Me"};
//                city = citiesUt[random.nextInt(citiesUt.length)];
//                break;
//            case "Har":
//                String[] citiesHar = {"Ka", "Pa"};
//                city = citiesHar[random.nextInt(citiesHar.length)];
//                break;
//            case "Raj":
//                String[] citiesRaj = {"Jaip", "Jais"};
//                city = citiesRaj[random.nextInt(citiesRaj.length)];
//                break;
//        }
//       return  state+" "+city;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(createNewStudenteWithFakeData());
//    }
//
}
