package game.model;

public class Game {

	int computerScore;
	int playerScore;
	
	
	private String computerChoosesPlay()
	{
		String choice = "";
		int random = (int) (Math.random() * 3);
		switch (random)
		{
		case 0:
			choice = "R";
			break;
		case 1:
			choice = "P";
			break;
		case 2:
			choice = "S";
			break;
		}
		return choice;
	}
	
	public String calculateWinner(String playerInput)
	{
		String result = "";
		String computerMove = computerChoosesPlay();
		String playerMove = playerInput.toUpperCase();
		
		result = checkValidUserInput(playerMove);
		
		if (computerMove.equals("R") && playerMove.equals("S"))
		{
			result = "Rock beats Scissor, Computer Wins";
			computerScore += 1;
		}
		else if (computerMove.equals("P") && playerMove.equals("S"))
		{
			result = "Scissors cut Paper, Player wins";
			playerScore += 1;
		}
		else if (computerMove.equals("S") && playerMove.equals("R"))
		{
			result = "Rock beats Scissors, Player wins";
			playerScore += 1;
		}
		else if (computerMove.equals("P") && playerMove.equals("R"))
		{
			result = "Paper beats Rock, Computer wins";
			computerScore += 1;
		}
		else if (computerMove.equals("R") && playerMove.equals("P"))
		{
			result = "Paper beats Rock, Player wins";
			playerScore += 1;
		}
		else if(computerMove.equals("S") && playerMove.equals("P"))
		{
			result = "Scissor beats Paper, Computer wins";
			computerScore += 1;
		}
		else if(computerMove.equals("S") && playerMove.equals("S"))
		{
			result = "TIE!";
		}
		else if(computerMove.equals("P") && playerMove.equals("P"))
		{
			result = "TIE!";
		}
		else if(computerMove.equals("R") && playerMove.equals("R"))
		{
			result = "TIE!";
		}
		
		return result;
	}
	
	public String checkValidUserInput(String input)
	{
		String result = "Input is invalid";
		if (input.contains("QUIT"))
		{
			result = "END GAME. Player: " + playerScore + " Computer: " + computerScore; 
		}
		else if (input.equals("R") || input.equals("P") || input.equals("S"))
		{
			result = "";
		}
		return result;
	}
}
