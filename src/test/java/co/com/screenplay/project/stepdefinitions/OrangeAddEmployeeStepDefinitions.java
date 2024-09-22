package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.models.AddEmployee;
import co.com.screenplay.project.models.ScheduleInterview;
import co.com.screenplay.project.questions.ValidateText;
import co.com.screenplay.project.task.OrangeAddEmployee;
import co.com.screenplay.project.task.OrangeScheduleInterview;
import co.com.screenplay.project.ui.OrangeVerifyHiringPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeAddEmployeeStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("agrega toda la información del empleado")
    public void addEmployeeData() {
        theActorInTheSpotlight().attemptsTo(
                OrangeAddEmployee.addEmployee(new AddEmployee()),
                OrangeScheduleInterview.enterScheduleInterviewInfo(new ScheduleInterview())
        );
    }

    @Then("debería visualizarse que el estado del empleado es contratado")
    public void verifyHiring() {
        Target[] targets = {
                OrangeVerifyHiringPage.JOB_TITLE,
                OrangeVerifyHiringPage.EMPLOYEE_NAME,
                OrangeVerifyHiringPage.HIRING_STATUS
        };

        for (Target target : targets) {
            theActorInTheSpotlight().should(
                    GivenWhenThen.seeThat(ValidateText.theText(target), Matchers.is(true))
            );
        }
    }
}
