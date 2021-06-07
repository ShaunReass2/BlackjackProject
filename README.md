## Blackjack Project

### Overview

This project simulates a game of Blackjack between a dealer and a single player.  The application acts as the dealer and handles all shuffling and dealing of cards used from a single deck and requires no input from the player to complete dealer play.  The player is able to interact with the application and make game decisions on their behalf through a series of menus specific to the portion of the game they are in.

### Technology Used

* Java
* Scanner
* Conditionals
* Looping
* Enums
* Object-Oriented Design
* (Data) Abstraction
* (Data) Polymorphism
* (Data) Inheritance
* (Data) Encapsulation

### How to Run

Upon starting, the program will present the user with a welcome message and menu, which provides three options: 1) Read Blackjack Rules, 2) Play Blackjack, and 3) Quit -- which will exit the program.  The first option will present the player with a synopsis of the Blackjack rules specific to this application.  At the bottom of the rules description, the player is prompted to type RETURN when they are ready to return to the main welcome menu.  The second option initiates a game of Blackjack, and the dealer will deal a suit of cards -- exposing both of the player's cards and only one of the dealer's cards -- and a second menu option will be displayed with the choices: 1) Hit and 2) Stay.  Option one will allow the player to receive as many additional cards from the dealer they so choose.  Option two will decline any additional cards from the dealer and complete their play.  If immediately following the initial deal, either the dealer, player, or both have a hand value of 21, it is considered a Blackjack and those with said hand win.  If, on the other hand, the player's or dealer's hand exceed 21 during the course of their turn, they lose.  Otherwise, the player with the highest value not exceeding 21 after all play is complete, wins.  A message will appear, calling the winner of the game, with a third menu prompting the player of their choice to: 1) Play Another Hand or 2) Quit.  Choosing to play another hand will prompt the dealer to deal again, and the cycle will continue until the player chooses to quit -- which will exit the program entirely.  

### Lessons Learned

Above all, this project reiterated the importance of planning the overall design of the application prior to typing code.  In addition to using a UML, it was vital to write notes in English prior to beginning to implement code.  This made it easier to understand what needed to happen.  Despite this, I found it equally important to be flexible and willing to change my original UML design in the middle of programming.  I originally implemented a Menu Class, which contained all code revolving around the program's three menus.  Additionally, all logic associated with the menus -- such as switches and the logic contained within -- were in this Menu Class.  It was halfway into my project I realized it was adding more complexity than was necessary, and I changed my original thought process and subsequently deleted the Menu Class after moving it's content into the BlackjackApp Class.
