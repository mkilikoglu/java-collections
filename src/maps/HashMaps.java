package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        //aynı adresten iki tane olamaz
        //key value ilişkisi vardır.
        //veriler hashlenerek tutulur.
        //clear() Map içerisinde bulunan bütün değerleri siler
        //get(Object Key) anahtara karşılık gelen objeyi döndürür.
        //put(Object key,Object value) Anahtar değer ikilisini kayıt eder.
        //sırayla tutmaz ve iki tane aynı keyden tutmaz. üstüne yazar
        //Object sınıflarından olusacak mapler için equals ve hascode metotları override edilmelidir.

        HashMap map = new HashMap();
        map.put("Opel","Corsa");
        map.put("Toyota","Yaris");
        map.put("Fiat","Egea");
        map.put("Fiat","Egea22");

        Set s =map.entrySet();
        Iterator i =s.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey()+"/"+item.getValue());
        }
        System.out.println(map.get("Toyota"));

    }
}
