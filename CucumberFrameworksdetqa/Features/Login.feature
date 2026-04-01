Feature: Login 

Scenario: Sccessful login with valid credentials

Given User launch chrome browser
When User opens URL "http://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on login
Then Page Title should be "Dashboard / nopCommerce administration"
When Usser click on Log out link
Then Page Title should be "Your store. Login"
And close browser