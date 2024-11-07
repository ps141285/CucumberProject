Feature: Login
  Scenario: Successful Login with valid credentials
    Given User Launch Chrome Browser
    When User opens url "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password is "admin"
    And click on Login
    Then Page Title should be "Dashboard/nopcommerce administration"
    When User click on Logout Link
    Then Page title should be "Your store. Login"
    And Close the browser