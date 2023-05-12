package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {


    public FamilyImmigrationStatusPage(){

        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement selectReason;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnNext;

    public void selectReasonForVisit2(String reason){

        Reporter.log("Click on Join partner visa" + selectReason);
        clickOnElement(selectReason);
        CustomListener.test.log(Status.PASS,"Click on join parter visa");
    }
    public void clickOnNextStepButton(){

        Reporter.log("Click on next Button");
        clickOnElement(clickOnNext);
        CustomListener.test.log(Status.PASS,"Click on Next step");
    }
}
