package Notes_For_Java;
import java.util.*;


public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.putIfAbsent("India", 120);
        map.put("India", 170);
        map.put("China", 180);
        map.put("USA", 150);

        //Print
        System.out.println(map);


        //Search for the key
        if(map.containsKey("China")){
            System.out.println("Key is present");
        }
        //Search for the Value
        if(map.containsValue(170)){
            System.out.println("Value is present");
        }

        //Get Value
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //For iteration in the MAP
        for(Map.Entry<String, Integer> element : map.entrySet()){
            System.out.println(element.getKey() + " : " + element.getValue() );
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
