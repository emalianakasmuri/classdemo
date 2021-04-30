package demo.naming;

public class NumberPrinter implements Runnable {

	public void printNumbers (String currentThread) {

		for (int counter = 0; counter < 5; counter++) {
			
			System.out.println(currentThread + "->" + counter);
		}
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printNumbers( currentThread.getName());
		
	}
}



