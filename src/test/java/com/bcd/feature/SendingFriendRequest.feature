#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verifing if user can send friend request
  @tag1
  Scenario: Sending friend request.
  
  Given Open the Browser
Given Navigate to Facebook Website

When Enter a valid email "ushervka@gmail.com"
When Enter a valid password "Welcome@123"
When Click on login button
When Click on home
When Click on search friend
#When Click on your friend name.
When Click on Add Friend
 
 Then Logout
 And Close the browser
  
  
  