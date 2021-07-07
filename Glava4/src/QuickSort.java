import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> qsort(List<Integer> list) {
        if(list.size() < 2) {
            return list;
        } else {
            int pivotIndex = list.size() / 2;
            List<Integer> leftList = new ArrayList<>();
            List<Integer> rightList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i == pivotIndex) {
                    continue;
                }
                if (list.get(i) < list.get(pivotIndex)) {
                    leftList.add(list.get(i));
                }
                else {
                    rightList.add(list.get(i));
                }
            }
            List<Integer> result = new ArrayList<>();
            result.addAll(qsort(leftList));
            result.add(list.get(pivotIndex));
            result.addAll(qsort(rightList));
            return result;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(3);
        list.add(4);
        list.add(100);

        List sortedList = qsort(list);
        System.out.println("");
    }
}
