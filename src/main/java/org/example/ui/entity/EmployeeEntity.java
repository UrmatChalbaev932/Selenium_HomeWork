package org.example.ui.entity;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeEntity {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int salary;
    private String department;

    //cоздали метод создающий список сотрудников
    public static ArrayList<EmployeeEntity> getEmployeesFromTable(WebDriver driver) {
        //создали пустой лист для заполнения данными из строк
        ArrayList<EmployeeEntity> employees = new ArrayList<>();
        //создали лист для хранения строк
        List<WebElement> rows = driver.findElements(By.cssSelector(".ReactTable  .rt-tr-group")); //извлекаем строки по отдельности
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td")); //извлекаем данные из каждой строки
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
            String department = cells.get(5).getText();


            //проверка если строка пустое то мы не инициализируем свойства обьекта пустыми данными
            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() || salaryText.isEmpty() || department.isEmpty()) {
                continue;
            }

            int age = Integer.parseInt(ageText);
            int salary = Integer.parseInt(salaryText);

            employees.add(new EmployeeEntity(firstName, lastName, age, email, salary, department));
        }
        return employees;
    }
}
