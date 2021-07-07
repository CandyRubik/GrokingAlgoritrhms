import java.util.ArrayList;
import java.util.List;

public class Sum {

    public static int sum(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            return list.get(0) + sum(list.subList(1, list.size()));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(sum(list));
    }
}
