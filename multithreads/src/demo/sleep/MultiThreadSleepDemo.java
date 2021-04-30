package demo.sleep;

public class MultiThreadSleepDemo {

	public static void main(String[] args) {
		
		Runnable numberable = new NumberPrinter();
		Thread numberThread = new Thread(numberable);
		numberThread.setName("numberThread");
		
		Thread statementThread = new StatementPrinter();
		statementThread.setName("statementThread");
		
		
		
		statementThread.start();
		numberThread.start();

	}

}
