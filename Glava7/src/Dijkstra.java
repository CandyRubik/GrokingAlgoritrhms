import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {
    private static Map<String, String> parents;
    private static Map<String, Double> costs;
    private static Map<String, Map<String, Double>> graph;
    private static List<String> processed;

    public static void dijkstra() {
        String node = findLowestCostNode();
        while (node != null) {
            Double cost = costs.get(node);
            Map<String, Double> neighbors = graph.get(node);
            for (String n : neighbors.keySet()) {
                Double newCost = cost + neighbors.get(n);
                if(costs.get(n) > newCost) {
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode();
        }
    }

    private static String findLowestCostNode() {
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;

        for(Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();
            if(cost < lowestCost && !processed.contains(node.getKey())) {
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }
        return lowestCostNode;
    }

    public static void main(String[] args) {
        parents = new HashMap<>();
        costs = new HashMap<>();
        graph = new HashMap<>();

        graph.put("Start", Map.of("A", 6.0, "B", 2.0));
        graph.put("A", Map.of("End", 1.0));
        graph.put("B", Map.of("A", 3.0, "End", 5.0));
        graph.put("End", Map.of());

        costs.put("A", 6.0);
        costs.put("B", 2.0);
        costs.put("End", Double.POSITIVE_INFINITY);

        parents.put("A", "Start");
        parents.put("B", "Start");
        parents.put("End", null);

        processed = new ArrayList<>();

        dijkstra();

        System.out.println(parents);
        System.out.println(costs);
    }
}
