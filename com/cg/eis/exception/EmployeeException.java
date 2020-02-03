package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception
{
	public EmployeeException(String message)
	{
		super(message);
	}
	public void check(int salary) throws EmployeeException
	{
		if(salary<3000)
		{
			throw new EmployeeException("salary of the employee is below 3000");
		}
	}
}
