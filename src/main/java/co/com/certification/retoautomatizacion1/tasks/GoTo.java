package co.com.certification.retoautomatizacion1.tasks;

import co.com.certification.retoautomatizacion1.userinterface.GoToPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {

    private GoToPage goToPage;

    public static GoTo theForm() {

        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(goToPage.JOIN_TODAY));

    }
}
