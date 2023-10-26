package student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class UCS implements IInformedSearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		
		PriorityQueue<Node> frontier = new PriorityQueue<Node>(new NodeComparator());
		Set<Node>explored = new HashSet<Node>();
		frontier.add(root);
		explored.add(root);
		while(!frontier.isEmpty()) {
			Node current = frontier.poll();
			if(current.getLabel().equals(goal)) {
				return current;
			}else {
				List<Edge> children = current.getChildren();
				for (Edge edge : children) {
					Node child = edge.getEnd();
					if (!frontier.contains(child) && !explored.contains(child)) {
						child.setG(current.getG()+edge.getWeight());
						child.setParent(current);
						frontier.add(child);
						explored.add(child);
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