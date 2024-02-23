Feature: Account Overview functionality of Parabank 
Scenario: Check Account Overview dashboard 

Given    User already on  parabank Dashboard
When     Click on account overview link
And      click on particular account link
And      Verify the account summary details
And      Select Account Period
And      Select type  of transaction
And      Click on Go button
Then     Check details


