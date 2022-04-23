Feature: user

  Scenario: Create user
    Given url 'http://localhost:8080/user'
    And request { username: 'admin', password: 'admin'}
    When method post
    Then status 200

    #Post es para crear objetos#

  Scenario: Login user
    Given url 'http://localhost:8080/user/login'
    And param username = 'admin'
    And param password = 'admin'
    When method get
    Then status 200

    #Get es para obtener información#