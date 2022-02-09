package com.indusgrp.training.domain;

/**
 * 
 * @author shreegotteti
 * <p> This is output template for Calci class results
 */
public class CalciOutput {
	
	private Double param1; 
	private Double param2;
	private String operator;
	private Double result;
	
	/**
	 * Default Constructor
	 */
	public CalciOutput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is an overloaded constructor
	 * @param param1 : Double
	 * @param param2 : Double
	 * @param operator : String
	 * @param result : Double
	 */
	public CalciOutput(Double param1, Double param2, String operator, Double result) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.operator = operator;
		this.result = result;
	}

	/**
	 * this methods return param1
	 * @return param1 Double
	 */
	public Double getParam1() {
		return param1;
	}
	
	/**
	 * this methods sets the value of param1
	 * @param param1 Double
	 */
	public void setParam1(Double param1) {
		this.param1 = param1;
	}
	
	/**
	 * this methods return param2
	 * @return Double
	 */
	public Double getParam2() {
		return param2;
	}

	/**
	 * this methods sets the value of  param2
	 * @param param2 Double
	 */
	public void setParam2(Double param2) {
		this.param2 = param2;
	}
	
	/**
	 * This method returns the operator
	 * @return operator String
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * This method helps set the value of the operator to a new value. 
	 * @param operator String
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * This method returns the
	 * @return result Double
	 */
	public Double getResult() {
		return result;
	}

	/**
	 * This method sets the result
	 * @param result
	 */
	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((param1 == null) ? 0 : param1.hashCode());
		result = prime * result + ((param2 == null) ? 0 : param2.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalciOutput other = (CalciOutput) obj;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		if (param1 == null) {
			if (other.param1 != null)
				return false;
		} else if (!param1.equals(other.param1))
			return false;
		if (param2 == null) {
			if (other.param2 != null)
				return false;
		} else if (!param2.equals(other.param2))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}
    

	@Override
	public String toString() {
		return "CalciOutput [param1=" + param1 + ", param2=" + param2 + ", operator=" + operator + ", result=" + result
				+ "]";
	} 
	
	
}
