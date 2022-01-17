Feature: Sign Up
  This is a test successful login action for login page

  @sign_up_Valid_Data @wip
  Scenario Outline: Sign Up with correct data
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : '<password>'}

    Then match signUp.responseStatus == 201
    And match signUp.response.access_token == '#notnull'

    Examples:
      | email                      | password       |
      | muhammetfurkan@demiral.com | SuperPassword1 |

  @sign_up_Exist_Data @wip
  Scenario Outline: Sign Up with exist data
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : '<password>'}

    Then match signUp.responseStatus == 409
    And match signUp.response.message == "User already exist!"
    And match signUp.response.error == "Conflict"

    Examples:
      | read('../../data/valid.csv') |

  @sign_up_Invalid_Email @wip
  Scenario Outline: Sign Up with invalid email
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : '<password>'}

    Then match signUp.responseStatus == 400
    And match signUp.response.message == ["email must be an email"]
    And match signUp.response.error == "Bad Request"

    Examples:
      | email   | password       |
      | mfurkan | SuperPassword1 |

  @sign_up_Empty_Email_or_Password @wip
  Scenario Outline: Sign Up with empty email or password
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : '<password>'}

    Then match signUp.responseStatus == 400
    And match signUp.response.message contains <response>
    And match signUp.response.error == "Bad Request"

    Examples:
      | read('../../data/signUp/empty_email_password.csv') |

  @sign_up_Short_or_Long_Password @wip
  Scenario Outline: Sign Up with short password or long password
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : '<password>'}

    Then match signUp.responseStatus == 400
    And match signUp.response.message == <response>
    And match signUp.response.error == "Bad Request"

    Examples:
      | read('../../data/signUp/short_long_password.csv') |


  @sign_up_Integer_Password @wip
  Scenario Outline: Sign Up with wrong type password
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : '<email>', password : <password>}

    Then match signUp.responseStatus == 400
    And match signUp.response.message contains ["password must be a string"]
    And match signUp.response.error == "Bad Request"

    Examples:
      | email               | password  |
      | mfurkan@demiral.com | 123456789 |

  @sign_up_Integer_Email @wip
  Scenario Outline: Sign Up with wrong type email
    * def signUp = call read('classpath:callers/caller.feature@SignUpUser'){email : <email>, password : '<password>'}

    Then match signUp.responseStatus == 400
    And match signUp.response.message contains ["email must be an email"]
    And match signUp.response.error == "Bad Request"

    Examples:
      | email     | password    |
      | 123456789 | "123456789" |