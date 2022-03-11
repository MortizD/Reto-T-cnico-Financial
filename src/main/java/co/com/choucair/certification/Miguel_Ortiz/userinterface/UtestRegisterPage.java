package co.com.choucair.certification.Miguel_Ortiz.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRSTNAME = Target.the("where do write the firstname").
            located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("where do write the lastname").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do write the email").
            located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("where do select the month").
            located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("where do select the day").
            located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("where do select the year").
            located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE = Target.the("where do write the language").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static final Target NEXTLOCATION_BUTTON = Target.the("button that shows us the location form to register").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_CITY = Target.the("where do write the city").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input"));

    public static final Target SELECT_CITY = Target.the("where do select the city").
            located(By.xpath("(//descendant::*[text()[contains(.,'Cali')]])[1]"));

    public static final Target INPUT_ZIPCODE = Target.the("where do write the zipcode").
            located(By.id("zip"));

    public static final Target NEXTDEVICES_BUTTON = Target.the("button that shows us the devices form to register").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target COMPUTER_BUTTON = Target.the("where do select the computer SO").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER = Target.the("where do select the computer SO").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));

    public static final Target VERSION_BUTTON = Target.the("where do select the version").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("where do select the version").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));

    public static final Target LANGUAGE_BUTTON = Target.the("where do select the language").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OSLANGUAGE = Target.the("where do select the language").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));

    public static final Target MOBILE_BUTTON = Target.the("where do select the mobile device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE = Target.the("where do select the mobile device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target MODEL_BUTTON = Target.the("where do select the model device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("where do select the model device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target SYSTEM_BUTTON = Target.the("where do select the system device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SYSTEM = Target.the("where do select the system device").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXTLASTSTEP_BUTTON = Target.the("button that shows us the form to register").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("where do write the password").
            located(By.id("password"));

    public static final Target INPUT_CONFIRMPASS = Target.the("where do write the comfirm password").
            located(By.id("confirmPassword"));

    public static final Target CHECK_TERMS = Target.the("check the acceptation for the terms of use").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACY = Target.the("check the acceptation for the privacity & security policy").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BUTTON = Target.the("button that complete the register").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
