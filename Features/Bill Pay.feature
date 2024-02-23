Feature: Parabank Dashboard Bill pay feature
Scenario: Check Bill payment scenario

Given User Already on HomePage Dashboard 
When  Click on Bill pay Link
When  Enter Payee Name 
When  Enter  Address
When  Enter City
When  Enter State
When  Enter ZipCode
When  Enter phone#
When  Enter Account Number
When  Verify Account Number
When  Enter Amount
When  Select from Account
When  Click on Send Payment
Then  User gets message Bill payment Complete
 