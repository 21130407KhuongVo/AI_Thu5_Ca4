package student;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		// TODO Auto-generated method stub
		return (o1.getG() - o2.getG() > 0) ? 1 : -1;
	}

}
