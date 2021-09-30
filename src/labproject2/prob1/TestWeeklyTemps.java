package labproject2.prob1;

public class TestWeeklyTemps {

	public static void main(String[] args) {
		
		//create an array of number parameter of temp class and name of the program
		double[] testTemps = {309, 88.3, 0.3, 100.3,56.3, 23.5, 99.3};
		WeeklyTemps lastWeek = new WeeklyTemps();
		
		System.out.println("TestWeeklyTemps\n");
		System.out.println("Weekly temperature data (degrees F):");
		
		//print mean, range and extreme day temp of lastWeek class
		System.out.printf("     Mean:      %.1f\n",lastWeek.getMean(testTemps));
		System.out.println("     Range:     "+lastWeek.getRange(testTemps));
		System.out.println("     Extreme temp days:  "+lastWeek.getExtreme(testTemps));
	}

}
