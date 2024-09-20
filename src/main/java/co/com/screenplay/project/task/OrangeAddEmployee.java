package co.com.screenplay.project.task;

import co.com.screenplay.project.models.OrangeEmployee;
import co.com.screenplay.project.utils.UploadFiles;
import co.com.screenplay.project.utils.Files;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.screenplay.project.ui.OrangeEmployeeUI.*;

public class OrangeAddEmployee implements Task {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final Target selectVacancy;
    private final String email;
    private final String contactNumber;
    private final String keywords;
    private final String notes;

    public OrangeAddEmployee(OrangeEmployee employee) {
        super();
        this.firstName = employee.getFirstName();
        this.middleName = employee.getMiddleName();
        this.lastName = employee.getLastName();
        String vacancy = employee.getVacancy();
        this.selectVacancy = SELECT_VACANCY.of(vacancy);
        this.email = employee.getEmail();
        this.contactNumber = employee.getContactNumber();
        this.keywords = employee.getKeywords();
        this.notes = employee.getNotes();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECRUITMENT_OPTION),
                Click.on(ADD_BTN),
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(middleName).into(MIDDLE_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Click.on(DISPLAY_SELECT_VACANCY),
                Click.on(selectVacancy),
                Enter.theValue(email).into(INPUTS.of("Email", "Type here")),
                Enter.theValue(contactNumber).into(INPUTS.of("Contact Number", "Type here"))
        );
        UploadFiles.uploadFile(
                actor, Files.getFilePath("CV_Resume.pdf"), String.valueOf(UPLOAD_FILE.getCssOrXPathSelector())
        );
        actor.attemptsTo(
                Enter.theValue(keywords).into(INPUTS.of("Keywords", "Enter comma seperated words...")),
                Enter.theValue(notes).into(NOTES),
                Click.on(CHECK_CONSENT),
                Click.on(SAVE_BTN),
                Click.on(SHORT_LIST_BTN),
                Enter.theValue(notes).into(NOTES),
                Click.on(SAVE_BTN)
        );
    }

    public static OrangeAddEmployee addEmployee(OrangeEmployee employee) {
        return Tasks.instrumented(OrangeAddEmployee.class, employee);
    }
}
