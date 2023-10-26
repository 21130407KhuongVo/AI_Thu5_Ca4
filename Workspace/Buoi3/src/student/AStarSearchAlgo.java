package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class AStarSearchAlgo implements IInformedSearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
		List<Node> explored = new ArrayList<Node>();

		frontier.add(root);
		explored.add(root);

		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				for (Edge e : current.getChildren()) {
					Node end = e.getEnd();
					end.setParent(current);
					end.setG((current == root ? (e.getWeight() + end.getH())
							: (current.getG() - current.getH() + e.getWeight() + end.getH())));
					if (!frontier.contains(end) && !explored.contains(end)) {
						frontier.add(end);
						explored.add(end);
					}
				}
			}
		}

		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		// TODO Auto-generated method stub
		return null;
	}

}
