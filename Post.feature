


Feature: FarmHouse_Controller
Scenario:User should be able to add the data into database
Given User wants to create new data in database
When User create data by using URI as"http://localhost:8080/farmhouses"
Then verify the statuscode as 200