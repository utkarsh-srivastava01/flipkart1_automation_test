Feature: To test Flipkart functionality

Scenario: product selection

Given To launch the browser and nevigate to url
Then Neviagte to search result page

When Search mobiles in search bar
And User selects any mobile product
Then Product details page should open

Then buyoption button works