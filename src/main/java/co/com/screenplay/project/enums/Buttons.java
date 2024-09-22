package co.com.screenplay.project.enums;

import net.serenitybdd.screenplay.targets.Target;

public enum Buttons {
    ADD_BTN("Add"),
    SAVE_BTN("Save"),
    SHORTLIST_BTN("Shortlist"),
    SCHEDULE_INTERVIEW("Schedule Interview"),
    MARK_INTERVIEW_PASSED_BTN("Mark Interview Passed"),
    OFFER_JOB_BTN("Offer Job"),
    HIRE_BTN("Hire");

    private final String buttonName;

    Buttons(String buttonName) {
        this.buttonName = buttonName;
    }

    public Target getTarget() {
        return Target.the(buttonName + " button").locatedBy("//button[normalize-space()='" + buttonName + "']");
    }
}
