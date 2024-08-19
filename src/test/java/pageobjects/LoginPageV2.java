package pageobjects;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

@Slf4j
public class LoginPageV2 extends BasePage {

    private static final ObjectMapper mapper = new ObjectMapper();

    @FindBy(css = "input[type='email']")
    private WebElementFacade emailBing;

    @FindBy(id = "idSIButton9")
    private WebElementFacade buttonNextUsername;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/div/div[2]/button")
    private WebElementFacade buttonNextYes;

    @FindBy(css = "input[type='password']")
    private WebElementFacade passBing;

    @FindBy(xpath = "//*[@id=\"sb_form_q\"]")
    private WebElementFacade searchbox;

    @FindBy(xpath = "//*[@id=\"sb_form_q\"]")
    private WebElementFacade searchbox2;

    public void inputAUsername(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        emailBing.sendKeys(BaseTest.getUserA());
        waitFor(ExpectedConditions.elementToBeClickable(buttonNextUsername));
        buttonNextUsername.click();
    }

    public void inputAPassword(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        passBing.typeAndEnter(BaseTest.getPswdA());

        try {
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        waitFor(ExpectedConditions.elementToBeClickable(buttonNextYes));
        buttonNextYes.click();
    }

    public void inputBUsername(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        emailBing.sendKeys(BaseTest.getUserB());
        waitFor(ExpectedConditions.elementToBeClickable(buttonNextUsername));
        buttonNextUsername.click();
    }

    public void inputBPassword(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        passBing.typeAndEnter(BaseTest.getPswdB());

        try {
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        waitFor(ExpectedConditions.elementToBeClickable(buttonNextYes));
        buttonNextYes.click();
    }

    public void inputCUsername(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        emailBing.sendKeys(BaseTest.getUserC());
        waitFor(ExpectedConditions.elementToBeClickable(buttonNextUsername));
        buttonNextUsername.click();
    }

    public void inputCPassword(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        passBing.typeAndEnter(BaseTest.getPswdC());

        try {
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        waitFor(ExpectedConditions.elementToBeClickable(buttonNextYes));
        buttonNextYes.click();
    }

    public void inputDUsername(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        emailBing.sendKeys(BaseTest.getUserD());
        waitFor(ExpectedConditions.elementToBeClickable(buttonNextUsername));
        buttonNextUsername.click();
    }

    public void inputDPassword(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        passBing.typeAndEnter(BaseTest.getPswdD());

        try {
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        waitFor(ExpectedConditions.elementToBeClickable(buttonNextYes));
        buttonNextYes.click();
    }

    public void inputEUsername(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        emailBing.sendKeys(BaseTest.getUserE());
        waitFor(ExpectedConditions.elementToBeClickable(buttonNextUsername));
        buttonNextUsername.click();
    }

    public void inputEPassword(){
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        passBing.typeAndEnter(BaseTest.getPswdE());

        try {
            await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        waitFor(ExpectedConditions.elementToBeClickable(buttonNextYes));
        buttonNextYes.click();
    }

    public void inputBingReward()
    {
        List<String> keyword = ListKeywordBingReward();
        log.info("Keyword Size : " + keyword);

        firstSearch(keyword.get(0));
        secondSearch(keyword);
    }

    public List<String> ListKeywordBingReward() {
        List<String> result = new ArrayList<>();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://random-word-api.herokuapp.com/word?number=20"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            JsonNode resp = mapper.readTree(response.body());
            result = mapper.readerForListOf(String.class).readValue(resp);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void firstSearch (String firstKeyword)  {
        try {
            await().pollDelay(5, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        searchbox.typeAndEnter(firstKeyword);
        try {
            await().pollDelay(1, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(300);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        try {
            await().pollDelay(5, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void secondSearch(List<String> keywords){
        for (String keyword : keywords)
        {
            waitFor(ExpectedConditions.visibilityOf(searchbox2));
            searchbox2.typeAndEnter(keyword);
            try {
                await().pollDelay(2, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
            } catch (Exception e){
                e.printStackTrace();
            }

            try {
                await().pollDelay(5, SECONDS).untilAsserted(() -> Assert.assertTrue(true));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
