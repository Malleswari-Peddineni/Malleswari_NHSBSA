package StepDefinitions;

import org.junit.Assert;
import Factory.DriverFactory;
import Util.IDCheck;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class NHSWelcomeSteps extends BaseSteps {
    @Given("I am a citizen of the UK having ID number {string}")
    public void i_am_a_citizen_of_the_uk(String number) {
        boolean IDNumber = IDCheck.isIDNumber(number);
        System.out.println(number);
        Assert.assertTrue(IDNumber);
    }

    @When("I put my circumstances into the Checker tool for (.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
    }

    @When("I put my circumstances into the Checker tool with when not claiming partner benefits (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_when_not_claiming_partner_benefits(String country, String GPPractice, String partner, String claimbenifits, String pregbirth, String injill, String diabetes, String medication, String carehome, String localcouncil) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
    }

    @When("I put my circumstances into the Checker tool with No partner (.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_No_partner(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
    }

    @When("I put my circumstances into the Checker tool with diabetes with medication (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_diabetes_with_medication(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay, String pregbirth, String injill, String diabetes, String medication, String carehome, String localcouncil) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
    }

    @When("I put my circumstances into the Checker tool with diabetes without medication (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_diabetes_without_medication(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay, String pregbirth, String injill, String diabetes, String medication, String mediconditions, String carehome, String localcouncil) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
    }

    @When("I put my circumstances into the Checker tool with diabetes without pay from local council (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_diabetes_without_pay_from_local_council(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay, String pregbirth, String injill, String diabetes, String medication, String mediconditions, String carehome, String localcouncil, String savings) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
        savingsPage.getSavingsDetails(savings);
    }

    @When("I put my circumstances into the Checker tool with diabetes without care home (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_diabetes_without_care_home(String country, String GPPractice, String partner, String claimbenifits, String jointunv, String takehomepay, String pregbirth, String injill, String diabetes, String medication, String mediconditions, String carehome, String savings) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Yes, we receive Universal Credit payments");
        jointUniCreditPage.getJointCreditStatus(jointunv);
        takeHomePayPage.getTakeHomePay(takehomepay);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        careHomePage.getCareHomeDetails(carehome);
        savingsPage.getSavingsDetails(savings);
    }

    @When("I put my circumstances into the Checker tool with diabetes without claiming any benefits (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_with_diabetes_without_claiming_any_benefits(String country, String GPPractice, String partner, String claimbenifits, String pregbirth, String injill, String diabetes, String medication, String carehome, String localcouncil) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicationPage.getMedicationDetails(medication);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
    }

    @When("I put my circumstances into the Checker tool without diabetes (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_without_diabetes(String country, String GPPractice, String partner, String claimbenifits, String pregbirth, String injill, String diabetes, String mediconditions, String glaucoma, String carehome, String localcouncil) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        glaucomaPage.getGlaucomaDetails(glaucoma);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
    }

    @When("I put my circumstances into the Checker tool without local council help and diabetes (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_without_local_council_help_and_diabetes(String country, String GPPractice, String partner, String claimbenifits, String pregbirth, String injill, String diabetes, String mediconditions, String glaucoma, String carehome, String localcouncil, String savings) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        glaucomaPage.getGlaucomaDetails(glaucoma);
        careHomePage.getCareHomeDetails(carehome);
        localCouncilPayPage.getLocalCouncilDetails(localcouncil);
        savingsPage.getSavingsDetails(savings);
    }

    @When("I put my circumstances into the Checker tool without care home and diabetes (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_without_care_home_and_diabetes(String country, String GPPractice, String partner, String claimbenifits, String pregbirth, String injill, String diabetes, String mediconditions, String glaucoma, String carehome, String savings) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        pregnantPage.getPregnantDetails(pregbirth);
        injuryillnessPage.getInjuryIllnessDetails(injill);
        diabetesPage.getDiabetesDetails(diabetes);
        medicalConditionsPage.getMedicalConditionsDetails(mediconditions);
        glaucomaPage.getGlaucomaDetails(glaucoma);
        careHomePage.getCareHomeDetails(carehome);
        savingsPage.getSavingsDetails(savings);
    }

    @When("I put my circumstances into the Checker tool live in (.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_live_in(String country) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
    }

    @When("^I put my circumstances into the Checker tool when Unviversal Payments not yet received (.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_when_Unviversal_Payments_not_yet_received(String country, String GPPractice, String partner, String claimbenifits) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Not yet, but we've applied");
        universalCreditDecision.getUnvCreditDecision();
        claimBenefits.getClaimBenefitsOptions("Tax credits", "Income Support", "Employment and Support Allowance (ESA)", "Jobseeker's Allowance (JSA)", "Pension Credit");//Jobseeker's Allowance (JSA),Income Support,Employment and Support Allowance (ESA)
    }

    @When("^I put my circumstances into the Checker tool when payment not received with Tax credit benefits (.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_when_payment_not_received_with_Tax_credit_benefits(String country, String GPPractice, String partner, String claimbenifits) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Not yet, but we've applied");
        universalCreditDecision.getUnvCreditDecision();
        claimBenefits.getClaimBenefitsOptions("Tax credits", "", "", "", "");//Jobseeker's Allowance (JSA),Income Support,Employment and Support Allowance (ESA)
        taxCreditType.getTaxCreditTypeDetails("Working Tax Credit and Child Tax Credit together");
        taxCreditIncome.getTaxCreditIncomeDetails("Yes");
    }

    @When("^I put my circumstances into the Checker tool when payment not received with ESA benefits (.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_when_payment_not_received_with_ESA_benefits(String country, String GPPractice, String partner, String claimbenifits) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Not yet, but we've applied");
        universalCreditDecision.getUnvCreditDecision();
        claimBenefits.getClaimBenefitsOptions("", "", "Employment and Support Allowance (ESA)", "", "");//Jobseeker's Allowance (JSA),Income Support,
        esaSupportPage.getESASupportDetails("Income-related ESA");
    }

    @When("^I put my circumstances into the Checker tool when payment not received with JSA benefits (.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_when_payment_not_received_with_JSA_benefits(String country, String GPPractice, String partner, String claimbenifits) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Not yet, but we've applied");
        universalCreditDecision.getUnvCreditDecision();
        claimBenefits.getClaimBenefitsOptions("", "", "", "Jobseeker's Allowance (JSA)", "");//,Income Support,
        jsaSupportPage.getJSASupportDetails("Income-based JSA");
    }

    @When("^I put my circumstances into the Checker tool when payment not received with Pension Credit benefits (.*),(.*),(.*),(.*)$")
    public void i_put_my_circumstances_into_the_checker_tool_when_payment_not_received_with_Pension_Credit_benefits(String country, String GPPractice, String partner, String claimbenifits) {
        DriverFactory.getDriver();
        basePages.acceptCookies();
        nhsWelcomePage.getPageTitle();
        countryPage.getCountriesList(country);
        gpPracticePage.getGPPractice(country, GPPractice);
        dentalPracticePage.getDentalPractice(country);
        dobPage.enterDOB("01", "10", "1990");
        partnerPage.getPartnerStatus(partner);
        partnerClaimPage.getClaimBenifitsStatus(claimbenifits);
        unvCreditPage.getPaidUnvCredit("Not yet, but we've applied");
        universalCreditDecision.getUnvCreditDecision();
        claimBenefits.getClaimBenefitsOptions("", "", "", "", "Pension Credit");
        pensionCreditTypePage.getPensionCreditTypeDetails("Guarantee Credit with Savings Credit");
    }

    @Then("I should get a result of whether I will get help or not (.*)$")
    public void i_should_get_a_result_of_whether_i_will_get_help_or_not(String scenarioname) throws IOException {
        resultPage.getResultDetails();
        genericFunctions.getFinalScreenshot(scenarioname);
    }
}