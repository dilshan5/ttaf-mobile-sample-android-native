Feature: User Successful Login Feature

  @smoke_1
  Scenario: Login the app successfully as a candidate
    Given I am on the Login Screen
    When I fill "sample@gmail.com" as Email address
    And I fill "sample12" as Password
    And I click Login button
    Then I should see message as "Login Success..!!!!!"