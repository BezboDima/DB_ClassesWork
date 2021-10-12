package labproject3.prob1;

public class SumOfDice {
	
	private int[] occurences = new int [14];
		
	/**
	 * returns an array of occurrences of the dice
	 * @return
	 */
	public int[] getSimulatedResults() {
		return occurences;
	}
	/**
	 * run Simulation of 2 dices for 100 times 
	 * and input its sum to occurrences (index = sum of dice)
	 */
	public void runSimulation() {
		for (int i  = 0; i < 100; i++) {
			int roll1 = rollDice();
			int roll2 = rollDice();
			
			int sum = roll1 + roll2;
			
			occurences[sum]++;
		}
	}

	/**
	 * Simulate roll of a single die. 
	 * 
	 * @return integer between 1 and 6
 	*/
	private int rollDice() 
	{
		int max = 6;
		int min = 1;
		int range = max - min + 1;
		
		int result = (int) (Math.random() * range)+min;
		
		return result;
	}
	
}
