Feature: Personalization
  This is a test for personalization product and add to cart page

  @personalization @regression
  Scenario: Personalization Product Test
    Given I am on the "portarretratos-de-cristal-personalizado-cancion-kcm64138299" page
    When I click "Add To Cart" button
    And I write "Çiçek Sepeti Var Var" on text box
    And I upload any images to my computer
    And I confirm design
    And I click "Next" button
    Then I should see the number of products in the basket as 1