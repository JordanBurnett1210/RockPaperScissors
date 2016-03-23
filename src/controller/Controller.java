package controller;

import java.util.Scanner;

public class Controller
{
	//Declaration section
	private Scanner myScanner;
	
	//Constructor.
	public Controller()
	{
		myScanner = new Scanner(System.in);
	}
	
	//What actually runs.
	public void start()
	{
		play();
	}
	
	//Method that actually allows you to play.
	private void play()
	{
		String userChoice = "yes";
		//Allows you to choose to play again without closing the program
		while(userChoice.toLowerCase().contains("yes"))
		{
			//Determines your game mode by asking questions then running if tests on your response.
			System.out.println("Type 'single' for a single player game, or 'two' for a 2 player game");
			String gameMode = myScanner.nextLine();
			//Method for single player game.
			if(gameMode.toLowerCase().contains("single"))
			{
				//Finds your choice of rock paper or scissors.
				System.out.println("Type 'rock', 'paper', or 'scissors'.");
				String userAnswer = myScanner.nextLine();
				//Randomly generates a number between 0 and 3 to be used as rock paper or scissors.
				double computerAnswer = Math.random() * 3;
				//If the random number is less than 1, it is considered paper.
				if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 1)
				{
					System.out.println("You win.");
				}
				//If the random number is between 1 & 2, it is considered scissors.
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 2)
				{
					System.out.println("I win.");
				}
				//If the random number is between 2 & 3, it is considered rock.
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 3)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 1)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 2)
				{
					System.out.println("I win.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 3)
				{
					System.out.println("You win.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 1)
				{
					System.out.println("You win.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 2)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 3)
				{
					System.out.println("I win.");
				}
			}
			//Method for 2 player game.
			else if(gameMode.toLowerCase().contains("two"))
			{
				//Gets player 1's answer
				System.out.println("Type 'rock', 'paper', or 'scissors'.");
				String userAnswer = myScanner.nextLine();
				//Gets player 2's answer
				System.out.println("Player 2, type your answer.");
				String computerAnswer = myScanner.nextLine();
				//A series of tests to announce who wins based on the given answers.
				if(userAnswer.toLowerCase().contains("rock") && computerAnswer.toLowerCase().contains("scissors"))
				{
					System.out.println("P1 wins.");
				}
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer.toLowerCase().contains("paper"))
				{
					System.out.println("P2 wins.");
				}
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer.toLowerCase().contains("rock"))
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer.toLowerCase().contains("scissors"))
				{
					System.out.println("P2 wins.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer.toLowerCase().contains("paper"))
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer.toLowerCase().contains("rock"))
				{
					System.out.println("P1 wins.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer.toLowerCase().contains("scissors"))
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer.toLowerCase().contains("paper"))
				{
					System.out.println("P1 wins.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer.toLowerCase().contains("rock"))
				{
					System.out.println("P2 wins.");
				}
			}
			//Announces if you failed to pick a valid game type.
			else
			{
				System.out.println("That is not a valid game type.");
			}
			//Updates if you want to play again.
			System.out.println("Would you like to play again? Type 'yes' or 'no'");
			userChoice = myScanner.nextLine();
		}
	}
}
