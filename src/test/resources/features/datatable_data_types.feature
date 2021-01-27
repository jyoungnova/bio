Feature: Datatable data types demo
   
 
   Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the following info
         	| firstName   | lastName | birthDate  |
			| Annie M. G. | Schmidt  | 1911-03-20 |
			| Roald       | Dahl     | 1916-09-13 |
			| Astrid      | Lindgren | 1907-11-14 |
       
        
   Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the following info as list of maps
         	| firstName   | lastName | birthDate  |
			| Annie M. G. | Schmidt  | 1911-03-20 |
			| Roald       | Dahl     | 1916-09-13 |
			| Astrid      | Lindgren | 1907-11-14 |
			
			
	 Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the following info as maps	
			| KMSY | Louis Armstrong New Orleans International Airport |
			| KSFO | San Francisco International Airport               	|
			| KSEA | Seattle–Tacoma International Airport              	|
			| KJFK | John F. Kennedy International Airport             	|
			
				
	 Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the following info as maps with lists as value	
			
			| KMSY | 29.993333 |  -90.258056 |
			| KSFO | 37.618889 | -122.375000 |
			| KSEA | 47.448889 | -122.309444 |
			| KJFK | 40.639722 |  -73.778889 |
	
	
			
	 Scenario: Update user name
      Given I am connected to the database
      When I send a query to update user name
      Then I should see the following info as maps with maps as value			
			
			|      |       lat |         lon |
			| KMSY | 29.993333 |  -90.258056 |
			| KSFO | 37.618889 | -122.375000 |
			| KSEA | 47.448889 | -122.309444 |
			| KJFK | 40.639722 |  -73.778889 |
	
			
			