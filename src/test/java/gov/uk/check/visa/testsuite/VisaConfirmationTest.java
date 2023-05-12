package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListener;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    DurationOfStayPage durationOfStayPage;
    ResultPage resultPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;



    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        durationOfStayPage = new DurationOfStayPage();
        resultPage = new ResultPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }
    @Test(groups = {"smoke","regression"})
    public void anAustralianComingToUKForTourism(){

        startPage.clickOnStartButton();
        selectNationalityPage.selectNationalityFromDropDown("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism");
        reasonForTravelPage.clickOnNextStepButton();
        reasonForTravelPage.verifyMessageNoVisaNeedToComeToUk();

    }
    @Test(groups = {"sanity","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){

        startPage.clickOnStartButton();
        selectNationalityPage.selectNationalityFromDropDown("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit1("Work, academic visit or business");
        reasonForTravelPage.clickOnNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickOncontinue2();
        reasonForTravelPage.selectPlanningWorkHealthCareProfessional();
        reasonForTravelPage.clickNextStepButton();
        resultPage.verifyPlanningToWorkHealthCareProfessional();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickOnStartButton();
        selectNationalityPage.selectNationalityFromDropDown("Colombia");
        selectNationalityPage.clickNextStepButton();
        familyImmigrationStatusPage.selectReasonForVisit2("Join partner or family for a long stay");
        familyImmigrationStatusPage.clickOnNextStepButton();

    }

}
