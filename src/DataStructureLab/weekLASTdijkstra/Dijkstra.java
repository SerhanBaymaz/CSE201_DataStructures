package DataStructureLab.weekLASTdijkstra;

import java.util.*;

public class Dijkstra {

    public static void calculateMinimumDistance(Node sourceNode,Node destinationNode,int distance){
        int sourceDistance=sourceNode.getDistance();
        if(sourceDistance + distance < destinationNode.getDistance()){
            destinationNode.setDistance(sourceNode.getDistance() + distance);

            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            destinationNode.setShortestPath(shortestPath);

        }




    }


    public static void calculateShortestPath(Graph graph,Node source){
        source.setDistance(0);
        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<Node> unsettledNodes = new PriorityQueue<>(Comparator.comparingInt(n -> n.getDistance()));

        unsettledNodes.add(source);

        while (!unsettledNodes.isEmpty()){

            Node node = unsettledNodes.poll();
            for (Map.Entry<Node,Integer> e: node.getAdjVertices().entrySet()){
                Node adjacentNode = e.getKey();
                Integer distance = e.getValue();

                if(!settledNodes.contains(adjacentNode)){
                    calculateMinimumDistance(node,adjacentNode,distance);
                    unsettledNodes.add(adjacentNode);
                }

            }//end for

            settledNodes.add(node);
        }//while

    }
}
