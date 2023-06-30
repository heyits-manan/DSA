import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Insertion :
        map.put("Nepal", 1);
        map.put("USA", 2);
        map.put("England", 3);

        System.out.println(map);

        // Search :
        if (map.containsKey("Nepal")) {
            System.out.println("Key is present in the map !");
        } else {
            System.out.println("Key is not present in the map !");
        }

        System.out.println(map.get("Nepal")); // Getting the value of the key!

        System.out.println();

        // Looping through items!
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}