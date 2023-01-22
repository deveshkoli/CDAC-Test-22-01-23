package com.testQ1;

public class Main {
	public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(5, 6);
        graph.addEdge(8, 7);
        graph.addEdge(5, 4);
        graph.addEdge(8, 8);
        graph.printGraph();
	}
}