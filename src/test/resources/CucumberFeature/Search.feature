Feature: Amazon search
Scenario Outline: search functionality test
Given user on amazon home page
When user enter item on search bar "<search>"
And user click on search button
Then user on search page
Examples: 
|search|
|Qa testing|
 
