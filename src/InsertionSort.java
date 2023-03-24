import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[]array){
        for (int i = 1; i < array.length; ++ i) {
            int key =array[i];
            int j = i-1;
            while (j>=0&&array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = input.nextInt();
        int []array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20)+1;
        }
        System.out.println("Array before sorted: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}
