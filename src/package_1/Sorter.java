package package_1;
import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        System.out.println("Before Sorting: " + list);
        selectionSort(list);
        System.out.println("After Sorting: " + list);

        System.out.println("-------------------");

        System.out.println("Insertion");
        Collections.shuffle(list);
        System.out.println(list);
        SortInsertion(list);

        System.out.println("Selection");

        Collections.shuffle(list);
        System.out.println(list);
        SortSelection(list);




    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            // Assume the current element is the minimum
            int minIndex = i;
            // Loop through the remaining elements to find the actual minimum
            for (int j = i + 1; j < list.size(); j++) {
                // Compare the current element with the minimum element
                if (list.get(j) < list.get(minIndex)) {
                    // Update the minimum index if a smaller element is found
                    minIndex = j;
                }
            }
            // Swap the current element with the minimum element
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        return list;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        return list;
    }
    public static void SortInsertion(ArrayList<Integer> list){
        insertionSort(list);
        System.out.println(list);
    }

    public static void SortSelection(ArrayList<Integer> list){
        selectionSort(list);
        System.out.println(list);
    }


}