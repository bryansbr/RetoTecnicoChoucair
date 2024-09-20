package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeEmployeeUI {
    private OrangeEmployeeUI() {}

    public static final Target RECRUITMENT_OPTION = Target.the("Recruitment option").locatedBy("//li[@class='oxd-main-menu-item-wrapper']//span[text()='Recruitment']");
    public static final Target ADD_BTN = Target.the("Add button").locatedBy("//button[normalize-space()='Add']");
    public static final Target FIRST_NAME = Target.the("First name").locatedBy("//input[@name='firstName']");
    public static final Target MIDDLE_NAME = Target.the("Middle name").locatedBy("//input[@name='middleName']");
    public static final Target LAST_NAME = Target.the("Last name").locatedBy("//input[@name='lastName']");
    public static final Target DISPLAY_SELECT_VACANCY = Target.the("Display select vacancy").locatedBy("//div[@class='oxd-select-text oxd-select-text--active']");
    public static final Target SELECT_VACANCY = Target.the("Select vacancy").locatedBy("//div[@role='listbox']//span[text()='{0}']");
    public static final Target INPUTS = Target.the("Employee data inputs").locatedBy("//label[normalize-space()='{0}']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@placeholder='{1}']");
    public static final Target UPLOAD_FILE = Target.the("Upload file").locatedBy("//input[@type='file']");
    public static final Target NOTES = Target.the("Notes").locatedBy("//textarea[@placeholder='Type here']");
    public static final Target CHECK_CONSENT = Target.the("Consent to keep data").locatedBy(".oxd-checkbox-input.oxd-checkbox-input--active");
    public static final Target SAVE_BTN = Target.the("Save button").locatedBy("//button[normalize-space()='Save']");
    public static final Target SHORT_LIST_BTN = Target.the("Shortlist button").locatedBy("//button[normalize-space()='Shortlist']");
}
