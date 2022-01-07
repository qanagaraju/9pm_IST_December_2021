Feature: Scripts for Amazon search





Scenario Outline: scripts for amazon search products
Given user start amzon browser
Given user insert "<ProductDetails>" for products
Then user click search button
And user match record
Then user close test

Examples:
|ProductDetails|
|Samsung phones|
|Apple phones|

