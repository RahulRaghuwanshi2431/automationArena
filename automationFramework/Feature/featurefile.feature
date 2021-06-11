Feature: Comm100 Login Page

  @Comm100
  Scenario: Validate Login Functionality
    Given user launches browser in "chrome"
    When Launches URL "https://secure.comm100.com/login.aspx"
    Then user enters emailID as "test@test.com"
    And user enters password as "test"
    And user clicks on button "signin"
