Feature: Retail Page

Scenario: Login TekSchool Retail page
Given User is on Retail website
When User click  on MyAccount

Scenario Outline: Login TekSchool Retail page
And  User click on Login 
And user enter username '<username>' and password '<password>'
And User click on Login button
Then User should be logged in to MyAccount dashboard

Examples: 

| username | password |
| abdulmajeed@gmail.com | Jahid786$ |
