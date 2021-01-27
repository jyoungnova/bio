Feature: Product details

 
   Scenario: Verify product name, price and quantity
      Given The User is on the homepage
      When The user clicks on "Faded Short Sleeve T-shirts"
      Then The user should land on the same product page and the title has to contain the name
      And  The product name should be "Faded Short Sleeve T-shirts", the price should be 16.51 and the quantity should be 1
      
      
     
   Scenario: Verify product name, price and quantity
      Given The User is on the homepage
      When The user clicks on "Printed Chiffon Dress"
      Then The user should land on the same product page and the title has to contain the name
      And  The product name should be "Printed Chiffon Dress", the price should be 16.40 and the quantity should be 1
      
      @temp
    Scenario: Verify product name, price and quantity using DataTable
      Given The User is on the homepage
      When The user clicks on "Faded Short Sleeve T-shirts"
      Then The user should land on the same product page and the title has to contain "Faded Short Sleeve T-shirts"
      And  The product information should be the following 
           |  Faded Short Sleeve T-shirts |
           |   16.51                      |
           |      1                       |
           |     S                        |
           
           
           