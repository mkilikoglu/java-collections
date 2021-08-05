package maps;

import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {

        TreeMap map = new TreeMap();
        map.put("Opel","Corsa");
        map.put("Toyota","Yaris");
        map.put("Fiat","Egea");
        map.put("Fiat","Egea2");

        Set s =map.entrySet();
        Iterator i =s.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey()+"/"+item.getValue());
        }
        System.out.println(map.get("Toyota"));


        Map<Integer, String> map2  = new HashMap<>();//key integer value string tipinde ayarladık.

        map2.put(0, "X");
        map2.put(1, "Y");
        map2.put(2, "Z");

        System.out.println(map);

        for (int j=0; j<map2.size(); j++) {
            System.out.println(j + " :// " + map2.get(j));
        }
        for (Map.Entry mapEleman : map2.entrySet()){
            System.out.println(mapEleman.getKey() + " : " + mapEleman.getValue());
        }
    }
}
