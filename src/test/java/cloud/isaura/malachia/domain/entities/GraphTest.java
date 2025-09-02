package cloud.isaura.malachia.domain.entities;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GraphTest
{

    @Test
    public void given_a_graph_when_it_is_created_then_it_should_be_empty_and_no_adj_nodes()
    {
        int numberOfNodes = 10;
        Graph aGraph = new Graph(numberOfNodes);
        assert aGraph.getV() == numberOfNodes : "Graph should have " + numberOfNodes + " nodes";
        Iterable<Integer> adj = aGraph.adj(0);
        int count = 0;
        for (Integer item : adj) {
            count++;

        }
        assert  count == 0 : "The node should have 0 adj nodes";
        assert aGraph.getE() == 0: "Graph should have 0 edges";
    }



    @Test
    public void given_a_graph_when_it_is_created_and_add_an_edge_between_0_and_1_then_it_should_be_not_empty_and_adj_nodes() {
        int numberOfNodes = 10;
        Graph aGraph = new Graph(numberOfNodes);
        aGraph.addEdge(0,1);

        assert aGraph.getE() == 1 : "The node should have 1 edge";
    }
}
