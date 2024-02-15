package org.example.ui.data;

import org.example.ui.entity.EmployeeEntity;

public class EmployeeEntityFaker extends FakerBase {
    //создали метод для инициализации свойств обьекта Employee фейковыми данными
    public static EmployeeEntity createNewEmployeeWithFakeData() {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName(faker.name().firstName());
        employee.setLastName(faker.name().lastName());
        employee.setAge(faker.number().randomDigit());
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().randomDigit());
        employee.setDepartment(faker.commerce().department());
        return employee;
    }
}