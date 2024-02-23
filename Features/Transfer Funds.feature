Feature: Fund Transfer feature
Scenario: User can Fund transfer Successfully

Given User on dashboard Page
When  Click on Transfer funds link
And   User enters amount 
And   select account field first
And   Select account field second
And   Click on Tranfer Button
Then  Verify Confirmation of Tranfer Complete


