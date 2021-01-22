Feature: Customer sign in
 
As a user, I want to be able sucessfully sign in


   Scenario: Verify Sign in page title
   
   	Given The User is on the homepage
   	When The user clicks on sign in button
   	Then The user should land on sign in page and the title should be Login - My Store
   	
   Scenario: Verify negative login
     Given The User is on the homepage
     When The user clicks on sign in button
     And The user enters incorrect credentials
     Then The user should not login and the error message should appear with the text Invalid Email Address
   	