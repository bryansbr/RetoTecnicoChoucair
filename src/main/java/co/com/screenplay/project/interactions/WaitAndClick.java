package co.com.screenplay.project.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class WaitAndClick implements Interaction {
    private final Target objective;

    public WaitAndClick(Target objective, Integer time) {
        this.objective = objective;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(objective, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(objective)
        );
    }

    public static WaitAndClick inTheField(Target objective, Integer time) {
        return Tasks.instrumented(WaitAndClick.class, objective, time);
    }
}
