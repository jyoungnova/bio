Feature: Doc strings
   
  
   Scenario: Doc strings demo
      Given I am connected to the database
      When I send a query 
      """
      SELECT column1
       ,column2
    FROM table1
    WHERE column3 IN
    (
    SELECT TOP(1) column4
    FROM table2
    INNER JOIN table3
    ON table2.column1 = table3.column1
    )
    """
      