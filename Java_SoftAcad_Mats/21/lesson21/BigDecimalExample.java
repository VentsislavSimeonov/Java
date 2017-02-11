package lesson21;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

public class BigDecimalExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BigDecimal bd = new BigDecimal("66666666666666666666666666666666666666666666666666666666666655.5");
		BigDecimal bd1 = BigDecimal.valueOf(3.301d);
		
		BigDecimal sum = bd.add(bd1);
		BigDecimal mul = bd.multiply(bd1);
		
		
		double d = Double.valueOf("999999999999.12345");
		NumberFormat nf = DecimalFormat.getNumberInstance();
		System.out.println(nf.format(d));
		// Output is: 999,999,999,999.123 
		// the last 2 digits are cut!!! 
		
		// System.out.println(d);
		
		BigDecimal dBigDecimal = new BigDecimal("999999999999.12345");
		System.out.println("999999999999.12345 in big decimal " + dBigDecimal);
		
		System.out.println("sum " + sum);
		System.out.println("multiplication " + mul);
	}

}
