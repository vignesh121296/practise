Feature: Verifying adactin login details

  Scenario Outline: Login with valid credentials
    Given User is on the adactin hotel page
    When User should enter "<username>" and "<password>" and click login button
    Then User should verify success message

    Examples: 
      | username  | password |
      | vignesh12 | T59824   |

