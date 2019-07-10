package command_pattern.invoker;

import command_pattern.commands.Command;

// invoker
public class LightSwitch {

	public LightSwitch() {
		System.out.println("creating object for Invoker LightSwitch");
	}

	public void execute(Command command) {
		command.execute();
	}
}
