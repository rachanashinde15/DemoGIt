Feature: WUnderfalt search

#Scenario: wunderflat login test

#Given user is on login page
#When Title of login page is WunderFlats
#Then Enter email "rachanashinde04@gmail.com"
#Then Enter password "Rachana@123"
#Then Click on login button
#And User is on homepage

#Feature: WUnderfalt search

Scenario Outline: wunderflat login test

Given user is on login page
When Title of login page is WunderFlats
Then Enter email "<email>"
Then Enter password "<password>"
Then Click on login button
And User is on homepage
Then click on language
Then click on Dashborad
Then click on create listing
Then enter the address "<address>"
Then click on next
And user is on edit listing page
Then close the browser

Examples:
    | email | password | address |
    | rachanashinde04@gmail.com | Rachana@123 | 115 Rue du Bac, Paris, France |
