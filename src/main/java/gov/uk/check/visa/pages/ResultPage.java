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

public class ResultPage extends Utility {

    public ResultPage(){

        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyYouNeedVisa;




    @CacheLookup
    @FindBy(xpath = "")
    WebElement verifyYouNeedvisa1;

    public void verifyPlanningToWorkHealthCareProfessional(){

        String expectedMessage = "You need a visa to work in health and care";
        String actualMessage = getTextFromElement(verifyYouNeedVisa);
        Assert.assertEquals(expectedMessage,actualMessage);
        Reporter.log("Verify Planning to work for health and care professional");
        CustomListener.test.log(Status.PASS,"Verify Planning to work for health and care professional");
    }
//    public void confirmResultMessage(String expectedMessage){
//        String expectedMessage1 = "";
//        String actualMessage = getTextFromElement(verifyYouNeedvisa1);
//        Assert.assertTrue(expectedMessage1,actualMessage);
//    }


}
