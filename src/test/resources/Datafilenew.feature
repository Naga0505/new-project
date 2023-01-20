Feature: To Validate the Login Fcunctionality of Email Application

Scenario Outline: To Validate the Positive And Negative Combination of Login Functionality
Given User has to Launch the chrome Browser and maximize window 
When User has to hit the Email url
And User has to pass the data "<Email or Phone Number>" in email or phone number field
And User has to click the Next button
And User has to pass the data "<Password Data>" in password filed
And USer has to Click login button
Then User has to close the Chrome browser

Examples:
|Email or Phone Number				|Password Data     |
|Selenium@gmail.com           |Selenium123@      |
|Nagaraj2013@gmail.com        |Nagaraj@12345 	   |