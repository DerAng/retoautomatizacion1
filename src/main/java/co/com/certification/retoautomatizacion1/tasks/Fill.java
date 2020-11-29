package co.com.certification.retoautomatizacion1.tasks;

import co.com.certification.retoautomatizacion1.model.User;
import co.com.certification.retoautomatizacion1.userinterface.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Fill implements Task {


    private User user;

    public Fill(User user) {
        this.user = user;
    }

    public static Fill  theForm(User user) {

       return Tasks.instrumented(Fill.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(user.getFirstName()).into(FillPage.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(FillPage.LAST_NAME),
                Enter.theValue(user.getEmail()).into(FillPage.EMAIL),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[0]).from(FillPage.MONTH),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[1]).from(FillPage.DAY),
                SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[2]).from(FillPage.YEAR),
                Click.on(FillPage.BUTTON_NEXT_LOCATION),
                Click.on(FillPage.NEXT_DEVICES),
                Click.on(FillPage.LAST_STEP),
                Enter.theValue(user.getPassword()).into(FillPage.PASSWORD),
                Enter.theValue(user.getConfirmPassword()).into(FillPage.CONFIRMPASSWORD),
                Click.on(FillPage.ACCEPT_TERMS),
                Click.on(FillPage.ACCEPT_PRIVACY),
                Click.on(FillPage.BUTTON_SETUP)

        );

    }
}
