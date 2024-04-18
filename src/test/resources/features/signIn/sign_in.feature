@smoke
Feature: Customer sign in
 
As a user, I want to be able sucessfully sign in

  Background: 
    	Given The User is on the homepage
    	

  
   Scenario Outline: Verify Sign in page title
   			When The user enters "<username>" and "<password>"
  			When The user clicks on sign in button
      	Then The user should land on home page
   	
   	
   Examples:
   	|username     |  password   |
   	|standard_user| secret_sauce|
   	
   	
   	
   Scenario Outline: Verify Sign in page title
   			When The user enters "<username>" and "<password>"
  		  When The user clicks on sign in button
      	Then The error message is displayed
   	
   	
   Examples:
   	|username       |  password   |
   	|locked_out_user| secret_sauce|
   	
  