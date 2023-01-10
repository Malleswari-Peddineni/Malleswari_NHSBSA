Feature: NHS Online Services
@WithPartner
  Scenario Outline: Verify user is eligible for nhs costs online service
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool for <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | scenarioname                            |
      | England | Yes        | Yes     | Yes           | Yes      | Yes         | ResultClaimingQualifyingUniversalCredit |
@NotClaimingPartnerBenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when not claiming partner benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with when not claiming partner benefits <country>,<GPPractice>,<partner>,<claimbenifits>,<pregbirth>,<injill>,<diabetes>,<medication>,<carehome>,<localcouncil>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | pregbirth | injill | diabetes | medication | carehome | localcouncil | scenarioname              |
      | England | Yes        | Yes     | No            | Yes       | Yes    | Yes      | Yes        | Yes      | Yes          | ResultCouncilHelpCareHome |
@NoPartner
  Scenario Outline: Verify user is eligible for nhs costs online service when No Partner
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with No partner <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | scenarioname                |
      | England | Yes        | No      | Yes           | Yes      | Yes         | ResultClaimingWithNoPartner |
@DiabetesWithMedication
  Scenario Outline: Verify user is eligible for nhs costs online service when diabetes with medication
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with diabetes with medication <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>,<pregbirth>,<injill>,<diabetes>,<medication>,<carehome>,<localcouncil>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | pregbirth | injill | diabetes | medication | carehome | localcouncil | scenarioname                        |
      | England | Yes        | No      | Yes           | Yes      | No          | Yes       | Yes    | Yes      | Yes        | Yes      | Yes          | ResultMedicationCouncilHelpCareHome |
@DiabetesWithOutMedication
  Scenario Outline: Verify user is eligible for nhs costs online service when diabetes without medication
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with diabetes without medication <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>,<pregbirth>,<injill>,<diabetes>,<medication>,<mediconditions>,<carehome>,<localcouncil>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | pregbirth | injill | diabetes | medication | mediconditions | carehome | localcouncil | scenarioname              |
      | England | Yes        | No      | Yes           | Yes      | No          | Yes       | Yes    | Yes      | No         | No             | Yes      | Yes          | DiabetesWithoutMedication |
@DiabetesWithoutLocalHelp
  Scenario Outline: Verify user is eligible for nhs costs online service when diabetes without pay from local council
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with diabetes without pay from local council <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>,<pregbirth>,<injill>,<diabetes>,<medication>,<mediconditions>,<carehome>,<localcouncil>,<savings>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | pregbirth | injill | diabetes | medication | mediconditions | carehome | localcouncil | savings | scenarioname             |
      | England | Yes        | No      | Yes           | Yes      | No          | Yes       | Yes    | Yes      | No         | No             | Yes      | No           | No      | DiabetesWithoutLocalHelp |
@DiabetesWithoutCarehome
  Scenario Outline: Verify user is eligible for nhs costs online service when diabetes without care home
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with diabetes without care home <country>,<GPPractice>,<partner>,<claimbenifits>,<jointunv>,<takehomepay>,<pregbirth>,<injill>,<diabetes>,<medication>,<mediconditions>,<carehome>,<savings>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | jointunv | takehomepay | pregbirth | injill | diabetes | medication | mediconditions | carehome | savings | scenarioname            |
      | England | Yes        | No      | Yes           | Yes      | No          | Yes       | Yes    | Yes      | No         | No             | No       | Yes     | DiabetesWithoutCareHome |
@DiabetesWithoutCalimingBenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when diabetes without claiming any benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool with diabetes without claiming any benefits <country>,<GPPractice>,<partner>,<claimbenifits>,<pregbirth>,<injill>,<diabetes>,<medication>,<carehome>,<localcouncil>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | pregbirth | injill | diabetes | medication | carehome | localcouncil | scenarioname                    |
      | England | Yes        | No      | NO            | Yes       | Yes    | Yes      | Yes        | Yes      | Yes          | DiabetesWithoutClaimingBenefits |
