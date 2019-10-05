package by.htp.task10.task05.service;

@SuppressWarnings("serial")
public class ServiceException extends Exception{
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
	
	public ServiceException(String message) {
		super(message);
	}

}