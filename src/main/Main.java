package main;

import command_pattern.commands.Command;
import command_pattern.commands.TurnLightOffCommand;
import command_pattern.commands.TurnLightOnCommand;
import command_pattern.invoker.LightSwitch;
import command_pattern.receiver.Light;
import state_pattern.context.Fan;
import state_pattern.states.FanOffState;

public class Main {

	public static void main(String[] args) {

		// demo - Command pattern
		// commandPattern();

		// demo - State Pattern
		statePattern();

	}

	private static void statePattern() {

		// create context - fan, starting with Off state
		Fan fan = new Fan();
		fan.setState(new FanOffState(fan));

		// low state
		fan.nextState();

		// medium state
		fan.nextState();

		// high state
		fan.nextState();

		// off state
		fan.nextState();

	}

	private static void commandPattern() {

		// receiver
		Light light = new Light();

		// invoker
		LightSwitch lightSwitch = new LightSwitch();

		// command for the receiver
		Command turnLightOnCommand = new TurnLightOnCommand(light);
		Command turnLightOffCommand = new TurnLightOffCommand(light);

		lightSwitch.execute(turnLightOnCommand);

		lightSwitch.execute(turnLightOffCommand);

	}

}