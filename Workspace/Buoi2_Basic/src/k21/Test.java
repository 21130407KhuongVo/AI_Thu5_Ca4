package k21;

public class Test {
	static Node nodeS = new Node("S");
	static Node nodeA = new Node("A");
	static Node nodeB = new Node("B");
	static Node nodeC = new Node("C");
	static Node nodeD = new Node("D");
	static Node nodeE = new Node("E");
	static Node nodeF = new Node("F");
	static Node nodeG = new Node("G");
	static Node nodeH = new Node("H");

	// BFS for graph search
	private static void testExecuteFromBFSGraphSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new BFSGraphSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPath(result));
	}

	// BFS (3 parameters) for graph search
	private static void testExecuteFromBFSGraphSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new BFSGraphSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromDFSGraphSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new DFSGraphSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromDFSGraphSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new DFSGraphSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromBFSTreeSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new BFSTreeSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromBFSTreeSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new BFSTreeSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromDFSTreeSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new DFSTreeSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteFromDFSTreeSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new DFSTreeSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPath(result));
	}

	private static void testExecuteUinformTreeSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new UniformTreeSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPathNCost(result));
	}

	private static void testExecuteUinformTreeSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new UniformTreeSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPathNCost(result));
	}

	private static void testExecuteUinformGraphSearch() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new UniformGraphSearchAlgo();
		Node result = algol.execute(nodeS, "G");
		System.out.println(NodeUtils.printPathNCost(result));
	}

	private static void testExecuteUinformGraphSearch_3param() {
		nodeS.addEdge(nodeA, 5);
		nodeS.addEdge(nodeB, 2);
		nodeS.addEdge(nodeC, 4);
		nodeA.addEdge(nodeD, 9);
		nodeA.addEdge(nodeE, 4);
		nodeB.addEdge(nodeG, 6);
		nodeC.addEdge(nodeF, 2);
		nodeD.addEdge(nodeH, 7);
		nodeE.addEdge(nodeG, 6);
		nodeF.addEdge(nodeG, 1);
		ISearchAlgo algol = new UniformGraphSearchAlgo();
		Node result = algol.execute(nodeS, "A", "G");
		System.out.println(NodeUtils.printPathNCost(result));
	}

	public static void main(String[] args) {
		// -finished-----------
//		testExecuteFromBFSGraphSearch();
//		testExecuteFromBFSGraphSearch_3param();
//		testExecuteFromDFSGraphSearch();
//		testExecuteFromDFSGraphSearch_3param();
//		testExecuteFromBFSTreeSearch();
//		testExecuteFromBFSTreeSearch_3param();
//		testExecuteFromDFSTreeSearch();
//		testExecuteFromDFSTreeSearch_3param();
//		testExecuteUinformTreeSearch();
//		testExecuteUinformTreeSearch_3param();
		// -unfinished--------
		testExecuteUinformGraphSearch();
		testExecuteUinformGraphSearch_3param();
	}
}
