package command_pattern.commands;

import command_pattern.receiver.Light;

public class TurnLightOnCommand implements Command {

	Light light;

	public TurnLightOnCommand(Light light) {
		System.out.println("creating object for Command TurnLightOffCommand...");
		System.out.println("setting object of Receiver Light to object of Command TurnLightOffCommand...");
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}

}