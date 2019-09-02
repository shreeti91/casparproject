#Author: Shreeti Lal

@tag
Feature: Caspar Automation Task
  This feature logs in with Admin user and creates Patient's profile
	
	
@tag1	
Scenario Outline: Login with Admin User
		Given the user launches login page "<URL>"
    When the user enters "<Caspar_ID>" and "<Password>"
    Then he clicks on Login Button
		And is able to see Add Patient button
	
	 Examples: 
      | URL  															 | Caspar_ID | Password  |
      |https:\\​​beta.caspar-health.com\en\  | IXE0865   | 78350619  |
      
@tag2
  Scenario: Add patient
  	Given user is on homepage
  	When user clicks on Add Patient button
  	Then the page for adding patient information is opened
  	And the user enters patient information
  	And clicks on Save Button
  	And the patient details are added successfully
  	And logout the user
  	And the user launches login page "URL"
    When the user enters "newPatient" and "newTempPwd"
    Then he clicks on Login Button
  	And able to click on terms and conditions and see it
  	And able to click on release of medical information and see it