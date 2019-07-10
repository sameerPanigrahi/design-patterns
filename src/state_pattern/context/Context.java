package state_pattern.context;

import state_pattern.states.State;

public interface Context {

	void setState(State state);

	State getState();

	void nextState();
}
