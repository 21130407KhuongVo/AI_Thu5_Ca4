package k21;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSTreeSearchAlgo implements ISearchAlgo {
	
	@Override
	public Node execute(Node root, String goal) {
		Stack<Node> frontier = new Stack<Node>();
		frontier.add(root);

		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node current = frontier.peek();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Node> children = current.getChildrenNodes();
				for (Node child : children) {
//					if (!frontier.contains(child) && !explored.contains(child)) {
						frontier.add(child);
						child.setParent(current);
//					}
				}
			}
		}

		return null;
	}
	
	@Override
	public Node execute(Node root, String start, String goal) {
		Stack<Node> frontier = new Stack<Node>();
		frontier.add(root);

		boolean visited = false;

		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			Node current = frontier.pop();
			if (current.getLabel().equals(goal) && visited) {
				return current;
			} else {
				if (current.getLabel().equals(start)) {
					visited = true;
					frontier.clear();
					explored.clear();
					current.setParent(null);
					return execute(current, goal);
				}
				explored.add(current);
				List<Node> children = current.getChildrenNodes();
				for (Node child : children) {
//					if (!frontier.contains(child) && !explored.contains(child)) {
						frontier.add(child);
						child.setParent(current);
//					}
				}
			}
		}

		return null;
	}
}
