package by.htp.task10.task05.Controller;

import by.htp.task10.task05.Command.*;
import by.htp.task10.task05.service.ServiceException;

public class Controller {
private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) {
		
		String commandName;
		Command command;
		String response;
		
		commandName = request.split(" ")[0];
		
		command = provider.getCommand(commandName);
		
		try {
			response = command.execute(request);
		} catch (ServiceException e) {
			response = e.getMessage();;
		}
		
		return response;
		
	}
	
}