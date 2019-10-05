package by.htp.taskAppliance.service;

import by.htp.taskAppliance.dao.DAOException;

@SuppressWarnings("serial")
public class ServiceException extends DAOException{
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(DAOException e) {
		super(e);
	}
	
	public ServiceException(String message) {
		super(message);
	}

}