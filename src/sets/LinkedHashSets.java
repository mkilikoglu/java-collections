package sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        //bu colleciton hashset de kullanılan belirsiz sıralamayı engeller
        //tekrarlı eleman üretmiyor,null girilebilir
        //HAshset null en başa alır linkedhashsette eklendği sırada kalır
        //Hastsetten farkı eklenme sırası olarak düşünülebilir.
        // clear() tüm elemanları siler
        // clone() aynı hashsetten kopya olusturur
        // contains(nesne) girilen değer içeride var mı kontrol edilir.equals ve hashCode metotları olmalıdır
        // isEmpty() dolu bos kontrolu yaparız
        // iterator() kume icerisinde gezmek icin iterator olusturur
        // remove() elemanı sileriz
        // size() lsitenin buyuklugu
        //elemanları sıralıdır.sıra önemli değilse Hashset kullanımı daha mantıklıdır.Bu yöntemin memoyde maliyeti yüksektir
        //çünkü verileri sıraladğı için vakit alır.
        LinkedHashSet ps = new LinkedHashSet();
        ps.add("Mustafa");
        ps.add("Hakan");
        ps.add("Hasan");
        ps.add("Ömer");
        ps.add("Osman");
        ps.add("İsmail");

        Iterator itr2 = ps.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
