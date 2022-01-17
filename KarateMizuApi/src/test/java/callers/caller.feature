Feature: My Caller Features

  Background:
    * def user = read('classpath:data/user.json')
    Given url baseUrl
    And header Content-Type = 'application/json'

    When set user.email = email
    And set user.password = password
    And request user

  @SignUpUser
  Scenario: POST Request w/ JSON for Sign Up User
    Given path 'signup'

    When method POST
    And print 'after post', response

  @SignInUser
  Scenario: POST Request w/ JSON for Sign In User
    Given path 'signin'

    When method POST
    And print 'after post', response