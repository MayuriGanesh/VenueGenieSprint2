
Feature:DeleteById
Scenario: User want to delete user by ID
When User want to delete user by using  URI as "http://localhost:8080/farmhouses/51"
Then verify the status code is 200
