package game.controller;

import java.util.Scanner;

import game.model.Game;

public class GameController {
	
	Game game;
	Scanner inputScanner;
	
	public GameController()
	{
		this.game = new Game();
	}
	
	public void start()
	{
		System.out.println("WELCOME TO: ROCK PAPER SCISSORS");
		System.out.println("Type 'R', 'P', 'S', or 'quit'");
		
		String choice = "";
		while (!choice.equals("quit"))
		{

			inputScanner = new Scanner(System.in);
			choice = inputScanner.next();
			
			
			System.out.println(game.calculateWinner(choice));
			choice = "";
		}
		inputScanner.close();
	}
}
