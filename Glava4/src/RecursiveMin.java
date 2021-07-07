import java.util.ArrayList;
import java.util.List;

public class RecursiveMin {
    public static Integer min(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            Integer minSubArray = min(list.subList(1, list.size()));
            return (list.get(0) <  minSubArray) ? list.get(0) : minSubArray;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(3);
        list.add(4);
        list.add(100);

        System.out.println(min(list));
    }
}