@WithoutDiabetes
  Scenario Outline: Verify user is eligible for nhs costs online service without diabetes
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool without diabetes <country>,<GPPractice>,<partner>,<claimbenifits>,<pregbirth>,<injill>,<diabetes>,<mediconditions>,<glaucoma>,<carehome>,<localcouncil>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | pregbirth | injill | diabetes | mediconditions | glaucoma | carehome | localcouncil | scenarioname    |
      | England | Yes        | No      | NO            | Yes       | Yes    | No       | Yes            | Yes      | Yes      | Yes          | WithoutDiabetes |
@withoutDiabetesandLocalHelp
  Scenario Outline: Verify user is eligible for nhs costs online service without diabetes and local council pay
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool without local council help and diabetes <country>,<GPPractice>,<partner>,<claimbenifits>,<pregbirth>,<injill>,<diabetes>,<mediconditions>,<glaucoma>,<carehome>,<localcouncil>,<savings>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | pregbirth | injill | diabetes | mediconditions | glaucoma | carehome | localcouncil | savings | scenarioname                |
      | England | Yes        | No      | NO            | Yes       | Yes    | No       | Yes            | Yes      | Yes      | No           | No      | WithoutDiabetesAndLocalHelp |
@WithoutCarehomeAndDiabetes
  Scenario Outline: Verify user is eligible for nhs costs online service without diabetes and care home
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool without care home and diabetes <country>,<GPPractice>,<partner>,<claimbenifits>,<pregbirth>,<injill>,<diabetes>,<mediconditions>,<glaucoma>,<carehome>,<savings>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | pregbirth | injill | diabetes | mediconditions | glaucoma | carehome | savings | scenarioname               |
      | England | Yes        | No      | NO            | Yes       | Yes    | No       | Yes            | Yes      | No       | Yes     | WithoutDiabetesAndCareHome |
@NoServiceInNorthernIreland
  Scenario Outline: Verify user is eligible for nhs costs online service when line in Northern Ireland
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool live in <country>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country          | scenarioname               |
      | Northern Ireland | NoServiceInNorthernIreland |
@UnvPaymentsNotReceived
  Scenario Outline: Verify user is eligible for nhs costs online service when Unviversal Credit Payments Not Yet Received
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool when Unviversal Payments not yet received <country>,<GPPractice>,<partner>,<claimbenifits>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | scenarioname                     |
      | England | Yes        | Yes     | Yes           | UnviversalPaymentsNotYetReceived |
@Taxcreditbenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when Payment Not received with Tax credits benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool when payment not received with Tax credit benefits <country>,<GPPractice>,<partner>,<claimbenifits>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | scenarioname      |
      | England | Yes        | Yes     | Yes           | Taxcreditbenefits |
@ESAbenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when Payment Not received with ESA benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool when payment not received with ESA benefits <country>,<GPPractice>,<partner>,<claimbenifits>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | scenarioname |
      | England | Yes        | Yes     | Yes           | ESAbenefits  |
@JSAbenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when Payment Not received with JSA benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool when payment not received with JSA benefits <country>,<GPPractice>,<partner>,<claimbenifits>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | scenarioname |
      | England | Yes        | Yes     | Yes           | JSAbenefits  |
 @PensionCreditbenefits
  Scenario Outline: Verify user is eligible for nhs costs online service when Payment Not received with Pension Credit benefits
    Given I am a citizen of the UK having ID number "ABC123456"
    When I put my circumstances into the Checker tool when payment not received with Pension Credit benefits <country>,<GPPractice>,<partner>,<claimbenifits>
    Then I should get a result of whether I will get help or not <scenarioname>

    Examples:
      | country | GPPractice | partner | claimbenifits | scenarioname          |
      | England | Yes        | Yes     | Yes           | PensionCreditbenefits |
