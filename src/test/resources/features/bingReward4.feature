Feature: Reward Bing
  As a user,
  I want to be able to log in to my account using a username and password,
  So that I can access orange HRM Live website

  Background:
    Given user is on the login page already
    And user enters d username
    And user enters d password

  @BingReward4
  Scenario: Bing Reward 4
    And user inputs bing reward
    And user enters click button
    Then bing reward succeeded