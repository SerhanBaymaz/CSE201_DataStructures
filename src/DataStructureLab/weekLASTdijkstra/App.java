package DataStructureLab.weekLASTdijkstra;

public class App {
    public static void main(String[] args) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);


        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        nodeA.setDistance(0);

        Dijkstra.calculateMinimumDistance(nodeA, nodeB, 10);
        Dijkstra.calculateMinimumDistance(nodeA, nodeC, 15);
        Dijkstra.calculateMinimumDistance(nodeB, nodeD, 12);
        Dijkstra.calculateMinimumDistance(nodeB, nodeF, 15);
        Dijkstra.calculateMinimumDistance(nodeC, nodeE, 10);
        Dijkstra.calculateMinimumDistance(nodeD, nodeE, 2);
        Dijkstra.calculateMinimumDistance(nodeD, nodeF, 1);
        Dijkstra.calculateMinimumDistance(nodeF, nodeE, 5);

        Dijkstra.calculateShortestPath(graph, nodeA);


        System.out.println("Shortest Distance :"+nodeE.getDistance());


        System.out.print("Shortest Path: " );
        for(Node node:nodeE.getShortestPath()){
            System.out.print(node.getName()+",");
        }










    }
}
