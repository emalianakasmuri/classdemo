package demo.multithreads;

import demo.extthr.StatementPrinter;
import demo.imprun.NumberPrinter;

public class MultiThreadsJoinApp {

	public static void main(String[] args) {
				
		Thread statementThread = new StatementPrinter();
		
		Runnable numberable1 = new NumberPrinter();
		Thread numberThread1 = new Thread(numberable1, "Number 1");
		
		Thread numberThread2 = new Thread(numberable1, "Number 2");
		
		try {
		
			numberThread2.start();
			statementThread.start();
			numberThread1.start();
			
			numberThread2.join();
			statementThread.join();
			numberThread1.join();
			
			
			System.out.println("Program ends");
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

}


