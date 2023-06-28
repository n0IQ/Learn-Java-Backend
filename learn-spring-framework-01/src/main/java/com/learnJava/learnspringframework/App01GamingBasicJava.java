package com.learnJava.learnspringframework;

import com.learnJava.learnspringframework.game.GameRunner;
import com.learnJava.learnspringframework.game.MarioGame;
import com.learnJava.learnspringframework.game.PacmanGame;
import com.learnJava.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
