Feature: User registration feature

   

    Scenario: Verify user registration
    
        Given The User is on the homepage
    	When The user clicks on sign in button
    	And The user enters a valid email address and clicks create account
    	And The user enters the following info into the form and clicks on register
    
       | first   |    last        | password    |  dateOfBirth | address                  |  city        | state | zip      | phoneNo |
       | Joe     |    Biden       | j.biden1942 |  20/11/1942  | 1600 Pennsylvania Ave NW |  Washington  | District of Columbia    | 20500    | 202-000-0001 |
    
       
       Then The user should land on account page and see welcome message
       
       
     
       Scenario Outline: Verify multiple user registration
    
        Given The User is on the homepage
    	When The user clicks on sign in button
    	And The user enters a valid email address and clicks create account
    	And The user enters "<first name>" , "<last name>" , "<password>" , "<dob>" , "<address>" , "<city>" , "<state>" , "<zip>", "<phone>" 
        Then The user should land on account page and see welcome message
       
       
       
       
       
       Examples:
    | first name | last name    | password     | dob             |   address                 |   city           | state                     |   zip           |   phone         |
	|Ruddy       |Dugget        |Dugget        |20/11/1942         | 35288 Mitchell Street     | Tariport         |District of Columbia         | 33447           | 934-720-1036    |
	|Gwendolen   |Daniele       |Daniele       |20/11/1942       | 2949 Novick Avenue        | Lake Jessie      |District of Columbia     | 41651           | 274-065-1999    |
	|Ddene       |Manicomb      |Manicomb      |20/11/1942       | 5321 Browning Parkway     | North Cameronland|District of Columbia       | 31968           | 606-580-9439    |
	|Lynett      |Coulston      |Coulston      |20/11/1942       | 642 West Street           | East Kirsten     |District of Columbia      | 10830           | 329-578-6017    |
	|Had         |Paddemore     |Paddemore     |20/11/1942     | 568 Fair Oaks Avenue      | Chimouth         |District of Columbia      | 35994           | 408-132-1237    |
	|Dionysus    |Klossek       |Klossek       |20/11/1942        | 60 Harbort Way            | East Darrickfort |District of Columbia        | 46836           | 779-494-5333    |
	|Ingrim      |Millett       |Millett       |20/11/1942        | 7545 Birchwood Center     | Benbury          |District of Columbia      | 89089           | 560-330-7342    |
	|Boycie      |Dorkin        |Dorkin        |20/11/1942         | 17722 Sommers Pass        | Gaylordshire     |District of Columbia         | 56415           | 934-720-1036    |
	|Chico       |Hargitt       |Hargitt       |20/11/1942        | 56749 Bay Lane            | North Royce      |District of Columbia        | 42098           | 274-065-1999    |
	|Michale     |Spearett      |Spearett      |20/11/1942       | 182 Myrtle Lane           | South Bongbury   |District of Columbia       | 23575           | 606-580-9439    |
	|Hashim      |Kindleside    |Kindleside    |20/11/1942     | 3 Dayton Alley            | South Dustin     |District of Columbia     | 75287           | 329-578-6017    |
	|Ralina      |Rapinett      |Rapinett      |20/11/1942       | 8578 Cody Crossing        | Bayerland        |District of Columbia      | 45276           | 408-132-1237    |
	|Hew         |Jerzyk        |Jerzyk        |20/11/1942        | 93 Pepper Wood Park       | West Monty       |District of Columbia         | 36804           | 779-494-5333    |
	|Krissie     |Rickell       |Rickell       |20/11/1942        | 35724 Anthes Plaza        | East Keeleyside  |District of Columbia       | 27197           | 560-330-7342    |
	|Jilleen     |Cosgra        |Cosgra        |20/11/1942         | 56 Mayer Park             | Mohrside         |District of Columbia        | 82727           | 613-138-9560    |
       