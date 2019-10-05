package by.htp.task10.task05.Command;

import java.util.HashMap;
import java.util.Map;

import by.htp.task10.task05.Command.impl.CreateGiftCommand;



public class CommandProvider {
	
	private Map<String, Command> commands;

	public CommandProvider() {
		commands = new HashMap<String, Command>();
		
		commands.put("createGift", new CreateGiftCommand());

	}
	
	public Command getCommand(String CommandName) {
		Command command;
		command = commands.get(CommandName);
		return command;
		
	}
	
	

}