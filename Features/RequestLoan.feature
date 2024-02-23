Feature: Parabank Request Loan Feature
Scenario: User able to request Loan

Given  User already on Dashboard Page
When   User enters Loan Amount
When   User enters Down Payment
When   User select From Account
When   User click on Apply Now Button
Then   User gets Confimation Message