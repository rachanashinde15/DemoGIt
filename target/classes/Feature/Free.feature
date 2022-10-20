Feature: Free CRM TEst


Scenario: free crm for deals

Given user is on login
Then user enters username and password
     | Username | password |
     | rachanashinde04@gmail.com | Rachana@123 |
Then user clicks on login button
Then user is on home page
Then User moves to deal page
Then user fills the details
| title | description | amount |
| abc | TV | 987 |
| etfdv | fridge | 890 |
| ytfg | oven | 159|

Then close the browser

