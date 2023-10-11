Feature: Testing Home-page

Background:
Given Access the url "https://www.espncricinfo.com"

Scenario: Test login for home-page 


When page loads expand the page
Then Verify the page title 


Scenario: Validate the alert pop-up

When page loads wait for ten seconds
Then alert popup should be displayed
And User should click on cancel
