@signin
Feature: Customer sign in
 
As a user, I want to be able sucessfully sign in

  Background: 
    	Given The User is on the homepage
    	When The user clicks on sign in button

   @login @smoke
   Scenario: Verify Sign in page title
      	Then The user should land on sign in page and the title should be Login - My Store
   	
   @negative @smoke @login
   Scenario: Verify negative login using wrong credentials
     And The user enters incorrect credentials
     Then The user should not login and the error message should appear with the text Invalid Email Address
   
   @test  
   Scenario: Verify negative login using no credentials
     And The user enters no credentials
     Then The user should not login and the error message should appear with the text An email address required  
     
   	