package state_pattern.states;

import state_pattern.context.Context;
import state_pattern.context.Fan;

public class FanLowState implements State {

	private Fan fan;
	private State nextState;

	public FanLowState(Context fan) {
		this.fan = (Fan) fan;
		nextState = new FanMediumState(fan);
	}

	@Override
	public void handleNextStateRequest() {
		System.out.println("Off -> Low");
		fan.setState(nextState);
	}

}
