package co.com.screenplay.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String vacancy;
    private final String email;
    private final String contactNumber;
    private final String keywords;
    private final String notes;

    public static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(
                "Marshall",
                "Bruce",
                "Mathers",
                "Payroll Administrator",
                "marshall.mathers@gmail.com",
                "3217895603",
                "Industrial Engineer, Administrator, Payroll",
                "Payroll administrator, with more than 5 years of experience in several companies."
        ));

        return employees;
    }
}
