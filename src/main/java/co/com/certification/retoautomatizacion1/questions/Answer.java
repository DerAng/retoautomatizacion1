package co.com.certification.retoautomatizacion1.questions;

import co.com.certification.retoautomatizacion1.userinterface.SearchMessagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String message;

    public Answer(String message) {
        this.message = message;
    }


    public static Answer toThe(String message) {

        return new Answer(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameMessage= Text.of(SearchMessagePage.NAME_MESSAGE).viewedBy(actor).asString();

        if (nameMessage.equals(message)){
            result =true;
        }
        else{
            result =false;
        }

        return result;
    }
}
