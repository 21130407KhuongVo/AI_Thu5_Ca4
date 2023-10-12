package k21;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class UniformTreeSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				List<Edge> children = current.getChildren();
				for (Edge child : children) {
					Node childNode = child.getEnd();
					childNode.setPathCost(child.getWeight() + current.getPathCost());
					childNode.setParent(current);
					frontier.add(childNode);
				}
			}
		}
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>();
		frontier.add(root);
		boolean visited = false;
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
//			if (current.getLabel().equals(goal) && visited) {
//				return current;
//			} else {
				if (current.getLabel().equals(start)) {
					visited = true;
					frontier.clear();
					current.setParent(null);
					current.setPathCost(0);
					return execute(current, goal);
				} else {
					List<Edge> children = current.getChildren();
					for (Edge child : children) {
						Node childNode = child.getEnd();
						childNode.setPathCost(child.getWeight() + current.getPathCost());
						childNode.setParent(current);
						frontier.add(childNode);
					}
				}
//			}
		}
		return null;
	}

}
