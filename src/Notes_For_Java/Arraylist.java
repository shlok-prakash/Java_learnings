package Notes_For_Java;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Adding into the List
        list.add(45);
        list.add(46);
        list.add(1);
        list.add(65);

        //To print
        System.out.println(list);

        //To get element in the ArrayList
        System.out.println(list.get(2));

        //TO add Element in between
        list.add(1,99);
        System.out.println(list);

        //To Remove and add a different Element
        list.set(3, 10);
        System.out.println(list);

        //To Remove element at a specified Index
        list.remove(2);
        System.out.println(list);

        //TO get the Size of List
        int len = list.size();
        System.out.println(len);

        //to iterate through the array List
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(Integer val : list){
            System.out.println(val);
        }

        Collections.sort(list);
        System.out.println(list);


    }
}
