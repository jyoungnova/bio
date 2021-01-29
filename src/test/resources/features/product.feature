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
      
      
    Scenario: Verify product deatils using DataTable with Lists
      Given The User is on the homepage
      When The user clicks on "Faded Short Sleeve T-shirts"
      Then The user should land on the same product page and the title has to contain "Faded Short Sleeve T-shirts"
      And  The product information should be the following 
           |  Faded Short Sleeve T-shirts |
           |   16.51                      |
           |      1                       |
           |     S                        |
      
      
    Scenario: Verify product deatils using DataTable with Maps
      Given The User is on the homepage
      When The user clicks on "Printed Chiffon Dress"
      And  The product information should be the following using maps 
           |          name          | price     | quantity | modelName | condition | size |
           |  Printed Chiffon Dress | 16.40     |   1      |  demo_7   |  New      |   S  |
           
          
      Then The user should land on the same product page and the title has to contain "Printed Chiffon Dress"    
      
      
      
    
   Scenario: Verify product deatils using DataTable with Pojos 
      Given The User is on the homepage
      When The user clicks on "Blouse"
      And  The product information should be the following using custom type
           |          name          | price     | quantity | modelName | condition | size |
           |  Blouse                | 27.00     |   1      |  demo_2   |  New      |   S  |
           
          
      Then The user should land on the same product page and the title has to contain "Blouse"
      
      
        @temp
    Scenario Outline: Verify multiple product details 
      Given The User is on the homepage
      When The user clicks on "<productName>"
      And  The product information should be the following using custom type
           |          name          | price          | quantity     | modelName      | condition       | size            |
           |    <productName>       | <productPrice> |  <productQty>|  <productMdl>  |  <productCndtn> |  <productSize>  |
           
          
      Then The user should land on the same product page and the title has to contain "<productName>" 
      
      Examples: 
          | productName                      |    productPrice  | productQty  |  productMdl | productCndtn | productSize |
          | Blouse                           |    27.00         | 1           |  demo_2     | New          | S           |
          | Faded Short Sleeve T-shirts      |    16.51         | 1           |  demo_1     | New          | S           |
          | Printed Dress				     |    26.00         | 1           |  demo_3     | New          | S           | 
          | Printed Summer Dress             |    28.98         | 1           |  demo_5     | New          | S           |
          | Printed Chiffon Dress            |    16.40         | 1           |  demo_7     | New          | S           |
          | Blouse                           |    27.00         | 1           |  demo_2     | New          | S           |
          | Faded Short Sleeve T-shirts      |    16.51         | 1           |  demo_1     | New          | S           |
          | Printed Dress				     |    26.00         | 1           |  demo_3     | New          | S           | 
          | Printed Summer Dress             |    28.98         | 1           |  demo_5     | New          | S           |
          | Printed Chiffon Dress            |    16.40         | 1           |  demo_7     | New          | S           |
          
          
          
          
          
          
          
          
          
          
          
          
          
           