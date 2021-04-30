package demo.sleep;

public class StatementPrinter extends Thread {

	/**
	 * This method prints a statement for five times
	 */
	public void printStatement() {

		try {
			for (int counter = 0; counter < 5; counter++) {
	
				System.out.println("Java is easy");
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {

		printStatement();

	}

}
