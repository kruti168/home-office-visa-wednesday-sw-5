package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectReason;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyMessageNoVisaNeed;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement selectReasonWork;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement planningHealthCare;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue3;

    public void selectReasonForVisit(String reason) {
        Reporter.log("Select Reason Tourism" + selectReason.toString());
        clickOnElement(selectReason);
        CustomListener.test.log(Status.PASS, "Select Reason Tourism");
    }

    public void clickOnNextStepButton() {

        Reporter.log("Click on Continue" + clickContinue.toString());
        clickOnElement(clickContinue);
        CustomListener.test.log(Status.PASS, "Click on Continue");
    }

    public void verifyMessageNoVisaNeedToComeToUk() {

        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = getTextFromElement(verifyMessageNoVisaNeed);
        Assert.assertEquals(expectedMessage,actualMessage);
        Reporter.log("Verify You will not need a visa to come to the UK");
        CustomListener.test.log(Status.PASS,"You will not need a visa to come to the UK");
    }
    public void selectReasonForVisit1(String reason){

        Reporter.log("Click Reason Work,Academic and Business"+selectReasonWork.toString());
        clickOnElement(selectReasonWork);
        CustomListener.test.log(Status.PASS,"Click Reason Work,Academic and Business");
    }
    public void selectPlanningWorkHealthCareProfessional(){

        Reporter.log("Select have planning to work for 'Health and care professional"+planningHealthCare.toString());
        clickOnElement(planningHealthCare);
        CustomListener.test.log(Status.PASS,"Select have planning to work for 'Health and care professional");
    }
    public void clickNextStepButton(){

        Reporter.log("Click on continue Button"+ clickOnContinue3.toString());
        clickOnElement(clickOnContinue3);
        CustomListener.test.log(Status.PASS,"Click on Continue Button");
    }

}