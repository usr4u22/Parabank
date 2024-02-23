Feature: Parabank Login page feature

Scenario: User should Login Successfully with valid credentials

Given  User should be on Login page
When   Title of Login Page is ParaBank Welcome Online Banking
When   User enters valid Username
When   User enters valid Password
And    User click on Login Button
Then    User navigate to HomePage Dashboard
And     User click on Logout
And     User close the browser