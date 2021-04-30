package demo.extthr;

public class StatementPrinter extends Thread {

	/**
	 * This method prints a statement for five times
	 */
	public void printStatement() {

		for (int counter = 0; counter < 5; counter++) {

			System.out.println("Java is easy");
		}
	}

	@Override
	public void run() {

		printStatement();

	}

}
