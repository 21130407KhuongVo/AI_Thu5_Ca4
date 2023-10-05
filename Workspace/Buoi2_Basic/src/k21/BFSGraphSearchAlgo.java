package k21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraphSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);

		List<Node> explored = new ArrayList<Node>();
		while (!frontier.isEmpty()) {
			// TODO Auto-generated method stub
			Node current = frontier.poll();
			if (current.getLabel().equals(goal)) {
				return current;
			} else {
				explored.add(current);
				List<Node>children = current.getChildrenNodes();
				for (Node child : children) {
					if (!frontier.contains(child) && !explored.contains(child)) {
						frontier.add(child);//them vao trong queue
						child.setParent(current);
					}
				}
			}
		}

		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		List<Node> explored = new ArrayList<Node>();
		
		boolean started = false;
		
		while (!frontier.isEmpty()) {
			Node current = frontier.poll();
			if (current.getLabel().equals(goal) && started) {
				return current;
			}else {
				if (current.getLabel().equals(start)) {
					started = true;
					frontier.clear();
					explored.clear();
					current.setParent(null);
					return execute(current, goal);
				} else {
					explored.add(current);
					List<Node>children = current.getChildrenNodes();
					for (Node child : children) {
						if (!frontier.contains(child) && !explored.contains(child)) {
							frontier.add(child);//them vao trong queue
							child.setParent(current);
						}
					}
				}
			}
		}
		
		return null;
	}

}
