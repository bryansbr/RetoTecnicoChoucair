package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.models.Employee;
import co.com.screenplay.project.models.ScheduleInterview;
import co.com.screenplay.project.questions.ValidateText;
import co.com.screenplay.project.tasks.OrangeAddEmployee;
import co.com.screenplay.project.tasks.OrangeScheduleInterview;
import co.com.screenplay.project.ui.OrangeVerifyHiringPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeAddEmployeeStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("agrega toda la información del empleado")
    public void addEmployeeData() {
        List<Employee> employees = Employee.createEmployees();
        List<ScheduleInterview> scheduleInterviewInfo = ScheduleInterview.interviewInfo();

        employees.forEach(employee ->
                theActorInTheSpotlight().attemptsTo(
                        OrangeAddEmployee.addEmployee(employee)
                )
        );

        scheduleInterviewInfo.forEach(interviewInfo ->
                theActorInTheSpotlight().attemptsTo(
                        OrangeScheduleInterview.enterScheduleInterviewInfo(interviewInfo)
                )
        );
    }

    @Then("debería visualizarse que el estado del empleado es contratado")
    public void verifyHiring() {
        List<Employee> employees = Employee.createEmployees();

        for (Employee employee : employees) {
            theActorInTheSpotlight().should(
                    GivenWhenThen.seeThat(
                            ValidateText.theText(OrangeVerifyHiringPage.jobTitle(employee.getVacancy())),
                            Matchers.is(true)
                    ),
                    GivenWhenThen.seeThat(
                            ValidateText.theText(OrangeVerifyHiringPage.employeeFullName(
                                    employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName()
                            )),
                            Matchers.is(true)
                    ),
                    GivenWhenThen.seeThat(
                            ValidateText.theText(OrangeVerifyHiringPage.hiringStatus("Hired")),
                            Matchers.is(true)
                    )
            );
        }
    }
}
