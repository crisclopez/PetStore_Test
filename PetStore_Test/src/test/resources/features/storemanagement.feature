<<<<<<< HEAD
Feature: Store Management
  I as a pet store seller , I want to manage store system

  Scenario Outline: Place orders
    When seller place new order for a pet

      | petId   | quantity   | status   | complete   |
      | <petId> | <quantity> | <status> | <complete> |

    Then store updated successfully

    Examples:

      | petId | quantity | status   | complete |
      | 10    | 5        | approved | true     |

  Scenario: Find pet inventories by status
    When seller is looking for all pet inventories by status
    Then information returned by system successfully


  Scenario: Find purchase order by id
    When seller is looking for a purchase order with id 3
    Then information returned by system successfully


  Scenario: Find non-existing purchase order by id
    When seller is looking for a purchase order with id 5
    Then request fail with status 404


  Scenario: Delete a purchase order by id
    When seller delete a purchase order with id 15
=======
Feature: Store Management
  I as a pet store seller , I want to manage store system

  Scenario Outline: Place orders
    When seller place new order for a pet

      | petId   | quantity   | status   | complete   |
      | <petId> | <quantity> | <status> | <complete> |

    Then store updated successfully

    Examples:

      | petId | quantity | status   | complete |
      | 10    | 5        | approved | true     |

  Scenario: Find pet inventories by status
    When seller is looking for all pet inventories by status
    Then information returned by system successfully


  Scenario: Find purchase order by id
    When seller is looking for a purchase order with id 3
    Then information returned by system successfully


  Scenario: Find non-existing purchase order by id
    When seller is looking for a purchase order with id 5
    Then request fail with status 404


  Scenario: Delete a purchase order by id
    When seller delete a purchase order with id 15
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
    Then information returned by system successfully