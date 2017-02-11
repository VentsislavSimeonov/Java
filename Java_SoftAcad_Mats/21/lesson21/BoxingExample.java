package lesson21;

public class BoxingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		long startTime = System.nanoTime();
		for (Integer i = 0; i < 1000000000; i++) {
			//System.out.print(i);
		}
		
		long medTime = System.nanoTime();
		
		for (int i = 0; i < 1000000000; i++) {
			//System.out.print(i);
		}
		
		long endTime = System.nanoTime();
		
		long dur1 = medTime - startTime;
		long dur2 = endTime - medTime;
		
		double ratio = dur1 / dur2;
		System.out.println("ratio " + ratio);
		System.out.println("duration without boxing: "  + dur2);
		System.out.println("duration with    boxing: " + dur1);
		
		// Output on my PC
		// ratio 3401.0
		// duration without boxing 1063675
		// duration with    boxing 3617909547


	}

}
