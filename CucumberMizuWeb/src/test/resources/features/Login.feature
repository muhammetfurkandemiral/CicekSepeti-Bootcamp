Feature: Login
  This is a test successful login action for login page

  @login_successful @regression
  Scenario: Login Test
    Given I am on the "login" page
    When I close the cookies notification

    And I logged with the following data:
      | email                 | password       |
      | hoxoki7002@rezunz.com | SuperPassword1 |

    And I close address focus on home page
    Then I should see "My Account" on home page