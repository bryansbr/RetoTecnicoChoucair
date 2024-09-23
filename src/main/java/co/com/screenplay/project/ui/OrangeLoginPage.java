package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeLoginPage {
    private OrangeLoginPage() {}

    public static final Target USERNAME = Target.the("Username").locatedBy("//input[@name='username']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@name='password']");
    public static final Target LOGIN_BTN = Target.the("Login button").locatedBy("//button[@type='submit']");
    public static final Target LOGIN_ERROR_MSG = Target.the("Login error").locatedBy("//div[@class='oxd-alert-content oxd-alert-content--error']");
}
