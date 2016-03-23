package controller;

import java.util.Scanner;

public class Controller
{
	private Scanner myScanner;
	
	public Controller()
	{
		myScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		play();
	}
	
	private void play()
	{
		String userChoice = "yes";
		while(userChoice.toLowerCase().contains("yes"))
		{
			System.out.println("Type 'single' for a single player game, or 'two' for a 2 player game");
			String gameMode = myScanner.nextLine();
			if(gameMode.toLowerCase().contains("single"))
			{
				System.out.println("Type 'rock', 'paper', or 'scissors'.");
				String userAnswer = myScanner.nextLine();
				double computerAnswer = Math.random() * 3;
				if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 1)
				{
					System.out.println("You win.");
				}
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 2)
				{
					System.out.println("I win.");
				}
				else if(userAnswer.toLowerCase().contains("rock") && computerAnswer < 3)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 1)
				{
					System.out.println("I win.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 2)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("paper") && computerAnswer < 3)
				{
					System.out.println("You win.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 1)
				{
					System.out.println("It's a tie.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 2)
				{
					System.out.println("You win.");
				}
				else if(userAnswer.toLowerCase().contains("scissors") && computerAnswer < 3)
				{
					System.out.println("I win.");
				}
			}
			else if(gameMode.toLowerCase().contains("two"))
			{
				System.out.println("Type 'rock', 'paper', or 'scissors'.");
				String userAnswer = myScanner.nextLine();
				System.out.println("Player 2, type your answer.");
				String computerAnswer = myScanner.nextLine();
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
			System.out.println("Would you like to play again? Type 'yes' or 'no'");
			userChoice = myScanner.nextLine();
		}
	}
}
