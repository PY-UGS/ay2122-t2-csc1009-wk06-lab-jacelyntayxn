import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        System.out.println("Enter two index to swap.");
        System.out.print("Index One: ");
        int indexOne = input.nextInt();
        System.out.print("Index Two: ");
        int indexTwo = input.nextInt();
        swapValues(linklist, indexOne, indexTwo);

        input.close();
    }

    public static void swapValues(LinkedList<Integer>list,int indexOne,int indexTwo){
        System.out.println("Before swapping: " + list);
        int temp;
        temp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo,temp);
        System.out.println("After swapping: " + list);
    }
}