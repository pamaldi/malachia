package cloud.isaura.malachia.domain.entities;

import java.util.ArrayList;


public class Graph
{

    private final int V; // Number of vertices
    private ArrayList[] adj;
    private int E;

    public Graph(int V)
    {
        this.V = V;
        this.E=0;
        adj = new ArrayList[V];
        for (int v = 0; v < V; v++)
            adj[v] = new ArrayList<>();

    }

    public int getV()
    {
        return this.V;
    }

    public Iterable<Integer> adj(int v)
    {
        return adj[v];
    }

    public int getE()
    {
        return this.E;
    }

    public void addEdge(int v, int w) {
        if (v < 0 || v >= V || w < 0 || w >= V) {
            throw new IllegalArgumentException("Vertex out of bounds");
        }
        this.adj[v].add(w);
        E++;
    }
}

