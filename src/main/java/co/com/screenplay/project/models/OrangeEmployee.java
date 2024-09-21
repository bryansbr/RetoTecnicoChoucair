package co.com.screenplay.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrangeEmployee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String vacancy;
    private String email;
    private String contactNumber;
    private String keywords;
    private String notes;

    public OrangeEmployee() {
        /*this.firstName = "Marshall";
        this.middleName = "Bruce";
        this.lastName = "Mathers";
        this.vacancy = "Software Engineer";
        this.email = "marshall.mathers@gmail.com";
        this.contactNumber = "3217895603";
        this.keywords = "Java, API, Rest, SpringBoot";
        this.notes = "I am a Backend Software Engineer with more than 5 years of experience in Java.";
        */
        // New
        this.firstName = "James";
        this.middleName = "David";
        this.lastName = "Rodriguez Rubio";
        this.vacancy = "Payroll Administrator";
        this.email = "james10.rodriguez@gmail.com";
        this.contactNumber = "3147809542";
        this.keywords = "Java, Automation, Test, Serenity BDD";
        this.notes = "I am an automation tester with more than 3 years of experience.";
    }
}
