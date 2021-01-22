Feature: Customer sign in
 
As a user, I want to be able sucessfully sign in


   Scenario: Verify Sign in page title
   
   	Given The User is on the homepage
   	When The user clicks on sign in button
   	Then The user should land on sign in page and the title should be Login - My Store
   	