import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfRectangles {

    public Integer calculateNumberOfRectangles(List<Pair<Integer, Integer>> coordinates) {
        Integer answer = 0;
        Map<Pair<Integer, Integer>, Integer> count = new HashMap<Pair<Integer, Integer>, Integer>();
        for (Pair<Integer, Integer> point : coordinates) {
            for (Pair<Integer,Integer> point_above : coordinates) {
                if (point.getKey() == point_above.getKey() && point.getValue() < point_above.getValue()) {
                    Pair<Integer, Integer> pair_y = new Pair<Integer, Integer>(point.getValue(), point_above.getValue());
                        Integer a = count.containsKey(pair_y) ? count.get(pair_y) + 1 : 0;
                        answer = answer + a;
                        count.put(pair_y, a);
                }
            }
        }
        return answer;
    }
}
