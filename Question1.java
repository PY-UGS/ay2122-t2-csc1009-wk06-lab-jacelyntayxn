import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {
    public static void main (String []args){
        //Question 1
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        System.out.print("Enter value to input into list: ");
        int inputValue = input.nextInt();
        addAndSort(linklist, inputValue);

        input.close();
    }

    //Question 1
    public static void addAndSort(LinkedList<Integer> list,int value){
        System.out.println("Before change: " + list);
        for(int i=0;i<list.size();i++)
        {
            if(value<list.get(i))
            {
                list.add(i,value);
                System.out.println("After change: " + list);
                return;
            }
        }
        list.add(value); 
        System.out.println("After adding: " + list);
    }

}