package hotel_reservation.controllers;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;



/**
 * Runs a predefined JUnit test suite and displays the test results
 */
public class TestRunner
{
	private static Result result;

	/**
	 * Main method
	 * Notes: replace "TestProject1" with the name of your test suite class
	 */
	public static void main (String [] args)
	{
		result = JUnitCore.runClasses(CheckIn_ControllerTest.class,Reservation_ControllerTest.class,CheckOut_ControllerTest.class,Manager_ControllerTest.class,Login_ControllerTest.class );

		System.out.println("Time taken to execute test suite: [" + millisecondsToSeconds(result.getRunTime()) + "] seconds");

		System.out.println("Number of tests executed: " + result.getRunCount());
		System.out.println("Number of tests failed: " + result.getFailureCount());
		System.out.println("Number of tests ignored: " + result.getIgnoreCount() + "\n");

		if (result.wasSuccessful()) {
			System.out.println("Tests executed successfully!\n");
		}
		else {
			System.out.println("Tests executed with " + result.getFailureCount() + " failure(s)\n");
			displayFailures(result.getFailures());
		}

	}

	/**
	 * Converts milliseconds to seconds
	 */
	private static float millisecondsToSeconds(long milliseconds)
	{
		return ((float) milliseconds / 1000);
	}

	/**
	 * Displays test failure information
	 */
	private static void displayFailures(List<Failure> failures)
	{
		System.out.println ("Failure Details: \n");
		int count = 0;

		for (Failure failure : failures)
		{
			System.out.println("Failure #" + ++count);
			System.out.println("Failure in : " + failure.getTestHeader());
			System.out.println(failure.getMessage() + "\n");
		}//end for
	}
}