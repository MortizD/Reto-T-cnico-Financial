package co.com.choucair.certification.Miguel_Ortiz.tasks;

import co.com.choucair.certification.Miguel_Ortiz.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.Miguel_Ortiz.userinterface.UtestRegisterPage.*;

public class Register implements Task {

    private String strFirstname, strLastname, strEmail, strMonth, strDay, strYear, strLanguage, strCity, strZipcode, strComputer, strVersion, strOSLanguage,
            strMobile, strModel, strSystem, strPassword, strConfirmPass;

    public Register(String strFirstname, String strLastname, String strEmail, String strMonth, String strDay, String strYear,
                    String strLanguage, String strCity, String strZipcode, String strComputer, String strVersion,
                    String strOSLanguage, String strMobile, String strModel, String strSystem, String strPassword,
                    String strConfirmPass) {
        this.strFirstname = strFirstname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strZipcode = strZipcode;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strOSLanguage = strOSLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strSystem = strSystem;
        this.strPassword = strPassword;
        this.strConfirmPass = strConfirmPass;
    }

    public static Register onThePage(String strFirstname, String strLastname, String strEmail, String strMonth, String strDay, String strYear,
                                     String strLanguage, String strCity, String strZipcode, String strComputer, String strVersion,
                                     String strOSLanguage, String strMobile, String strModel, String strSystem, String strPassword,
                                     String strConfirmPass) {
        return Tasks.instrumented(Register.class, strFirstname, strLastname, strEmail, strMonth, strDay, strYear, strLanguage,
                strCity, strZipcode, strComputer, strVersion, strOSLanguage, strMobile, strModel, strSystem, strPassword,
                strConfirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstname).into(UtestRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastname).into(UtestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(SELECT_YEAR),
                Enter.theValue(strLanguage).into(UtestRegisterPage.INPUT_LANGUAGE)
        );

        actor.attemptsTo(Click.on(UtestRegisterPage.NEXTLOCATION_BUTTON),
                Enter.theValue(strCity).into(UtestRegisterPage.INPUT_CITY),
                Click.on(UtestRegisterPage.SELECT_CITY),
                Enter.theValue(strZipcode).into(UtestRegisterPage.INPUT_ZIPCODE)
        );

        actor.attemptsTo(Click.on(UtestRegisterPage.NEXTDEVICES_BUTTON),
                Click.on(COMPUTER_BUTTON),
                Enter.theValue(strComputer).into(UtestRegisterPage.INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(VERSION_BUTTON),
                Enter.theValue(strVersion).into(UtestRegisterPage.INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(LANGUAGE_BUTTON),
                Enter.theValue(strOSLanguage).into(UtestRegisterPage.INPUT_OSLANGUAGE).thenHit(Keys.ENTER),
                Click.on(MOBILE_BUTTON),
                Enter.theValue(strMobile).into(UtestRegisterPage.INPUT_MOBILE).thenHit(Keys.ENTER),
                Click.on(MODEL_BUTTON),
                Enter.theValue(strModel).into(UtestRegisterPage.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(SYSTEM_BUTTON),
                Enter.theValue(strSystem).into(UtestRegisterPage.INPUT_SYSTEM).thenHit(Keys.ENTER)
        );

        actor.attemptsTo(Click.on(UtestRegisterPage.NEXTLASTSTEP_BUTTON),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPass).into(UtestRegisterPage.INPUT_CONFIRMPASS),
                Click.on(UtestRegisterPage.CHECK_TERMS),
                Click.on(UtestRegisterPage.CHECK_PRIVACY)
        );

        actor.attemptsTo(Click.on(UtestRegisterPage.COMPLETE_BUTTON)
        );

    }

}
