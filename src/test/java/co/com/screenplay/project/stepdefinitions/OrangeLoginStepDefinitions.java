package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.questions.ValidateText;
import co.com.screenplay.project.task.OrangeLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.ui.OrangeLoginUI.LOGIN_ERROR_MSG;
import static co.com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeLoginStepDefinitions {
    private static EnvironmentVariables environmentVariables;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa las credenciales correctas")
    public void enterValidCredentials() {
        String username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USERNAME);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                OrangeLogin.login(username, password)
        );
    }

    @Then("debería visualizar el título de la página")
    public void validatePageTitle() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(PAGE_TITLE)
                )
        );
    }

    @When("ingresa credenciales inválidas")
    public void enterWrongCredentials() {
        String username = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USERNAME);
        String password = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(INVALID_PASSWORD);
        theActorCalled(ACTOR).attemptsTo(
                OrangeLogin.login(username, password)
        );
    }
    @Then("debería visualizar un mensaje error")
    public void validateLoginErrorMessage() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ValidateText.validateText(LOGIN_ERROR_MSG), Matchers.is(true)
                ));
    }
}
