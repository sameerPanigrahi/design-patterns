package command_pattern.commands;

import command_pattern.receiver.Light;

public class TurnLightOffCommand implements Command {

	Light light;

	public TurnLightOffCommand(Light light) {
		System.out.println("creating object for Command TurnLightOffCommand...");
		System.out.println("setting object of Receiver Light to object of Command TurnLightOffCommand...");
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}

}