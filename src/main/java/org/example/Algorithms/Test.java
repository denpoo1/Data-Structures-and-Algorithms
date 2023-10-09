package org.example.Algorithms;

import org.example.Algorithms.GraphSearch.Graph;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Odessa");
        graph.addVertex("Berlin");
        graph.addVertex("Warsaw");
        graph.addVertex("Stambul");
        graph.addVertex("Lol");

        graph.addEdge("Odessa", "Berlin");
        graph.addEdge("Odessa", "Warsaw");
        graph.addEdge("Warsaw", "Berlin");
        graph.addEdge("Stambul", "Lol");

//        graph.dfs("Odessa");
        System.out.println(graph.getPath("Odessa", "Warsaw"));
    }
}
