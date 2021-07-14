import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetCovering {

    private static Set<String> statesNeeded;
    private static Map<String, Set<String>> stations;

    public static void main(String[] args) {
        statesNeeded = new HashSet<>(Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

        stations = new HashMap<>();
        stations.put("kone", Set.of("id", "nv", "ut"));
        stations.put("ktwo", Set.of("wa", "id", "mt"));
        stations.put("kthree", Set.of("or", "nv", "ca"));
        stations.put("kfour", Set.of("nv", "ut"));
        stations.put("kfive", Set.of("ca", "az"));

        var finalStations = new HashSet<String>();

        while (!statesNeeded.isEmpty()) {
            String bestStation = null;
            var statesCovered = new HashSet<String>();
            for (var statesForStation : stations.entrySet()) {
                var covered = new HashSet<>(statesNeeded);
                covered.retainAll(statesForStation.getValue());
                if(covered.size() > statesCovered.size()) {
                    bestStation = statesForStation.getKey();
                    statesCovered = covered;
                }
            }
            statesNeeded.removeIf(statesCovered::contains);

            if(bestStation != null) {
                finalStations.add(bestStation);
            }
        }
        System.out.println(finalStations);
    }
}
