Feature: E-commerce application named as online food delivery
@login
Scenario: Validate login with happy path
Given Open the chrome and go to Home page of the application
When Enter name
And Enter password
And Click on submit btn
Then Login should be successful
