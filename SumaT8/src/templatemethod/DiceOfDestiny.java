package templatemethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiceOfDestiny extends Game {
	
	private Map<Integer, Integer> playerScores;
	private int winner;
	private Random rand;
	final int GOAL = 15;

	@Override
	void initializeGame() {
		// TODO Auto-generated method stub
		winner = 0;
		rand = new Random();
		playerScores = new HashMap<>();
		
	}

	@Override
	void makePlay(int player) {
		// TODO Auto-generated method stub
		int diceRoll = rand.nextInt(6) + 1;
		
		if(playerScores.containsKey(player)) {
			playerScores.put(player, playerScores.get(player)+diceRoll);
		} else {
			playerScores.put(player, diceRoll);
		}
		System.out.println("Player " + player + " threw " + diceRoll);
		System.out.println();
	}

	@Override
	boolean endOfGame() {
		for(int i = 0 ; i < playerScores.size() ; i++) {
			if(playerScores.get(i) >= GOAL) {
				winner = i;
				
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		// TODO Auto-generated method stub
		System.out.println("Player " + winner + " reached " + GOAL + " points first with " + playerScores.get(winner) + " points and is the WINNER!!!");
	}

}
