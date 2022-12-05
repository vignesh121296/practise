Feature: Verifying facebook login details

  Scenario Outline: Verifying facebook login with valid data
    Given User is on the facebook page
    When User should enter "<username>" and "<password>"
    And User should click login button
    Then User should verify success message

    Examples: 
      | username | password  |
      | vicky    | hello@123 |
      | karthi   | karhello  |
      | jai      | krishna   |
      | sakthi   | vijay     |
      | rajesh   | dhanush   |
