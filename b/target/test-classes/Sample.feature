Feature: To Validate the 	Login Fuctionality of Facebook Application.
Background:
Given To Launch the Chrome Browser and Maximize the Window.

Scenario: To Validate Login with Valid Username and Invalid Password.
When To Launch the url of the Facebook Application.
And To Pass the Valid Username in Email Field.
And To Pass the Invalid Password in Password Field.
And  To Click the Login Button.
And To Check Whether Navigate to homepage or not.
Then To Close the Browser.

Scenario Outline: To Validate the Positive and Negative of Login Functionality.
When User has to hit the facebook url
And User has pass the datas "<emaildatas>" in email field.
And User as pass the datas "<passworddatas>" in password field.
And User has to Click the Login Button.
Then User has to Close the Browser.

Examples:
|emaildatas                 |passworddatas|
|naanjil.murugesan@gmail.com|12345|
|abc@gmail.com              |12345|
|xyz@gmail.com              |12334567|
|1234567890                 |abcder|