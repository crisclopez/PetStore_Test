Feature: Users Management
  I as a pet store admin , I want to manage users system

  Scenario Outline: Create user
    When admin create a new user for pet store system

      | userName   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <userName> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |

    Then pet store system modified successfully

    Examples:

      | userName   | firstName | lastName | email                   | password | phone     | userStatus |
      | chris.bale | Cristhian | Bale     | chris.bale@petstore.com | 54321    | 125787455 | 2          |


  Scenario Outline: Update a existing user to the pet store system
    When admin modify an existing user

      | userName   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <userName> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |

    Then pet store system modified successfully

    Examples:

      | userName   | firstName | lastName | email                | password | phone     | userStatus |
      | chris.bale | Cristhian | Bale     | chris.bale@email.com | 54321    | 125787455 | 1          |


  Scenario Outline: Update a existing user to the pet store system
    When admin modify an existing user

      | userName   | firstName   | lastName   | email   | password   | phone   | userStatus   |
      | <userName> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |

    Then request fail with status 404

    Examples:

      | userName    | firstName | lastName | email                | password | phone     | userStatus |
      | jhon.connor | Cristhian | Bale     | chris.bale@email.com | 54321    | 125787455 | 1          |


  Scenario: Find user by username
    When admin is looking for a user by this username chris.bale
    Then information returned by system successfully


  Scenario Outline: Login user into the system
    When user put his credentials into the system

      | userName   | password   |
      | <userName> | <password> |

    Then information returned by system successfully

    Examples:

      | userName   | password |
      | chris.bale | 54321    |


  Scenario: Logs out current logged in user session
    When user log out his user session

    Then information returned by system successfully


  Scenario: Delete user
    When admin delete user for the system with this username carlo.perez
    Then information returned by system successfully