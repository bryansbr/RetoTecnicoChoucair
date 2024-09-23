package co.com.screenplay.project.task;

import co.com.screenplay.project.enums.Buttons;
import co.com.screenplay.project.models.Employee;
import co.com.screenplay.project.utils.UploadFiles;
import co.com.screenplay.project.utils.Files;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.OrangeAddEmployeePage.*;

public class OrangeAddEmployee implements Task {
    private final Employee employee;

    public OrangeAddEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECRUITMENT_OPTION),
                Click.on(Buttons.ADD_BTN.getTarget()),
                Enter.theValue(employee.getFirstName()).into(FIRST_NAME),
                Enter.theValue(employee.getMiddleName()).into(MIDDLE_NAME),
                Enter.theValue(employee.getLastName()).into(LAST_NAME),
                Click.on(DISPLAY_SELECT_VACANCY),
                Click.on(SELECT_VACANCY.of(employee.getVacancy())),
                Enter.theValue(employee.getEmail()).into(INPUTS.of("Email", "Type here")),
                Enter.theValue(employee.getContactNumber()).into(INPUTS.of("Contact Number", "Type here"))
        );

        UploadFiles.uploadFile(
                actor, Files.getFilePath("CV_Resume.pdf"), String.valueOf(UPLOAD_FILE.getCssOrXPathSelector())
        );

        actor.attemptsTo(
                Enter.theValue(employee.getKeywords()).into(INPUTS.of("Keywords", "Enter comma seperated words...")),
                Enter.theValue(employee.getNotes()).into(NOTES),
                Click.on(CHECK_CONSENT),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(Buttons.SHORTLIST_BTN.getTarget()),
                Click.on(Buttons.SAVE_BTN.getTarget()),
                Click.on(Buttons.SCHEDULE_INTERVIEW.getTarget())
        );
    }

    public static OrangeAddEmployee addEmployee(Employee employee) {
        return Tasks.instrumented(OrangeAddEmployee.class, employee);
    }
}
