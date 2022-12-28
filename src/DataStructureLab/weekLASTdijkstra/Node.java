package DataStructureLab.weekLASTdijkstra;

import java.util.LinkedList;
import java.util.Map;

public class Node {
    public String name;
    public int distance;
    LinkedList<Node> shortestPath = new LinkedList<>();
    Map<Node, Integer> adjVertices;

    public Node() {}

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node destination, int distance) {
        adjVertices.put(destination, distance);
    }



}
