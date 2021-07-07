import java.util.ArrayList;
import java.util.List;

public class RecursiveSizeForArray {

    public static int size(List<Integer> list) {
        if (list.size() == 1) {
            return 1;
        } else {
            return 1 + size(list.subList(1, list.size()));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        System.out.println(size(arrayList));
    }
}
