Feature: High to low Sorting
  This is a test successful sorting control for flower page

  @sort_high_to_low @regression
  Scenario: Sorting Test
    Given I am on the "flowers" page
    When I close address focus on home page
    And I close the cookies notification

    And I sorted it from "High to Low" on menu pages
    Then I should see prices sorted from high to low