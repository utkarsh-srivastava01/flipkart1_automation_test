Feature: To test Flipkart functionality

Scenario Outline: to validate search functionality
Given To launch the browser and nevigate to url
When Search "<product>" in search bar
Then Neviagte to search result page

Examples:
| product    |
| mobiles    |
#| laptop     |





#Scenario: product selection
#Given To launch the browser and nevigate to url
#When Search mobiles in search bar
#And User selects any mobile product
#Then Product details page should open
#
#Scenario: to validate buyoption
#Given To launch the browser and nevigate to url
#When Search mobiles in search bar
#And User selects any mobile product
#Then Product details page should open
#Then buyoption button works 
