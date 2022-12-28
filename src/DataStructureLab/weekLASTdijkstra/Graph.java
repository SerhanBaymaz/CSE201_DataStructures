package DataStructureLab.weekLASTdijkstra;

import java.util.Set;

public class Graph {
    Set<Node> nodes;

    public Graph() {}
    public Graph(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }



}
