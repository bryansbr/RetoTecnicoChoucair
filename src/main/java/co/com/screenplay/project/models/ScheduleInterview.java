package co.com.screenplay.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScheduleInterview {
    private String titleInterview;
    private String interviewer;
    private String interviewDate;
    private String interviewTime;
    private String interviewNotes;

    public ScheduleInterview() {
        this.titleInterview = "Hiring Interview";
        this.interviewer = "Peter Mac Anderson";
        this.interviewDate = "2024-16-09";
        this.interviewTime = "10:00 AM";
        this.interviewNotes = "James hiring interview.";
    }
}
