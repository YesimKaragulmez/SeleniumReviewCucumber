Feature: Amazon urun Arama

  @amazonurunarama
  Scenario Outline: TC06_user searches the product in Amazon
    Given user goes to the "https://amazon.com" that page
    And  user text "<word>" in the searchbox
    Then user text the result count on the console

    Examples:
      | word       |
      | headphones |
      | tv         |
      | sponge      |

