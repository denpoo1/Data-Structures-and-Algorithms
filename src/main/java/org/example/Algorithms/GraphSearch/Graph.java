package org.example.Algorithms.GraphSearch;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    public List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertices=" + adjVertices +
                '}';
    }

    private void dfs(Vertex vertex, HashSet<Vertex> passedVertex) {
        System.out.println(vertex);
        passedVertex.add(vertex);
        for (Vertex vertex1 : adjVertices.get(vertex)) {
            if (!passedVertex.contains(vertex1)) dfs(vertex1, passedVertex);
        }
    }

    public void dfs(String rootLabelVertex) {
        Vertex vertex = findVertex(rootLabelVertex);
        HashSet<Vertex> passedVertex = new HashSet<>();
        dfsWrap(adjVertices, passedVertex);
    }

    private Vertex findVertex(String value) {
        for (Vertex vertex : adjVertices.keySet()) {
            if (vertex.getLabel().equals(value)) return vertex;
        }
        throw new RuntimeException();
    }

    private void dfsWrap(Map<Vertex, List<Vertex>> graph, HashSet<Vertex> passedVertex) {
        for (Map.Entry<Vertex, List<Vertex>> graphEntry : graph.entrySet()) {
            List<Vertex> vertexList = graphEntry.getValue();
            if (vertexList.isEmpty()) System.out.println(graphEntry.getKey());
            for (Vertex vertex : vertexList) {
                if (!passedVertex.contains(vertex)) dfs(vertex, passedVertex);
            }
        }
    }

    private List<Vertex> getPath(Vertex start, Vertex stop, HashSet<Vertex> visited) {
        if (start == null || stop == null) {
            return Collections.emptyList();
        }

        LinkedList<Vertex> path = new LinkedList<>();
        getPathHelper(start, stop, visited, path);
        return path;
    }

    private boolean getPathHelper(Vertex current, Vertex stop, HashSet<Vertex> visited, LinkedList<Vertex> path) {
        visited.add(current);
        path.add(current);

        if (current.equals(stop)) {
            return true; // Нашли путь
        }

        for (Vertex neighbor : adjVertices.get(current)) {
            if (!visited.contains(neighbor)) {
                if (getPathHelper(neighbor, stop, visited, path)) {
                    return true;
                }
            }
        }

        path.removeLast();
        return false;
    }

    public List<Vertex> getPath(String startVertex, String stopVertex) {
        Vertex start = findVertex(startVertex);
        Vertex stop = findVertex(stopVertex);
        HashSet<Vertex> visited = new HashSet<>();
        LinkedList<Vertex> path = new LinkedList<>();

        if (getPathHelper(start, stop, visited, path)) {
            return path;
        } else {
            return Collections.emptyList();
        }
    }
}
