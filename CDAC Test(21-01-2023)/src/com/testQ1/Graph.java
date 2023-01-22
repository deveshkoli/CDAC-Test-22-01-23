package com.testQ1;
import java.util.ArrayList;
import java.util.List;
public class Graph {
    private final int[][] adjacencyMatrix;
    private final int numVertices;
    private List<Integer> inDegree;
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
        inDegree = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            inDegree.add(0);
        }
    }
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        inDegree.set(destination, inDegree.get(destination) + 1);
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        inDegree.set(destination, inDegree.get(destination) - 1);
    }

    public boolean isAdjacent(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public int inDegree(int vertex) {
        return inDegree.get(vertex);
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


