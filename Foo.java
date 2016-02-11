package com.coresuite.android.playground;

import android.util.Log;
/**
 * Do not use * for the import, import the class you need. This is done
 * automatically in most of the IDEs
 */
import android.widget.Button;

/**
 * The class description goes here. Try to make it comprehensive. The
 * name of the class should also identify easily the purpose of the class.
 * <p/>
 * Make all the class naming consistent along the application (use Managers,
 * Subscribers, Events, etc... and do not use two names for the same
 * class type)
 * <p/>
 * Classes start with uppercase letter
 *
 * @author Enrique López-Mañas
 * @version 0.1.1 10 February 2016
 */
public class Foo {

	/* A class implementation comment can go here. */

	/**
	 * aStaticVariable Do not use Hungarian Notation. Jake Wharton
	 * exposed a few good arguments in
	 * http://jakewharton.com/just-say-no-to-hungarian-notation/
	 */
	public static int aStaticVariable;

	/**
	 * anObject documentation needs to be written in more
	 * than one line
	 */
	private Object anObject;

	/**
	 * MAGIC_NUMBER put in variables the magic numbers, and avoid
	 * hardcoding names. Program for others, and do not assume
	 * everybody is a wizard.
	 *
	 * Constants have uppercase names and descriptives names
	 */
	private final double MAGIC_NUMBER_FOR_A_CALCULATION = 123456789.1234;


	/**
	 * Use full naming, and avoid abbreviations like btn. You do not
	 * need to save space here, is more important to provide a good
	 * reading experience.
	 *
	 * Begin also with the name of the functionality. Reason:
	 * alphabetical sorting
	 */
	private Button loginButton;

	/**
	 * Include units in a name.
	 */
	private int distanceInMeters;

	/**
	 * Do not over-comment. We all know what a constructor is
	 * doing
	 */
	public Foo() {
	}

	/**
	 * Blocks that are indented more should be indented more.
	 * Blocks that are nested should be indented the same.
	 *
	 * In case of doubt with Android Studio, press
	 * command + alt + L
	 */
	public void indentationFunction() {
		if (true) {
			if (false) {
				if (true) {
					Log.i("Coding Guidelines", "We have the");
					Log.i("Coding Guidelines", "same indentation");
				}
			}
		}
	}

	/**
	 * Use always brackets, even if it is a single line. You do not
	 * want to be like Apple.
	 *
	 * https://blog.codecentric.de/en/2014/02/curly-braces/
	 *
	 * Use also the bracket in the same line as the function with
	 * a blank space. That way you show visually when the
	 * code starts.
	 *
	 */
	public void useIfElseAndBrackets() {
		if (true) {
			if (false) {
				if (true) {
					Log.i("Coding Guidelines", "Brackets are cool");
				}
			}
		}
	}

	/**
	 * Rather than a big method, use as many as possible to make
	 * things breakable into smaller pieces
	 */
	public void oneMethod() {
		anotherMethod();
	}

	public void anotherMethod() {
		theLastMethod();
	}

	public void theLastMethod() {
		Log.i("Coding Guidelines", "This method does a thing");
	}

	/**
	 * Multiple returns can increase readability
	 */
	private void functionWithMultipleReturns() {
		if (true) {
			return;
		}
		if (false) {
			return;
		}
		Log.i("Coding Guidelines", "Do your stuff here");
	}

	/**
	 * Limit scope of variables
	 */
	private void limitScopeOfVariables() {
		if (true) {
			double doubleNumber = someCalculation();
			doSomethingWith(doubleNumber);
		} else {
			Log.i("Coding Guidelines", "Nothing to do here");
		}

	}

	private double someCalculation() {
		return MAGIC_NUMBER_FOR_A_CALCULATION;
	}

	private void doSomethingWith(double variable) {

	}

	/**
	 * When splitting a line, use two tabs
	 */
	private void splittingLines() {
		String aString =
				"I am a beautiful string";
	}
}
