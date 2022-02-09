package com.indusgrp.training.domain;

/**
 * 
 * @author shreegotteti
 * <p> Inputs to the Calci class
 */
public class CalciInput {
	
	private Double param1; 
	private Double param2;
	private String operator;
	
	/**
	 * 
	 */
	public CalciInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param param1
	 * @param param2
	 * @param operator
	 */
	public CalciInput(Double param1, Double param2, String operator) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.operator = operator;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		result = prime * result + ((param1 == null) ? 0 : param1.hashCode());
		result = prime * result + ((param2 == null) ? 0 : param2.hashCode());
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
		CalciInput other = (CalciInput) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "CalciInput [param1=" + param1 + ", param2=" + param2 + ", operator=" + operator + "]";
	} 
	
	
	

}
