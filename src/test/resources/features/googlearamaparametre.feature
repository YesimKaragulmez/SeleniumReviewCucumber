Feature: Parametreli arama
  @webdriverArama
  Scenario: TC03_user searches on the google
    Given user is on the google page
    And user searches "webdriver"
    Then user check the "webdriver" on the page title
