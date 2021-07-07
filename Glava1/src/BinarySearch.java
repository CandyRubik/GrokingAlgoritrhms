import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static Integer binarySearch(List<Integer> list, Integer item) {
        int low = 0;
        int high = list.size() - 1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if(list.get(mid).equals(item)) {
                return item;
            }
            if(item > list.get(mid)) {
                low = mid + 1;
            }
            if (item < list.get(mid)) {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Integer find = binarySearch(list, 100);
        System.out.println(find);
    }
}
