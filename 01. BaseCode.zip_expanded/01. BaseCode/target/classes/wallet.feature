Feature: Create an account

Scenario: User wants to create an account with valid data
Given user accesses create account module
When  I give "laveena" as a name,"9664140119" as a mobileNumber,2000 as a amount
Then System should create Account with name as "laveena",mobileNumber as "9664140119",amount as 2000

Scenario: User tries to create an account with invalid mobilenumber
Given  user wants to create an account
When  I give "Neha" as a name,"95678999100" as a mobileNumber,1000 as a amount
Then System should give error message as "Invalid mobile number"

