Feature: Registration
Scenario: Registration to Testme
Given user is on the Registration page
When  user name "prakrti"
And  first name "v"
And last name "n"
And password "reshma123"
And confirm password "reshma123"
And gender 
And email "reshvn@gmail.com"
And phoneno "1234567898"
And dob "01/20/1998"
And address "gandhi nagar talur road bellary"
And security question "What is your Birth Place?"
And answer "Bellary"
Then registration successful

