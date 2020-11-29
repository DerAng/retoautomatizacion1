package co.com.certification.retoautomatizacion1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {


    public static final Target FIRST_NAME = Target.the("Name Fiel").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Name Fiel").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Name Fiel").located(By.id("email"));
    public static final Target MONTH = Target.the("Moth list").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Day List").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Year List").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button Next Location").located(By.xpath("//a[contains (@class,'btn btn-blue')]"));

    public static final Target NEXT_DEVICES = Target.the("Button Next Devices").located(By.xpath("//a[contains (@class,'btn btn-blue pull-right')]/span"));
    public static final Target LAST_STEP = Target.the("Button last Step").located(By.xpath("//a[contains (@class,'btn btn-blue pull-right')]/span"));

    public static final Target PASSWORD = Target.the("Field Password").located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the(" Field ConfirmPassword").located(By.id("confirmPassword"));

    public static final Target ACCEPT_TERMS = Target.the(" Accept Terms").located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY= Target.the(" Accept Terms").located(By.id("privacySetting"));

    public static final Target BUTTON_SETUP = Target.the("Button Setup").located(By.xpath("//a[contains (@class,'btn btn-blue')]/span"));


}
