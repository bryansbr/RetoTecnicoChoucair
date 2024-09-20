package co.com.screenplay.project.stepdefinitions.hook;

import co.com.screenplay.project.hook.GoWebPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constants.TIME;
import static co.com.screenplay.project.utils.Constants.PAGE_TITLE;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} abre el sitio web OrangeHRM")
    public void goToOrangePage(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                GoWebPage.browserUrl()
        );
        waiting(TIME);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(PAGE_TITLE)
                )
        );
    }
}
