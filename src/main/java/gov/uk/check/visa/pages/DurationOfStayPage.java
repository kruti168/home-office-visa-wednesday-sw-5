package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

    public DurationOfStayPage(){

        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement stayLongerThansix;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue2;

    public void selectLengthOfStay(String lenghtofStay){

        Reporter.log("To Stay Longer Than Six Months"+ stayLongerThansix.toString());
        clickOnElement(stayLongerThansix);
        CustomListener.test.log(Status.PASS,"To Stay Longer Than Six Months");

    }
    public void clickOncontinue2(){
        Reporter.log("Click on Continue" +clickOnContinue2.toString());
        clickOnElement(clickOnContinue2);
        CustomListener.test.log(Status.PASS,"Click on Continue");
    }


}
