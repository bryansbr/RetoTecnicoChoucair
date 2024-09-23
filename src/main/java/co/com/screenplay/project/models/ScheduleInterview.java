package co.com.screenplay.project.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class ScheduleInterview {
    private final String interviewTitle;
    private final String interviewer;
    private final String interviewDate;
    private final String interviewTime;
    private final String interviewNotes;

    public static List<ScheduleInterview> interviewInfo() {
        List<ScheduleInterview> interviewInfo = new ArrayList<>();

        interviewInfo.add(new ScheduleInterview(
                "Hiring Interview",
                "thien akhil user",
                "2024-24-09",
                "10:00 AM",
                "Interview for the position of Payroll Administrator"
        ));

        return interviewInfo;
    }
}
