package agent_AB;

import agent_AB.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		if (p.getLocationState() ==(LocationState.DIRTY)) {
			return new DynamicAction("SUCK");
		}else {
			if (p.getAgentLocation() == Environment.LOCATION_A) {
				return Environment.MOVE_RIGHT;
			} else {
				return Environment.MOVE_LEFT;
			}
		}
//		return NoOpAction.NO_OP;
		
	}
}