package k21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Depth_LimitedSearch{

	/**
	 * tìm kiếm giới hạn độ sâu
	 * @param root
	 * @param goal
	 * @param limit
	 * @return
	 */
	public Node execute(Node root, String goal, int limit) {
		Stack<Node> frontier = new Stack<Node>();
		List<Node> explored = new ArrayList<Node>();
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current = frontier.pop();
			explored.add(current);
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				if (current.getDepth() < limit) {
					List<Node> children = current.getChildrenNodes();
					for (Node child : children) {
						if (!explored.contains(child) && !frontier.contains(child)) {
							explored.add(child);
							frontier.add(child);
							child.setParent(current);
							child.setDepth(current.getDepth() + 1);
						}
					}
				} 
			}
		}
		return null;
	}

	public Node executeV2(Node root, String goal, int limit) {
		
	}
	
}
