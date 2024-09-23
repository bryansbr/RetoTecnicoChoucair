package co.com.screenplay.project.task;

import co.com.screenplay.project.enums.Buttons;
import co.com.screenplay.project.interactions.WaitAndClick;
import co.com.screenplay.project.models.ScheduleInterview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.OrangeScheduleInterviewPage.*;

public class OrangeScheduleInterview implements Task {
    private final ScheduleInterview scheduleInterviewInfo;

    public OrangeScheduleInterview(ScheduleInterview scheduleInterviewInfo) {
        this.scheduleInterviewInfo = scheduleInterviewInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(scheduleInterviewInfo.getInterviewTitle()).into(INTERVIEW_TITLE),
                Enter.theValue(scheduleInterviewInfo.getInterviewer()).into(SEARCH_INTERVIEWER),
                WaitAndClick.inTheField(SELECT_INTERVIEWER, 10),
                Click.on(INTERVIEW_DATE),
                Enter.theValue(scheduleInterviewInfo.getInterviewDate()).into(INTERVIEW_DATE),
                Click.on(INTERVIEW_TIME),
                Enter.theValue(scheduleInterviewInfo.getInterviewTime()).into(INTERVIEW_TIME),
                Enter.theValue(scheduleInterviewInfo.getInterviewNotes()).into(INTERVIEW_NOTES),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(Buttons.MARK_INTERVIEW_PASSED_BTN.getTarget()),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(Buttons.OFFER_JOB_BTN.getTarget()),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(Buttons.HIRE_BTN.getTarget()),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(RECRUITMENT_OPTION)
        );
    }

    public static OrangeScheduleInterview enterScheduleInterviewInfo(ScheduleInterview interviewInfo) {
        return Tasks.instrumented(OrangeScheduleInterview.class, interviewInfo);
    }
}
