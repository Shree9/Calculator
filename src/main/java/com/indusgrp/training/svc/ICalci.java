package com.indusgrp.training.svc;

import com.indusgrp.training.domain.CalciInput;
import com.indusgrp.training.domain.CalciOutput;
import com.indusgrp.training.exceptions.CalciException;

/**
 * 
 * @author shreegotteti
 *
 */
public interface ICalci {
	
	public CalciOutput addition(CalciInput calInObj) throws CalciException; 
	public CalciOutput subtraction(CalciInput calInObj) throws CalciException;
	public CalciOutput multiplication(CalciInput calInObj) throws CalciException;
	public CalciOutput division(CalciInput calInObj) throws CalciException;
	
}
