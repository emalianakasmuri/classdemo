package demo.sleep;

public class NumberPrinter implements Runnable {

	public void printNumbers (String threadName) {
		
		try {
			for (int counter = 0; counter < 5; counter++) {
				System.out.println(threadName + "-> " + counter);
				Thread.sleep(3000);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printNumbers(currentThread.getName() );
		
	}
}



