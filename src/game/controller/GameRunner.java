package game.controller;

import game.controller.GameController;

public class GameRunner {
	public static void main (String [] args) {
		GameController gameController = new GameController();
		gameController.start();
	}
}
