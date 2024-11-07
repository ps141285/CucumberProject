Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM page
    Given I launch chrome browser
    When I open OrangeHRM HomePage
    Then I validate that the logo is present on the page
    And Close the browser
