Feature: search

Scenario: Searching headphones
Given open browser
When login and search for product
Then Payment done

Scenario: Unsuccessful search
Given open browser again
When login and search for product not found
Then unsuccessfull payment

Scenario: Unsuccessful search when blank
Given open browser again when blank
When login and no search for product 
Then unsuccessfull when blank