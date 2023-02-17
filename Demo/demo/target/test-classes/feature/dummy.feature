Feature: Test login functionality

  Scenario Outline: Validate login functionality
    Given browser is open
    And user is on google search page
    When user should click on make appointment button
    And user is navigated to the login page
    And user enters "<username>" and "<password>"
    And clicks on login button
    Given user has to book an appointement
    When user should enter all the valid credentials
    And click on book appointment button
    Then user is navigated to result page

    Examples: 
      | username | password           |
      | John Doe | sdfsd              |
      | John Doe | ThisIsNotAPassword |
