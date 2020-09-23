@explicit
Feature: Explicit Wait Ornek
  Scenario: TC05_user clicks add element button to occur a new webelement
    Given user goes to the "https://the-internet.herokuapp.com/add_remove_elements/" that page
    And user clicks add element button
    Then user sees the delete webelement
