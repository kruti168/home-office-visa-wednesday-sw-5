package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {

    public StartPage(){

        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement clickStartButton;



    public void clickOnStartButton(){
        Reporter.log("Click on Start Button" + clickStartButton.toString());
        clickOnElement(clickStartButton);
        CustomListener.test.log(Status.PASS,"Click on Start Button");
    }
}
