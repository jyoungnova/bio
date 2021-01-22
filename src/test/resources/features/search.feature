Feature: Search functionality


    @search @smoke
    Scenario: Verify Search Page title
   
     Given The User is on the homepage
     When The user enters a search term in the search bar
     Then The user should land on serch page and title should be Search - My Store 