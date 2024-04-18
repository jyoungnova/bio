@smoke
Feature: Verify the Swag labs page details
Background: 
   Given The User is on the homepage
  		
  		
   Scenario Outline: Verify sort functionality
      Given The User is on the homepage
      When The user enters "<username>" and "<password>"
  		When The user clicks on sign in button
  		 And The user clicks on sort icon to sort by name A-Z
  		 Then The items are sorted by name
  		 When The user clicks on sort icon to sort by price low to high
  		 Then The items are sorted by price
  		 
     Examples:
      |username     |  password   |
     	|standard_user| secret_sauce|

      
   
   Scenario Outline: Verify checkout functionality
    
      When The user enters "<username>" and "<password>"
  		When The user clicks on sign in button
  		Then The user adds Onesie to cart
  		Then The user adds Backpack to cart 
  		Then The user adds redSweater to cart  
      And  Click on Checkout 
     	Then Click on Logout
      
      
     Examples:
      |username     |  password   | 
     	|standard_user| secret_sauce|
  
  

    Scenario Outline: Verify images matching products functionality
    
      When The user enters "<username>" and "<password>"
  		When The user clicks on sign in button
  		When The user verifies the images matching products
  		Then The Images are displayed incorrectly
  
  
  
   Examples:
      |username     |  password   | 
     	|problem_user | secret_sauce|