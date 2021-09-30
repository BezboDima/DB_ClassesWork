package labproject2.prob1;

public class WeeklyTemps {
	

	/**
	 * return the maximum temperature of the array
	 * @param temps
	 * @return double
	 */
	public double getMax (double [] temps) {
		
		double max = temps[0];
		for (int i = 1; i < temps.length; i++) {
			if (temps[i] > max) {
				max = temps[i];
			}
		}
		
		return max;
	}
	
	/**
	 * return the minimum temperature of the array
	 * @param temps
	 * @return double
	 */
	public double getMin (double [] temps) {
		double min = temps[0];
		for (int i = 1; i < temps.length; i++) {
			if (temps[i] < min) {
				min = temps[i];
			}
		}
		
		return min;
	}
	
	/**
	 * return the range of temperature of the array(min - max)
	 * @param temps
	 * @return string
	 */
	public String getRange (double [] temps) {
		
		double min = getMin(temps);
		double max = getMax(temps);
		 
		String range = String.format("%.1f - %.1f", min , max);
		 
		return range;
	}
	
	/**
	 * return the mean temperature of the array
	 * @param temps
	 * @return double
	 */
	public double getMean(double [] temps) {
		
		double sum = 0.0;
		for (int i = 0; i < temps.length; i++) {
			sum += temps[i];
		}
		double mean = sum/temps.length;
		
		return mean;
	}
	
	/**
	 * 
	 * return the number of days where temp was <= 5 or >=90
	 * @param temps
	 * @return int
	 */
	public int getExtreme(double [] temps) {
		
		int count = 0;
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] <= 5 || temps[i]>= 90) {
				count++;
			}
		}

		return count;
	}
}
