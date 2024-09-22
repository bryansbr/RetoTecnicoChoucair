package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeVerifyHiringPage {
    public static final Target JOB_TITLE = Target.the("Job title").locatedBy("//div[text()='Payroll Administrator']");
    public static final Target EMPLOYEE_NAME = Target.the("Employee name").locatedBy("//div[text()='James David Rodriguez Rubio']");
    public static final Target HIRING_STATUS = Target.the("Hiring status").locatedBy("//div[text()='Hired']");
}
