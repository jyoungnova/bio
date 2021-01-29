Feature: User registration feature

   
   @temp
    Scenario: Verify user registration
    
        Given The User is on the homepage
    	When The user clicks on sign in button
    	And The user enters a valid email address and clicks create account
    	And The user enters the following info into the form and clicks on register
    
       | first   |    last        | password    |  dateOfBirth | address                  |  city        | state | zip      | phoneNo |
       | Joe     |    Biden       | j.biden1942 |  20/11/1942  | 1600 Pennsylvania Ave NW |  Washington  | District of Columbia    | 20500    | 202-000-0001 |
    
       
       Then The user should land on account page and see welcome message