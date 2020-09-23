@fhctrip
Feature:Fhctrip Kayit

  Scenario Outline:fhctrip websitesine kayit
    Given user goes to the fhctrip page
    And user fill the username "<username>" box
    And user fill the email "<email>" box
    And user fill the fullname "<fullname>" box
    Examples:Data Test
      | username | email    | fullname     |
      | YesimK   | yc@gmail | Yesim Kara   |
      | FiratK   | af@gmail | Ahmet Firat  |
      | azrak    | ag@gmail | azra gulsum  |
      | ahsenk   | as@gmail | ahsen saadet |