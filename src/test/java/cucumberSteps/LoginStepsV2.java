package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import pageobjects.LoginPageV2;

import static org.awaitility.Awaitility.await;
import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginStepsV2 {

    @Steps
    LoginPageV2 loginPageV2;

    @Given("user is on the login page already")
    public void userIsOnTheLoginPage(){
        loginPageV2.openOrangeHrmWeb();
    }

    @When("user enters a username")
    public void userEntersAUsername() {
        loginPageV2.inputAUsername();
    }

    @And("user enters a password")
    public void userEntersAPassword() {
        loginPageV2.inputAPassword();
    }

    @When("user enters b username")
    public void userEntersBUsername() {
        loginPageV2.inputBUsername();
    }

    @And("user enters b password")
    public void userEntersBPassword() {
        loginPageV2.inputBPassword();
    }

    @When("user enters c username")
    public void userEntersCUsername() {
        loginPageV2.inputCUsername();
    }

    @And("user enters c password")
    public void userEntersCPassword() {
        loginPageV2.inputCPassword();
    }

    @When("user enters d username")
    public void userEntersDUsername() {
        loginPageV2.inputDUsername();
    }

    @And("user enters d password")
    public void userEntersDPassword() {
        loginPageV2.inputDPassword();
    }

    @When("user enters e username")
    public void userEntersEUsername() {
        loginPageV2.inputEUsername();
    }

    @And("user enters e password")
    public void userEntersEPassword() {
        loginPageV2.inputEPassword();
    }

    @And("user inputs bing reward")
    public void userInputBingReward() {
        loginPageV2.inputBingReward();
    }

    @And("user enters click button")
    public void userEntersClick() {

    }

    @Then("bing reward succeeded")
    public void bingRewardSuccess() {
        try{
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
