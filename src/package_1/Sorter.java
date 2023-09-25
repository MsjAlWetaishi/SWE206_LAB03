package package_1;
import java.util.ArrayList;

public class Sorter {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i < 10 ; i++){
            list.add((int)(Math.random()*9)+1);
        }
        System.out.println(list);
        selectionSort(list);
        System.out.println(list);

    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
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
}
