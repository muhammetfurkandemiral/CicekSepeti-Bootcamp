Feature: Sign In
  This is a test successful login action for login page

  @sign_in_Valid_Data @wip
  Scenario Outline: Sign In with correct data
    * def signIn = call read('classpath:callers/caller.feature@SignInUser'){email : '<email>', password : '<password>'}

    Then match signIn.responseStatus == 201
    And match signIn.response.access_token == '#notnull'

    Examples:
      | read('../../data/signIn/valid.csv') |

  @sign_in_Invalid_Data @wip
  Scenario Outline: Sign In with invalid email and password
    * def signIn = call read('classpath:callers/caller.feature@SignInUser'){email : '<email>', password : '<password>'}

    Then match signIn.responseStatus == 401
    And match signIn.response.message == "<response>"

    Examples:
      | read('../../data/signIn/invalid.csv') |