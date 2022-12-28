package DataStructureLab.weekLASTdijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }


    public Set<Node> getNodes() {
        return nodes;
    }
    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }
}
