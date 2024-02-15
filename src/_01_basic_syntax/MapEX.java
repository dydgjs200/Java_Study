package _01_basic_syntax;

import java.util.HashMap;
import java.util.Map;

public class MapEX {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();

        hash.put("hh", 123);
        hash.put("ddd", 1);
        hash.put("ddzmzkmdk", 1234);

        System.out.println(hash.containsValue(123));
        System.out.println(hash.get("hh"));
        System.out.println(hash.getOrDefault("dz", 1));

        for(Map.Entry<String, Integer> entry: hash.entrySet()){
            System.out.println(entry);
        }


    }
}
