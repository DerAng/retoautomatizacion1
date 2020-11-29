package co.com.certification.retoautomatizacion1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchMessagePage {

    public static final Target NAME_MESSAGE = Target.the("Message").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
