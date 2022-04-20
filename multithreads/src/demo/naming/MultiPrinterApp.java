package demo.naming;

/**
 * This class demonstrate two approaches to name the threads.
 * 
 * @author emalianakasmuri
 *
 */
public class MultiPrinterApp {

	public static void main(String[] args) {

		// Create objects of runnable
		Runnable numberPrinter1 = new NumberPrinter();
		Runnable numberPrinter2 = new NumberPrinter();
		
		// Approach 1: Name the thread using constructor
		Thread printerThread1 = new Thread(numberPrinter1, "printerThread1");
		
		// Approach 2: Name the thread using setName( )
		Thread printerThread2 = new Thread(numberPrinter2);
		printerThread2.setName("printerThread2");
		
		// Execute thread
		printerThread2.start();
		printerThread1.start();
		
		System.out.println("Program ends");

	}

}

