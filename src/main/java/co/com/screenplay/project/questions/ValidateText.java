package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;

public class ValidateText implements Question<Boolean> {
    private final Target target;
    private final Matcher matcher;

    public ValidateText(Target target, Matcher matcher) {
        super();
        this.target = target;
        this.matcher = matcher;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, matcher).forNoMoreThan(10).seconds());
        return true;
    }

    public static ValidateText validateText(Target target) {
        return new ValidateText(target, WebElementStateMatchers.isVisible());
    }
}
