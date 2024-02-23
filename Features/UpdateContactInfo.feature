Feature: Parabank Update Information feature
Scenario: User able to Update information

Given User already on dashboard 
When  click on Update Info link
When  User enter First Name
When  User enters Last Name	

When User enters Address
When User enters City	
When User enters State	
When User enters Zip Code	
When User enters Phone number	
When User click on Update Profile button
Then Display User update info confirmation message
