package com.indusgrp.training.svc.impl;

import com.indusgrp.training.domain.CalciInput;
import com.indusgrp.training.domain.CalciOutput;
import com.indusgrp.training.exceptions.CalciException;
import com.indusgrp.training.svc.ICalci;

/**
 * 
 * @author shreegotteti
 * <p> This class provides the functionality of a Calculator. Addition, Subtraction, Multiplication, and Division
 */
public class Calci implements ICalci {

	/**
	 * This methods adds two numbers (CalciInput)
	 * @param calInObj CalciInput
	 * @return CalciOutput (sum of the two numbers)
	 * @throws CalciException
	 */
	public CalciOutput addition(CalciInput calInObj) throws CalciException {
		if (calInObj == null) {
			throw new CalciException("CalciException: CalciInput can't be null");
		}
		if (calInObj.getParam1() == null) {
			throw new CalciException("CalciException: CalciInput's param1 can't be null");
		}
		if (calInObj.getParam2() == null) {
			throw new CalciException("CalciException: CalciInput's param2 can't be null");
		}
		try {
			CalciOutput calOutObj = new CalciOutput();
			{
				Double param1 = calInObj.getParam1();
				Double param2 = calInObj.getParam2();
				String operator = calInObj.getOperator();
				Double result = param1 + param2;
				calOutObj.setOperator(operator);
				calOutObj.setParam1(param1);
				calOutObj.setParam2(param2);
				calOutObj.setResult(result);
			}
			return calOutObj;
		} catch (Exception ex) { // when we cant to be able to catch any unforeseen exception
			throw new CalciException("CalciException: An un-foreseen exception has occurred.", ex);
		}
	}

	/**
	 * This methods subtracts two numbers (CalciInput)
	 * @param calInObj CalciInput
	 * @return CalciOutput (difference of the two numbers)
	 * @throws CalciException
	 */
	public CalciOutput subtraction(CalciInput calInObj) throws CalciException {
		if (calInObj == null) {
			throw new CalciException("CalciException: CalciInput can't be null");
		}
		if (calInObj.getParam1() == null) {
			throw new CalciException("CalciException: CalciInput's param1 can't be null");
		}
		if (calInObj.getParam2() == null) {
			throw new CalciException("CalciException: CalciInput's param2 can't be null");
		}
		try {
			CalciOutput calOutObj = new CalciOutput();
			{
				Double param1 = calInObj.getParam1();
				Double param2 = calInObj.getParam2();
				String operator = calInObj.getOperator();
				Double result = param1 - param2;
				calOutObj.setOperator(operator);
				calOutObj.setParam1(param1);
				calOutObj.setParam2(param2);
				calOutObj.setResult(result);
			}
			return calOutObj;
		} catch (Exception ex) { // when we cant to be able to catch any unforeseen exception
			throw new CalciException("CalciException: An un-foreseen exception has occurred.", ex);
		}
	}

	/**
	 * This methods multiplies two numbers (CalciInput)
	 * @param calInObj CalciInput
	 * @return CalciOutput (multiplication of the two numbers)
	 * @throws CalciException
	 */
	public CalciOutput multiplication(CalciInput calInObj) throws CalciException {
		if (calInObj == null) {
			throw new CalciException("CalciException: CalciInput can't be null");
		}
		if (calInObj.getParam1() == null) {
			throw new CalciException("CalciException: CalciInput's param1 can't be null");
		}
		if (calInObj.getParam2() == null) {
			throw new CalciException("CalciException: CalciInput's param2 can't be null");
		}
		try {
			CalciOutput calOutObj = new CalciOutput();
			{
				Double param1 = calInObj.getParam1();
				Double param2 = calInObj.getParam2();
				String operator = calInObj.getOperator();
				Double result = param1 * param2;
				calOutObj.setOperator(operator);
				calOutObj.setParam1(param1);
				calOutObj.setParam2(param2);
				calOutObj.setResult(result);
			}
			return calOutObj;
		} catch (Exception ex) { // when we cant to be able to catch any unforeseen exception
			throw new CalciException("CalciException: An un-foreseen exception has occurred.", ex);
		}
	}

	/**
	 * This methods divides two numbers (CalciInput)
	 * @param calInObj CalciInput
	 * @return CalciOutput (quotient of the two numbers)
	 * @throws CalciException
	 */
	public CalciOutput division(CalciInput calInObj) throws CalciException {
		if (calInObj == null) {
			throw new CalciException("CalciException: CalciInput can't be null");
		}
		if (calInObj.getParam1() == null) {
			throw new CalciException("CalciException: CalciInput's param1 can't be null");
		}
		if (calInObj.getParam2() == null) {
			throw new CalciException("CalciException: CalciInput's param2 can't be null");
		}
		if (calInObj.getParam2() == 0.0) {
			throw new CalciException("CalciException: CalciInput's param2 can't be 0.0", new ArithmeticException());
		}
		try {
			CalciOutput calOutObj = new CalciOutput();
			{
				Double param1 = calInObj.getParam1();
				Double param2 = calInObj.getParam2();
				String operator = calInObj.getOperator();
				Double result = param1 / param2;
				calOutObj.setOperator(operator);
				calOutObj.setParam1(param1);
				calOutObj.setParam2(param2);
				calOutObj.setResult(result);
			}
			return calOutObj;
		} catch (Exception ex) { // when we cant to be able to catch any unforeseen exception
			throw new CalciException("CalciException: An un-foreseen exception has occurred.", ex);
		}
	}
}
