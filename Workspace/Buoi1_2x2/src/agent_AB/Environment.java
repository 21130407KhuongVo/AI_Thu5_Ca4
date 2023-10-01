package agent_AB;

public class Environment {
	public static final Action MOVE_LEFT = new DynamicAction("LEFT");
	public static final Action MOVE_RIGHT = new DynamicAction("RIGHT");
	public static final Action MOVE_UP = new DynamicAction("UP");
	public static final Action MOVE_DOWN = new DynamicAction("DOWN");
	public static final Action SUCK_DIRT = new DynamicAction("SUCK");
	public static final String LOCATION_A = "A";
	public static final String LOCATION_B = "B";
	public static final String LOCATION_C = "C";
	public static final String LOCATION_D = "D";

	public enum LocationState {
		CLEAN, DIRTY
	}

	private EnvironmentState envState;
	private boolean isDone = false;// all squares are CLEAN
	private Agent agent = null;

	public Environment(LocationState locAState, LocationState locBState, LocationState locCState,
			LocationState locDState) {
		envState = new EnvironmentState(locAState, locBState, locCState, locDState);
	}

	// add an agent into the environment
	public void addAgent(Agent agent, String location) {
		// TODO
		this.agent = agent;
		this.envState.setAgentLocation(location);
	}

	public EnvironmentState getCurrentState() {
		return this.envState;
	}

	// Update enviroment state when agent do an action
	public EnvironmentState executeAction(Action action) {
		String agentLocation = envState.getAgentLocation();
		if (action.toString().equals(Environment.SUCK_DIRT.toString())) {
			envState.setLocationState(agentLocation, LocationState.CLEAN);
		} else {
//			if (action.toString().equals(Environment.MOVE_LEFT.toString())) {
//				envState.setAgentLocation(LOCATION_A);
//			} else {
//				envState.setAgentLocation(LOCATION_B);
//			}

			if (action.toString().equals(MOVE_UP.toString())) {
				if (agentLocation.toString().equals(LOCATION_C.toString())) {
					envState.setAgentLocation(LOCATION_C);
				} else if (agentLocation.toString().equals(LOCATION_D.toString())) {
					envState.setAgentLocation(LOCATION_A);
				}
			} else if (action.toString().equals(MOVE_DOWN.toString())) {
				if (agentLocation.equals(LOCATION_A.toString())) {
					envState.setAgentLocation(LOCATION_D);
				} else if (agentLocation.equals(LOCATION_B)) {
					envState.setAgentLocation(LOCATION_C);
				}
			} else if (action.toString().equals(MOVE_LEFT.toString())) {
				if (agentLocation.equals(LOCATION_B.toString())) {
					envState.setAgentLocation(LOCATION_A);
				} else if (agentLocation.equals(LOCATION_C)) {
					envState.setAgentLocation(LOCATION_D);
				}
			} else if (action.toString().equals(MOVE_RIGHT.toString())) {
				if (agentLocation.equals(LOCATION_A.toString())) {
					envState.setAgentLocation(LOCATION_B);
				} else if (agentLocation.equals(LOCATION_D)) {
					envState.setAgentLocation(LOCATION_C);
				}
			}
		}

		return envState;
	}

	// get percept<AgentLocation, LocationState> at the current location where agent
	// is in.
	public Percept getPerceptSeenBy() {

		String agentLocation = envState.getAgentLocation();
		Percept p = new Percept(agentLocation, envState.getLocationState(agentLocation));

		return p;
	}

	public void step() {
		envState.display();
		String agentLocation = this.envState.getAgentLocation();
		Action anAction = agent.execute(getPerceptSeenBy());
		EnvironmentState es = executeAction(anAction);

		System.out.println("Agent Loc.: " + agentLocation + "\tAction: " + anAction);

		if ((es.getLocationState(LOCATION_A) == LocationState.CLEAN)
				&& (es.getLocationState(LOCATION_B) == LocationState.CLEAN)
				&& (es.getLocationState(LOCATION_C) == LocationState.CLEAN)
				&& (es.getLocationState(LOCATION_D) == LocationState.CLEAN))
			isDone = true;// if both squares are clean, then agent do not need to do any action
		es.display();
	}

	public void step(int n) {
		int point = 0;
		for (int i = 0; i < n; i++) {
			step();
			System.out.println("-------------------------");
		}
	}

	public void stepUntilDone() {
		int i = 0;

		while (!isDone) {
			System.out.println("step: " + i++);
			step();
		}
	}
}
