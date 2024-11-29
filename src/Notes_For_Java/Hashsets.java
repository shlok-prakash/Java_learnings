package Notes_For_Java;
import java.util.HashSet;
import java.util.Iterator;


public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Adding to HashSet
        set.add(1);
        set.add(77);
        set.add(2);
        set.add(55);
        set.add(10);
        set.add(11);

        //To print
        System.out.println(set);

        //search
        if(set.contains(77)){
            System.out.println("Set Contains 77");
        }
        if(!set.contains(99)){
            System.out.println("Set does not Contains 99");
        }

        //Delete
        set.remove(2);
        System.out.println(set);

        //length of the set
        int size = set.size();
        System.out.println(size);

        Iterator<Integer> it = set.iterator();

        for (Integer integer : set) {
            System.out.println(integer);
        }

        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
