package state_pattern.states;

import state_pattern.context.Context;
import state_pattern.context.Fan;

public class FanMediumState implements State {

	private Fan fan;
	private State nextState;

	public FanMediumState(Context fan) {
		this.fan = (Fan) fan;
		nextState = new FanHighState(fan);
	}

	@Override
	public void handleNextStateRequest() {
		System.out.println("Low -> Medium");
		fan.setState(nextState);
	}

}
