package agent_AB;

import agent_AB.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		if (p.getLocationState() ==(LocationState.DIRTY)) {
			return new DynamicAction("SUCK");
		}else {
//			if (p.getAgentLocation() == Environment.LOCATION_A) {
//				return Environment.MOVE_RIGHT;
//			} else {
//				return Environment.MOVE_LEFT;
//			}
			
			switch (p.getAgentLocation()) {
			case Environment.LOCATION_A:
				// right || down
				return Environment.MOVE_RIGHT;
//				break;
			case Environment.LOCATION_B:
				// left || down
				return Environment.MOVE_DOWN;
//				break;
			case Environment.LOCATION_C:
				// left || up
				return Environment.MOVE_LEFT;
//				break;
			case Environment.LOCATION_D:
				// right || up
				return Environment.MOVE_UP;
//				break;
			}
		}
		return NoOpAction.NO_OP;
//		return null;
		
	}
}