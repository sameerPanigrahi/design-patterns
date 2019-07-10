package state_pattern.states;

import state_pattern.context.Context;
import state_pattern.context.Fan;

public class FanHighState implements State {

	private Fan fan;
	private State nextState;

	public FanHighState(Context fan) {
		this.fan = (Fan) fan;
		// nextState = new FanOffState(fan);
	}

	@Override
	public void handleNextStateRequest() {
		System.out.println("Medium -> High");
		fan.setState(nextState);
	}

}
