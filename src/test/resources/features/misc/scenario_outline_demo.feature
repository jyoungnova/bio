Feature: Demo
  

    Scenario Outline: Verify data with multiple inputs
    
        Given The User is on the homepage
        When I click on "<link>" link
        Then I should land on "<page>" Page
        And The title should be "<title>"
        
        Examples:
         | link       |  page    |  title                |
         | Dresses    |  Dresses |  Dresses - My Store |
         | Women      |  Women   |  Women - My Store   | 
         | T-shirts   |  T-shirts|  T-shirts - My Store| 