Feature: To Test group of data 

@regTest
Scenario Outline: To Test Username and password 

Given Login to the page "https://www.espncricinfo.com"
When page loads
Then Enter the "<username>" and "<password>"

Examples:
|username|password|
|arun|1234|
|tom|123|

Scenario: Testing valid username

Then Entered <username> is correct

|Venkatesh|Tom|Arun|



