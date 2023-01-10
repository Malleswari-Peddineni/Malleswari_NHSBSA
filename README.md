**Project Name : NHS Online Services**

**About Project-**
The NHS Business Services Authority is an Arm’s Length Body of the Department of Health and Social Care. We manage over £35 billion of NHS spend annually, delivering a range of national services to NHS organisations, NHS contractors, patients and the public. Our purpose is to be a catalyst for better health and our vision is to be the delivery partner of choice for the NHS.

Although most NHS treatment is free, there are still some costs you might need to pay, for example, to get your prescriptions or to travel to your hospital appointment.
You could be entitled to help with these costs depending on your circumstances.

Based on circumstances what kind of help users will get for paying NHS costs.

I have created the Automation test suite for this ticket using BDD approach and implemented the framework using Selenium Webdriver and Cucumber with Java as programming language.

I have checkedin my code to git.

**Tools and Libraries**
This project using 2 main tools, Selenium and Cucumber.
On the other hand, I have used some of the tools that support this framework. 
The complete list of dependencies are listed in the pom.xml file.

**Requirements**

Java Development Kit

Maven

WebDriver

Cucumber

**About Framework**

This framework contains one Featur file and 17 Scenario's with coverage

**Directory structure:**

NHSBSATest

src/main/java/Packages-Factory,Pages,Util

src/test/java/Packages-runner,StepDefinitions

test/resources/Packages-config,features

**Steps to run at your system:**

Clone the repository from git

Open the project using any Java IDE

Running the tests in Browser 
Tests are currently running in firefox browser. 
To run tests in chrome browser,change browser in config.properties file to browser = chrome

Run the tests in command line

mvn clean install

mvn clean test > for running all tests

mvn test -Dcucumber.options="--tags @tagName" > To run specific test using cucumber tags

Test Reports:

In Console - Cucumber Reports

In test output - Extent Reports

In test-output - Html Reports,Spark Report

Screenshots:

In test-output - screenshots 
