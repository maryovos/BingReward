 Feature: Reward Bing
  As a user,
  I want to be able to log in to my account using a username and password,
  So that I can access orange HRM Live website

  Background:
    Given user is on the login page already
    And user enters e username
    And user enters e password

  @BingReward5
  Scenario: Bing Reward 5
    And user inputs bing reward
    And user enters click button
    Then bing reward succeeded