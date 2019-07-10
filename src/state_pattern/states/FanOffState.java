package state_pattern.states;

import state_pattern.context.Context;
import state_pattern.context.Fan;

public class FanOffState implements State {

	private Fan fan;
	private State nextState;

	public FanOffState(Context fan) {
		this.fan = (Fan) fan;
		nextState = new FanLowState(fan);
	}

	@Override
	public void handleNextStateRequest() {
		System.out.println("Fan off");
		fan.setState(nextState);
	}

}
