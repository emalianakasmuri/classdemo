package demo.imprun;

public class NumberPrinter implements Runnable {

	public void printNumbers () {

		for (int counter = 0; counter < 5; counter++) {
			System.out.println(counter);
		}
	}

	@Override
	public void run() {
		
		printNumbers( );
		
	}
}



