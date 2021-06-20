package com.coding.module1.pathfinding;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @Test
    void getShortPath(){

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

        Dijkstra dijkstra = new Dijkstra();

        graph = dijkstra.calculateShortestPathFromSource(graph, nodeA);

        graph.getNodes().forEach(node -> System.out.println(node.getDistance()+" "+node.getAdjacentNodes().));

    }

    /*
    * Qué tal compañeros! Creo que no podré conectarme hoy (hoy fui a la oficina)
    *
    * */


}