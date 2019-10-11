Feature: Login credenrials 
Scenario Outline: Login Page of Testme
Given user is on the home page
When User enter the valid credentials "<userName>" And "<password>"
Then User successfully login
Examples:
|userName||password|
|lalitha||Password123|
|reshma||reshma123|