import java.util.LinkedList;
import java.util.Random;


public class Question3 {
    public static void main (String []args){
        Random rand = new Random();
        LinkedList<Integer> randomList = new LinkedList<Integer>(); //create new linked list
        int randomVal=rand.nextInt(1000,9999); //generate random value within the same range
        findValue(randomList, randomVal);
    }

    public static void findValue(LinkedList<Integer>list,int searchVal){
        Random rand = new Random();
        for (int i=0;i<500;i++){
            list.add(rand.nextInt(1000,9999));
        }
        if (list.indexOf(searchVal)>= 0){
            System.out.println("Random search value exists at index "+ list.indexOf(searchVal));
        }
        else {
            System.out.println("-1");
        }
        System.out.println(searchVal);
        System.out.println(list);
    }
}