package by.htp.task10.task05.Command;

import by.htp.task10.task05.service.*;

public interface Command {
	
	String execute(String request) throws ServiceException;

}