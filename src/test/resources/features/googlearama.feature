@GoogleArama
Feature: Google arama

  Background:user is on the google page
    Given user is on the google page

  @techproeducationArama
  Scenario:  TC01_user search techproeducation in google.com
    And text techproeducation on the searchbox
    Then verify the search result

  @seleniumArama
  Scenario: TC02_user search selenium in google.com
    And user text selenium searchbox
    Then user check the result count


























