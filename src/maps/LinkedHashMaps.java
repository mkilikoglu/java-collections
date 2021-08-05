package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMaps {
    public static void main(String[] args) {
        //sıralamayı önemser.Hashmapte sıralama önemli değildir.
        //size(): map edilen sayıyı döner
        // values(): mapteki elemanların collection nesnesini doner
        //clear(): map içerisini boşaltır.
        //isEmpty(): boş dolu kontrolu yapar
        //entrySet(): Eşleşme tablosunda bulunan elemanlar için bir set nesnesi-küme döner.
        //keySet(): key değerleri döner
        //put(anahar,eleman): listeye eleman ekleriz.
        //putAll(eslemeTablosu X): Parametrede verilen eş. tab. X in tüm elemanlarını ilgili eşleme tablosuna ekler.
        // get(anahtar): Parametrede verilen anahtar ile eşlesen elemanı döner.
        // containsKey(anahtar): parametrede verilen anahtar ile eşlesen bir eleman varsa true döner.
        // containsValue(eleman): parametrede verilen anahtar ile eşlesen bir eleman varsa true döner.
        // remove(key): verilen keydeki elemanı cıkartır.

        LinkedHashMap map = new LinkedHashMap();
        map.put("Opel","Corsa");
        map.put("Toyota","Yaris");
        map.put("Fiat","Egea");
        map.put("Fiat","Egea");
        map.put("Nissan","Qasqai");

        Set s =map.entrySet();
        Iterator i =s.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey()+"/"+item.getValue());
        }
        System.out.println(map.get("Toyota"));
        //map.clear();
       // System.out.println("Map temizlendi");
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println("------------");
        Set sx =map.entrySet();
        Set sk= map.keySet();
        System.out.println(sx.toString());
        System.out.println(sk.toString());
        System.out.println("------------");

        map.remove("Nissan");
        Iterator j =s.iterator();
        while (j.hasNext()){
            Map.Entry item = (Map.Entry) j.next();
            System.out.println(item.getKey()+"/"+item.getValue());
        }

    }
    }




