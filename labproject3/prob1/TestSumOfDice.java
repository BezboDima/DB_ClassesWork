package labproject3.prob1;

public class TestSumOfDice {

	public static void main(String[] args) {
		
		// Create SumOfDice object and run the simulation of 100 throws
		SumOfDice sumOfDice = new SumOfDice();
		sumOfDice.runSimulation();
		
		// get a list of occurrences
		int[] results = sumOfDice.getSimulatedResults();
		
		//Print frequency table
		System.out.println("Sum of dice           Occurences");
		System.out.println("-----------           ----------");
		
		for (int i = 2; i <= 12; i++) {
			
			System.out.print(i + "                     ");
			System.out.println(results[i]);
		}
		System.out.println();

		//Print frequency chart
		for(int i = 2; i <= 12; i++) {
			
			System.out.print(i + "  : ");
			for (int j = 1; j <= results[i]; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

}
}
