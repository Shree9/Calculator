package com.indusgrp.training.ui;

import java.io.Console;

import com.indusgrp.training.domain.CalciInput;
import com.indusgrp.training.domain.CalciOutput;
import com.indusgrp.training.exceptions.CalciException;
import com.indusgrp.training.svc.impl.Calci;

/**
 * 
 * @author shreegotteti
 *<p> This class provides user interface for Calci class with following operations: Addition, Subtraction, Multiplication, and Division
 *
 */
public class CalciUI {

	/**
	 * This method displays the inputs and results of the calculator operations on to the console
	 * @param consoleObj Console object (to write)
	 * @param calInObj CalciInput (inputs to Calci)
	 * @param calOutObj CalciOutput (output of the operation performed by the Calci)
	 */
	public static void displayResults(Console consoleObj, CalciInput calInObj, CalciOutput calOutObj) {
		consoleObj.writer().println(calInObj);
		consoleObj.writer().println(calOutObj);
		consoleObj.writer().println("---------------------------");
	}

	/**
	 * This method gets the input parameters for the Calci operations.
	 * @param consoleObj consoleObj Console object (to write, and read inputs)
	 * @param operation String (operation to be performed)
	 * @return CalciInput (Inputs to Calci)
	 */
	public static CalciInput getParams(Console consoleObj, String operation) {
		CalciInput calInObj = new CalciInput();
		consoleObj.writer().println("---------------------------");
		consoleObj.writer().println("You have chosen " + operation);
		calInObj.setOperator(operation);
		consoleObj.writer().println("Please enter a number:");
		String strParam1 = consoleObj.readLine();
		Double dblParam1 = Double.parseDouble(strParam1);
		calInObj.setParam1(dblParam1);
		consoleObj.writer().println("Please enter a number:");
		String strParam2 = consoleObj.readLine();
		Double dblParam2 = Double.parseDouble(strParam2);
		calInObj.setParam2(Double.parseDouble(strParam2));
		return calInObj;
	}

	/**
	 * User Interface for Calci Class
	 * @param args: command line arguments (variable length)
	 * @throws CalciException 
	 */
	public static void main(String[] args) throws CalciException {
		boolean flag = true;
		Console consoleObj = System.console();
		if(consoleObj == null) {
			System.out.println("Console is not open.");
		}
		else {
			Calci calObj = new Calci();
			do {
				consoleObj.writer().println("Please select an operation.");
				consoleObj.writer().println("1. Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Exit");
				String strOption = consoleObj.readLine();
				CalciOutput calOutObj = null;
				CalciInput calInObj = null;
				switch (strOption) {
					case "1":
						calInObj = getParams(consoleObj, "Addition");
						calOutObj = calObj.addition(calInObj);
						displayResults(consoleObj, calInObj, calOutObj);
						break;
					case "2":
						calInObj = getParams(consoleObj, "Addition");
						calOutObj = calObj.subtraction(calInObj);
						displayResults(consoleObj, calInObj, calOutObj);
						break;
					case "3":
						calInObj = getParams(consoleObj, "Addition");
						calOutObj = calObj.multiplication(calInObj);
						displayResults(consoleObj, calInObj, calOutObj);
						break;
					case "4":
						calInObj = getParams(consoleObj, "Addition");
						calOutObj = calObj.division(calInObj);
						displayResults(consoleObj, calInObj, calOutObj);
						break;
					default:
						flag = false;
						break;
				}
			} while(flag);
		}
		
	}
}
