package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeVerifyHiringPage {
    private OrangeVerifyHiringPage() {}

    private static Target createTarget(String description, String value) {
        return Target.the(description).locatedBy("//div[text()='" + value + "']");
    }

    public static Target jobTitle(String jobTitle) {
        return createTarget("Job title", jobTitle);
    }

    public static Target employeeFullName(String employeeFullName) {
        return createTarget("Employee full name", employeeFullName);
    }

    public static Target hiringStatus(String hiringStatus) {
        return createTarget("Hiring status", hiringStatus);
    }
}

