package com.imaginnovate.employee.exceptionhandler;

public class EmployeeException  extends RuntimeException {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 7777211822048256265L;
	private String message;
	
 
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeException() {}
 
    public EmployeeException(String msg)
    {
        this.message = msg;
    }
}
