package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {


    public SelectNationalityPage(){

        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy (xpath = "//select[@id='response']")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue;


    public void selectNationalityFromDropDown(String country){

        Reporter.log("Select Nationality From Dropdown" + selectNationality.toString());
        selectByVisibleTextFromDropDown(selectNationality,country);
        CustomListener.test.log(Status.PASS,"Select Nationality form dropdown");
    }
    public void clickNextStepButton(){

        Reporter.log("Click On Continue Button" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
        CustomListener.test.log(Status.PASS,"Click on Continue Button");
    }
}
