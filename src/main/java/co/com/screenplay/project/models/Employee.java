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
                "Beatriz",
                "Aurora",
                "Pinzon Solano",
                "Payroll Administrator",
                "beatriz.pinzon@aol.com",
                "7850253",
                "Master's Degree in Economics, Economist, Payroll Administrator",
                "Master in Economics with 3 years of experience in the stock market."
        ));

        return employees;
    }
}
