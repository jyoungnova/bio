Feature: Update user details
   
   @db_only
   Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the updated name in the database