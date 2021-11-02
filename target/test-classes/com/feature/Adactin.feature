Feature: Hotel Booking In Adactin Application 

@smokeTest
Scenario: Adactin 
	Given user Launch The Application 
	When user Enter The  Username In Username Field 
	And user Enter The Password In Password Field 
	Then user Click On The Login Button And It Navigates To The Search Hotel Page 

@sanityTest
Scenario: User Search And Select The Room And Details In The Select Hotel Page 
	When User Select The Location 
	And User Select The Hotel 
	And User Select The Room Type 
	And User Select The Number Of Rooms 
	And User Select The Check In Date 
	And User Select The Check Out Date 
	And User Select The Adults Per Room 
	And User Select The Children Per Room 
	Then User Click The Search Button It Navigates To The Select Hotel Page 

@sanityTest
Scenario: User Confirm The Room In Search Hotel page 
	When User Click The Select Button 
	Then User Click The Continue Button It Navigates To The Book A Hotel Page 
	
@sanityTest
Scenario: User Book The Room And Payment Details In Search Hotel page 
	When User Enter The Valid First Name 
	And User Enter The Valid Last Name 
	And User Enter The Billing Address 
	And User Enter The Valid Credit Card Number 
	And User Choose The Credit Card Type 
	And User Select The Select Month In The Expiry Date Box 
	And User Select The Select Year In The Expiry Date Box 
	And User Enter The CVV Number 
	Then User Click The Book Now Button It Navigates To The Booking Confirmation Page 

@regressionTest
Scenario: User LogOut In The My Itinerary Page 
	Then User Click The Logout Button 
	
		