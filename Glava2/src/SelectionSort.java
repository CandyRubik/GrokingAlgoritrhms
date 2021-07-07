import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static Integer findSmallest(ArrayList<Integer> list) {
        Integer min = list.get(0);
        int indexMinValue = 0;

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
                indexMinValue = i;
            }
        }
        list.remove(indexMinValue);
        return min;
    }

    public static ArrayList<Integer> selectionSortAscendingOrder(ArrayList<Integer> list) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            newArr.add(findSmallest(list));
        }
        return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayForSort = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            arrayForSort.add(10 - i);
        }

        selectionSortAscendingOrder(arrayForSort).forEach(elem -> System.out.println(elem + " "));
    }
}
