package StepDefinitions;

import Factory.DriverFactory;
import Pages.*;
import Util.GenericFunctions;

public class BaseSteps {

    public BasePages basePages = new BasePages(DriverFactory.getDriver());
    public NHSWelcomePage nhsWelcomePage = new NHSWelcomePage(DriverFactory.getDriver());
    public CountryPage countryPage = new CountryPage(DriverFactory.getDriver());
    public GPPracticePage gpPracticePage = new GPPracticePage(DriverFactory.getDriver());
    public DentalPracticePage dentalPracticePage = new DentalPracticePage(DriverFactory.getDriver());
    public DOBPage dobPage = new DOBPage(DriverFactory.getDriver());
    public PartnerPage partnerPage = new PartnerPage(DriverFactory.getDriver());
    public PartnerClaimPage partnerClaimPage = new PartnerClaimPage(DriverFactory.getDriver());
    public UnvCreditPage unvCreditPage = new UnvCreditPage(DriverFactory.getDriver());
    public JointUniCreditPage jointUniCreditPage = new JointUniCreditPage(DriverFactory.getDriver());
    public TakeHomePayPage takeHomePayPage = new TakeHomePayPage(DriverFactory.getDriver());
    public PregnantPage pregnantPage = new PregnantPage(DriverFactory.getDriver());
    public InjuryillnessPage injuryillnessPage = new InjuryillnessPage(DriverFactory.getDriver());
    public DiabetesPage diabetesPage = new DiabetesPage(DriverFactory.getDriver());
    public MedicationPage medicationPage = new MedicationPage(DriverFactory.getDriver());
    public MedicalConditionsPage medicalConditionsPage = new MedicalConditionsPage(DriverFactory.getDriver());
    public CareHomePage careHomePage = new CareHomePage(DriverFactory.getDriver());
    public LocalCouncilPayPage localCouncilPayPage = new LocalCouncilPayPage(DriverFactory.getDriver());
    public SavingsPage savingsPage = new SavingsPage(DriverFactory.getDriver());
    public GlaucomaPage glaucomaPage = new GlaucomaPage(DriverFactory.getDriver());
    public UniversalCreditDecision universalCreditDecision = new UniversalCreditDecision(DriverFactory.getDriver());
    public ClaimBenefits claimBenefits = new ClaimBenefits(DriverFactory.getDriver());
    public TaxCreditType taxCreditType = new TaxCreditType(DriverFactory.getDriver());
    public TaxCreditIncome taxCreditIncome = new TaxCreditIncome(DriverFactory.getDriver());
    public PensionCreditTypePage pensionCreditTypePage = new PensionCreditTypePage(DriverFactory.getDriver());
    public ESASupportPage esaSupportPage = new ESASupportPage(DriverFactory.getDriver());
    public JSASupportPage jsaSupportPage = new JSASupportPage(DriverFactory.getDriver());
    public ResultPage resultPage = new ResultPage(DriverFactory.getDriver());
    public GenericFunctions genericFunctions = new GenericFunctions(DriverFactory.getDriver());

}
