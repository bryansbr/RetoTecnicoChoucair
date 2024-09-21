package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.models.OrangeEmployee;
import co.com.screenplay.project.models.ScheduleInterview;
import co.com.screenplay.project.task.OrangeAddEmployee;
import co.com.screenplay.project.task.OrangeScheduleInterview;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeAddEmployeeStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("agrega toda la información del empleado")
    public void addEmployeeData() {
        theActorInTheSpotlight().attemptsTo(
                OrangeAddEmployee.addEmployee(new OrangeEmployee()),
                OrangeScheduleInterview.enterScheduleInterviewInfo(new ScheduleInterview())
        );
    }

    @Then("debería visualizarse que el estado del empleado es contratado")
    public void verifyHiring() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
