Feature: Login
  as customer
  i want the ability to login
  and access my account

  Scenario Outline: Customer can successfully login
   Given I navigate to GuruDemohome page
    When i enter my user "<id>"
    And i enter my "<password>"
    And click on login button
    Then my user login account page is displayed

    Examples:
        |id     |password         |
        | gest  | PassGuest       |