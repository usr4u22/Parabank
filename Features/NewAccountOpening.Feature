Feature: New Account Opening Feature

Scenario: New Account Opening

Given User is on Paranbank account overiew Page
When  User Login to parabank 
And   User click on Open New account Link
And   User click on type of account opening option
And   User select deposit amount 
And   User click on Open New account button
Then  User  get the confirmation message with ID


