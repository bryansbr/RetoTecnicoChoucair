package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OrangeScheduleInterviewPage {
    private OrangeScheduleInterviewPage() {}

    public static final Target INTERVIEW_TITLE = Target.the("Interview title").locatedBy("//label[normalize-space()='Interview Title']/following::input[1]");
    public static final Target SEARCH_INTERVIEWER = Target.the("Search interviewer").locatedBy("//input[@include-employees='onlyCurrent']");
    public static final Target SELECT_INTERVIEWER = Target.the("Select interviewer").locatedBy("(//div[@role='listbox']//span)[1]");
    public static final Target INTERVIEW_DATE = Target.the("Display interview date").locatedBy("//input[@placeholder='yyyy-dd-mm']");
    public static final Target INTERVIEW_TIME = Target.the("Interview time").locatedBy("//input[@placeholder='hh:mm']");
    public static final Target INTERVIEW_NOTES = Target.the("Interview notes").locatedBy("//textarea[@placeholder='Type here']");
    public static final Target RECRUITMENT_OPTION = Target.the("Recruitment option").locatedBy("//li[@class='oxd-main-menu-item-wrapper']//span[text()='Recruitment']");
}
