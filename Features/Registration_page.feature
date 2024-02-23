Feature: Parabank Register_Page feature

Scenario: Parabank Register_page Test Scenario

Given user is already on register Page
When  title of Register page is Parabank
Then user enters First Name 
Then user enters Last Name
Then user enters Address
Then user enters City	
Then user enters State	
Then user enters Zip Code	
Then user enters Phone #	
Then user enters SSN	
 
Then user enters Username	
Then user enters Password	
Then user enters Confirm
And click on Register button
And user navigate to Home page
And close the browser