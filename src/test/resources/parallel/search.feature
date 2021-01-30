@ui
Feature: Search functionality


    @search @smoke
    Scenario: Verify Search Page title
   
     Given The User is on the homepage
     When The user enters a search term in the search bar
     Then The user should land on serch page and title should be Search - My Store
     
   
     Scenario: Verify Search term 
   
     Given The User is on the homepage
     When The user enters Blouse in the search bar
     Then The user should see Blouse in the search page
     
     
     
     Scenario: Verify Search term 
   
     Given The User is on the homepage
     When The user enters "Blouse" in the search bar
     Then The user should see "Blouse" in the search page
     
     
     Scenario: Verify Search term 
   
     Given The User is on the homepage
     When The user enters "Chiffon" in the search bar
     Then The user should see "Chiffon" in the search page
     
     
       
     Scenario: Verify Search term 
   
     Given The User is on the homepage
     When The user enters "Sneakers" in the search bar
     Then The user should see "Sneakers" in the search page
     
    
     
     
     