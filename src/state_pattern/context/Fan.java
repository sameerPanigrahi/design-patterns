package state_pattern.context;

import state_pattern.states.State;

public class Fan implements Context {

	private State currentState;

	@Override
	public void nextState() {

		currentState.handleNextStateRequest();

	}

	@Override
	public void setState(State state) {

		currentState = state;
	}

	@Override
	public State getState() {
		return currentState;

	}

}
