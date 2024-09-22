package co.com.screenplay.project.task;

import co.com.screenplay.project.interactions.WaitAndClick;
import co.com.screenplay.project.models.ScheduleInterview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.OrangeScheduleInterviewPage.*;

public class OrangeScheduleInterview implements Task {
    private final String titleInterview;
    private final String interviewer;
    private final String interviewDate;
    private final String interviewTime;
    private final String interviewNotes;

    public OrangeScheduleInterview(ScheduleInterview interviewInfo) {
        super();
        this.titleInterview = interviewInfo.getTitleInterview();
        this.interviewer = interviewInfo.getInterviewer();
        this.interviewDate = interviewInfo.getInterviewDate();
        this.interviewTime = interviewInfo.getInterviewTime();
        this.interviewNotes = interviewInfo.getInterviewNotes();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(titleInterview).into(INTERVIEW_TITLE),
                Enter.theValue(interviewer).into(SEARCH_INTERVIEWER),
                WaitAndClick.inTheField(SELECT_INTERVIEWER, 10),
                Click.on(INTERVIEW_DATE),
                Enter.theValue(interviewDate).into(INTERVIEW_DATE),
                Click.on(INTERVIEW_TIME),
                Enter.theValue(interviewTime).into(INTERVIEW_TIME),
                Enter.theValue(interviewNotes).into(INTERVIEW_NOTES),
                Click.on(SAVE_BTN),
                Click.on(MARK_INTERVIEW_PASSED_BTN),
                Click.on(SAVE_BTN),
                Click.on(OFFER_JOB_BTN),
                Click.on(SAVE_BTN),
                Click.on(HIRE_BTN),
                Click.on(SAVE_BTN),
                Click.on(RECRUITMENT_OPTION)
        );
    }

    public static OrangeScheduleInterview enterScheduleInterviewInfo(ScheduleInterview interviewInfo) {
        return Tasks.instrumented(OrangeScheduleInterview.class, interviewInfo);
    }
}
