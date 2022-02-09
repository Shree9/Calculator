/**
 * 
 */
package com.indusgrp.training.svc;

import com.indusgrp.training.domain.CalciInput;
import com.indusgrp.training.domain.CalciOutput;
import com.indusgrp.training.exceptions.CalciException;
import com.indusgrp.training.svc.impl.Calci;

import junit.framework.TestCase;

/**
 * @author shreegotteti
 * <p> This is a JUnit test case for Calci class
 */
public class TestCalci extends TestCase {

	private ICalci calObj = null; 
	
	protected void setUp() throws Exception {
		super.setUp();
		calObj = new Calci(); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		calObj = null;
	}

	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#addition(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testAdditionGood() {
		try {
			CalciInput calInObj = new CalciInput(10.0, 30.0, "Addition"); 
			CalciOutput expCalOutObj = new CalciOutput(10.0, 30.0, "Addition", 40.0); 
			CalciOutput calOutObj = calObj.addition(calInObj); 
			assertEquals(calOutObj, expCalOutObj); 
		} catch(Exception ex) {
			fail("Exception shouldn't have been thrown"); 
		}
	}
	
	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#addition(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testAdditionException() {
		try {
			CalciInput calInObj = new CalciInput(null, 30.0, "Addition"); 
			CalciOutput calOutObj = calObj.addition(calInObj); 
		} catch(Exception ex) {
			assertEquals(true, ex instanceof CalciException); 
		}
	}

	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#subtraction(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testSubtractionGood() {
		try {
			CalciInput calInObj = new CalciInput(10.0, 5.0, "Subtraction"); 
			CalciOutput expCalOutObj = new CalciOutput(10.0, 5.0, "Subtraction", 5.0); 
			CalciOutput calOutObj = calObj.subtraction(calInObj); 
			assertEquals(calOutObj, expCalOutObj); 
		} catch(Exception ex) {
			fail("Exception shouldn't have been thrown"); 
		}
	}
	
	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#subtraction(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testSubtractionException() {
		try {
			CalciInput calInObj = new CalciInput(null, 30.0, "Subtraction"); 
			CalciOutput calOutObj = calObj.subtraction(calInObj); 
		} catch(Exception ex) {
			assertEquals(true, ex instanceof CalciException); 
		}
	}


	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#multiplication(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testMultiplicationGood() {
		try {
			CalciInput calInObj = new CalciInput(10.0, 3.0, "Multiplication"); 
			CalciOutput expCalOutObj = new CalciOutput(10.0, 3.0, "Multiplication", 30.0); 
			CalciOutput calOutObj = calObj.multiplication(calInObj); 
			assertEquals(calOutObj, expCalOutObj); 
		} catch(Exception ex) {
			fail("Exception shouldn't have been thrown"); 
		}
	}
	
	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#multiplication(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testMultiplicationException() {
		try {
			CalciInput calInObj = new CalciInput(null, 30.0, "Multiplication"); 
			CalciOutput calOutObj = calObj.multiplication(calInObj); 
		} catch(Exception ex) {
			assertEquals(true, ex instanceof CalciException); 
		}
	}


	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#division(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testDivisionGood() {
		try {
			CalciInput calInObj = new CalciInput(30.0, 3.0, "Multiplication"); 
			CalciOutput expCalOutObj = new CalciOutput(30.0, 3.0, "Multiplication", 10.0); 
			CalciOutput calOutObj = calObj.division(calInObj); 
			assertEquals(calOutObj, expCalOutObj); 
		} catch(Exception ex) {
			fail("Exception shouldn't have been thrown"); 
		}
	}
	
	/**
	 * Test method for {@link com.indusgrp.training.svc.impl.Calci#division(com.indusgrp.training.domain.CalciInput)}.
	 */
	public void testDivisionException() {
		try {
			CalciInput calInObj = new CalciInput(null, 30.0, "Division"); 
			CalciOutput calOutObj = calObj.division(calInObj); 
		} catch(Exception ex) {
			assertEquals(true, ex instanceof CalciException); 
		}
	}


}
