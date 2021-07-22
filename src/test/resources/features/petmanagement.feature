Feature: Pet Managements
  I as a pet store seller , I want to manage inventory about our pets

  Scenario Outline: Add a new pet to the store
    When seller add a new pet to inventory

      | name   | category   | photoUrl   | tag   | status   |
      | <name> | <category> | <photoUrl> | <tag> | <status> |

    Then inventory changed successfully

    Examples:

      | name | category | photoUrl | tag      | status    |
      | lulu | Dogs     | D:/lulu  | adorable | available |


  Scenario Outline: Update a existing pet to the store
    When seller modify an existing pet information

      | petId   | name   | category   | photoUrl   | tag   | status   |
      | <petId> | <name> | <category> | <photoUrl> | <tag> | <status> |

    Then inventory changed successfully

    Examples:

      | petId | name  | category | photoUrl | tag       | status    |
      | 1    | lulu  | Dogs     | D:/lulu  | adorable  | sold      |


  Scenario Outline: Update a non-existing pet to the store
    When seller modify an existing pet information

      | petId   | name   | category   | photoUrl   | tag   | status   |
      | <petId> | <name> | <category> | <photoUrl> | <tag> | <status> |

    Then request fail with status 404

    Examples:

      | petId | name | category | photoUrl | tag      | status |
      | 999    | lulu | Dogs     | D:/lulu  | adorable | sold   |

  Scenario: Find pet by Id
    When seller is looking for a pet with id 2
    Then information returned by system successfully


  Scenario: Find pet by Status
    When seller is looking for a pet with status available
    Then information returned by system successfully


  Scenario: Find pet by tag
    When seller is looking for a pet with tag tag1
    Then information returned by system successfully

  Scenario: Find non-existing pet by Id
    When seller is looking for a pet with id 10000
    Then request fail with status 404

  Scenario: Find pet by non-existing status
    When seller is looking for a pet with status returned
    Then request fail with status 400

  Scenario: Delete a pet
    When seller delete a pet with id 15
    Then information returned by system successfully

#
#  @UserStory=2399586
#  Scenario Outline: show rejected transactions
#    When customer searches for the transactions made with following information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be displayed successfully
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | rejected        | 2021-06-21  | 2021-06-24 | 10       |              |                 |                  |                |
#      | rejected        | 2021-06-21  | 2021-06-24 | 10       |              |                 | PAYPAL           |                |
#      | rejected        | 2021-06-21  | 2021-06-24 | 10       | 1            | 000002101068202 |                  |                |
#      | rejected        | 2021-06-21  | 2021-06-24 | 10       |              |                 |                  | 008            |
#      | rejected        | 2021-06-21  | 2021-06-24 | 10       | 1            | 000002101068211 | PAYPAL           | 014            |
#
#  @UserStory=2399586
#  Scenario Outline: show not complete transactions
#    When customer searches for the transactions made with following information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> |
#
#    Then Queries will be displayed successfully
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | documentType | documentNumber  | walletProviderId |
#      | not-complete    | 2021-06-24  | 2021-06-24 | 10       |              |                 |                  |
#      | not-complete    | 2021-06-21  | 2021-06-24 | 10       |              |                 | AMAZON           |
#      | not-complete    | 2021-06-21  | 2021-06-24 | 10       | 1            | 000002101068211 |                  |
#      | not-complete    | 2021-06-21  | 2021-06-24 | 10       | 1            | 000002101068211 | PAYPAL           |
#
#  @UserStory=2399586
#  Scenario Outline: show blacklist records
#    When customer searches for the transactions made with following information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | walletProviderId   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <walletProviderId> |
#
#    Then Queries will be displayed successfully
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | walletProviderId |
#      | black-list      | 2021-06-30  | 2021-07-01 | 10       |                  |
#      | black-list      | 2021-06-30  | 2021-07-01 | 10       | AMAZON           |
#      | black-list      | 2021-06-30  | 2021-07-01 | 10       | NETFLIX          |
#
#  @UserStory=2399586
#  Scenario Outline: Failed information query by start date greater than the end date
#    When customer searches for the transactions made with following wrong information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be fail
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | successful      | 2021-06-24  | 2021-06-21 | 10       |              |                 |                  |                |
#      | rejected        | 2021-06-24  | 2021-06-21 | 10       |              |                 |                  | 008            |
#      | successful      | 2021-06-24  | 2021-06-21 | 10       | 1            | 000002101068202 |                  |                |
#      | not-complete    | 2021-06-24  | 2021-06-21 | 10       |              |                 | PAYPAL           |                |
#      | black-list      | 2021-05-20  | 2021-05-14 | 10       |              |                 | ECOM             |                |
#
#  @UserStory=2399586
#  Scenario Outline: Failed information query by start date greater than the current date
#    When customer searches for the transactions made with following wrong information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be fail
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | successful      | 2022-06-20  | 2022-06-30 | 10       |              |                 |                  |                |
#      | rejected        | 2022-06-20  | 2022-06-30 | 10       |              |                 |                  | 008            |
#      | successful      | 2022-06-20  | 2022-06-30 | 10       | 1            | 000002101068202 |                  |                |
#      | not-complete    | 2022-06-20  | 2022-06-30 | 10       |              |                 | AMAZON           |                |
#      | black-list      | 2022-06-20  | 2022-06-30 | 10       |              |                 | AMAZON           |                |
#
#  @UserStory=2399586
#  Scenario Outline: Failed information query of failed information by end date greater than the current date
#    When customer searches for the transactions made with following wrong information
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be fail
#
#    Examples:
#
#      | transactionType | initialDate | finalDate  | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | successful      | 2021-06-20  | 2021-07-30 | 10       |              |                 |                  |                |
#      | rejected        | 2021-06-20  | 2021-07-30 | 10       |              |                 |                  | 008            |
#      | successful      | 2021-06-20  | 2021-07-30 | 10       | 1            | 000002101068202 |                  |                |
#      | not-complete    | 2021-06-20  | 2021-07-30 | 10       |              |                 | AMAZON           |                |
#      | black-list      | 2021-06-20  | 2021-07-30 | 10       |              |                 | AMAZON           |                |
#
#  @UserStory=2399586
#  Scenario Outline: Show report transactions with range of 90 days
#    When customer searches for the transactions made with date 90 days old
#
#      | transactionType   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be displayed successfully
#
#    Examples:
#
#      | transactionType | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | successful      | 10       |              |                 |                  |                |
#      | rejected        | 10       |              |                 |                  | 008            |
#      | successful      | 10       | 1            | 000002101068202 |                  |                |
#      | not-complete    | 10       |              |                 | AMAZON           |                |
#      | black-list      | 10       |              |                 | AMAZON           |                |
#
#  @UserStory=2399586
#  Scenario Outline: Failed information query by date range greater than 90 days
#    When customer searches for the transactions made with date 91 days old
#
#      | transactionType   | initialDate   | finalDate   | pageSize   | documentType   | documentNumber   | walletProviderId   | declinedReason   |
#      | <transactionType> | <initialDate> | <finalDate> | <pageSize> | <documentType> | <documentNumber> | <walletProviderId> | <declinedReason> |
#
#    Then Queries will be fail
#
#    Examples:
#
#      | transactionType | pageSize | documentType | documentNumber  | walletProviderId | declinedReason |
#      | successful      | 10       |              |                 |                  |                |
#      | rejected        | 10       |              |                 |                  | 008            |
#      | successful      | 10       | 1            | 000002101068202 |                  |                |
#      | not-complete    | 10       |              |                 | AMAZON           |                |
#      | black-list      | 10       |              |                 | NETFLIX          |                |
#
#
