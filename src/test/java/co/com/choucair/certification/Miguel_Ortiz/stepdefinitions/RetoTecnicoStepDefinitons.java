package co.com.choucair.certification.Miguel_Ortiz.stepdefinitions;

import co.com.choucair.certification.Miguel_Ortiz.model.UtestData;
import co.com.choucair.certification.Miguel_Ortiz.tasks.OpenUp;
import co.com.choucair.certification.Miguel_Ortiz.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitons {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Miguel wants to register in Utest\\.com$")
    public void thanMiguelWantsToRegisterInUtestCom(List<UtestData> UtestData)
            throws Exception {
        OnStage.theActorCalled("Miguel").wasAbleTo(OpenUp.thePage(),
                Register.onThePage(
                        UtestData.get(0).getStrFirstname(),
                        UtestData.get(0).getStrLastname(),
                        UtestData.get(0).getStrEmail(),
                        UtestData.get(0).getStrMonth(),
                        UtestData.get(0).getStrDay(),
                        UtestData.get(0).getStrYear(),
                        UtestData.get(0).getStrLanguage(),
                        UtestData.get(0).getStrCity(),
                        UtestData.get(0).getStrZipcode(),
                        UtestData.get(0).getStrComputer(),
                        UtestData.get(0).getStrVersion(),
                        UtestData.get(0).getStrOSLanguage(),
                        UtestData.get(0).getStrMobile(),
                        UtestData.get(0).getStrModel(),
                        UtestData.get(0).getStrSystem(),
                        UtestData.get(0).getStrPassword(),
                        UtestData.get(0).getStrConfirmPass()
                        ));
    }

    @When("^he search the Register option in Utest\\.com platform$")
    public void heSearchTheRegisterOptionInUtestComPlatform() {
    }

    @Then("^he finds the register option with the necesary fields to access\\.$")
    public void heFindsTheRegisterOptionWithTheNecesaryFieldsToAccess() {

    }

}
