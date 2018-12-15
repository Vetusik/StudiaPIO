package statistics;

import java.util.HashMap;
import java.util.Map;


public class WinStatistics implements Statistics {

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private final Map<String, Integer> stats = new HashMap();
    

    public void andTheWinnerIs(String name) {
        int score = stats.getOrDefault(name, 0);
        ++score;
        stats.put(name, score);
    }
    

    public void print() {
        for (String name : stats.keySet()) {
            System.out.println(name + ": " + stats.get(name));
        }
    }

    
    public void reset() {
        stats.clear();
    }

    
}