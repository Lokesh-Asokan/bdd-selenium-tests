Feature: Purchase and manage account online
  As a Customer
  I should be able to purchase and manage account online
  So that it allows me to purchase from anywhere

  Background:
      Given I Launch the order portal website

  @scenario1 @Automation
  Scenario: Order history should be updated with relavant details of my current purchase
    Given I login to the application with valid credentials
    And I ordered Tshirt successfully
    When I view my order history
    Then I should see my relavant order details of my current purchase

  @scenario2 @Automation
  Scenario Outline: Update First name under personal information in My Account
    Given I Launch the order portal website
    And I login to the application with valid "<username>" and "<password>"
    When I naviagte to personal information page
    And I update the first name field
    And I save the information
    Then I Should see the personal information update for first name is successful

    Examples:
      |username|password|
      |username|password|