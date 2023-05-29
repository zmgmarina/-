package lessons;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        db.put(2, "три");
        db.putIfAbsent(1, "пять");

//        System.out.println(db); // {null=!null, 1=один, 2=два}
//        System.out.println(db.get(44));
//        db.remove(null);
//        System.out.println(db); // {1=один, 2=два}
//        System.out.println(db.containsValue("один")); // true
//        System.out.println(db.containsValue(1)); // false
//        System.out.println(db.containsKey("один")); // false
//        System.out.println(db.containsKey(1)); // true
//        System.out.println(db.keySet());
        System.out.println(db.values());


    }
}
