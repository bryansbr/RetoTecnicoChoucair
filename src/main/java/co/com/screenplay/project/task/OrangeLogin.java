package co.com.screenplay.project.task;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.ui.OrangeLoginPage.*;

@Slf4j
@AllArgsConstructor
public class OrangeLogin implements Task {
    private String username;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BTN)
        );
    }

    public static OrangeLogin login(String username, String password) {
        return Tasks.instrumented(OrangeLogin.class, username, password);
    }
}
