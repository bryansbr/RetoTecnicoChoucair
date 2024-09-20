package co.com.screenplay.project.hook;

import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;

import static co.com.screenplay.project.utils.Constants.URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoWebPage implements Task {
    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String urlPath = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(URL);
        actor.attemptsTo(Open.url(urlPath));
    }

    public static Performable browserUrl() {
        return instrumented(GoWebPage.class);
    }
}
