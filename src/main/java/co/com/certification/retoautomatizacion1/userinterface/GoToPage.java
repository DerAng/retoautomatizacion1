package co.com.certification.retoautomatizacion1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToPage {

public static final Target JOIN_TODAY = Target.the("button the allows us to go to the registration form").located(By.xpath("//a[contains (@class, 'unauthenticated-nav-bar__sign-up') and contains (text(),'Join Today')]"));

}
