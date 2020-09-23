@examples
Feature: Birden Cok Veri
  Scenario Outline: TC04_google arama testi
    Given user is on the google page
    And user search "<words>"
    Then user check  "<words>" on the page title
    Examples: Test Verileri
      |words           |
      |techproeducation|
      |selenium        |
      |webdriver       |