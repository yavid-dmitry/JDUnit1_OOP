package by.htp.taskAppliance.dao;

@SuppressWarnings("serial")
public class DAOException extends Exception{
	
	public DAOException() {
		super();
	}
	
	public DAOException(Exception e) {
		super(e);
	}
	
	public DAOException(String message) {
		super(message);
	}
	
	

}