package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

        public static void main(String[] args) {

            //hashset aynı türden iki eleman tutamaz
            //hashset ile bir küme gibi düşünüp içinde eleman aramak için kullanabiliriz.
            //aynı türden ekleme yaptığımızda örneğin Hasan iki kez eklenmek istediğinde ilkinde ekler ikincisinde kabul etmez.
            //add(nesne) girilen nesneyi ekler aynısını içeriyorsa eklemez
            // clear() tüm elemanları siler
            // clone() aynı hashsetten kopya olusturur
            // contains(nesne) girilen değer içeride var mı kontrol edilir.equals ve hashCode metotları olmalıdır
            // isEmpty() dolu bos kontrolu yaparız
            // iterator() kume icerisinde gezmek icin iterator olusturur
            // remove() elemanı sileriz
            // size() lsitenin buyuklugu
            //HashSets genelde karşılaştırma işlemleri için kullanılır

        HashSet<String> hash1=new HashSet<>();
        hash1.add("Mustafa");
        hash1.add("Hasan");
        hash1.add("Hüseyin");
        hash1.add("Hakan");
            Iterator itrx = hash1.iterator();
            while (itrx.hasNext()){
                System.out.println(itrx.next());
            }
            System.out.println("-----------------Sıralama değişebilir-------------");
        hash1.add(null);
        hash1.remove("Hakan");
        hash1.contains("Hüseyin");
        hash1.size();
        System.out.println(hash1.contains("Hüseyin"));
        System.out.println(hash1.size());

        //iterator ile tek tek dolaşmamızı sağlar.
        Iterator itr = hash1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       hash1.forEach(it->System.out.println(it));


            //bir class le Hashset yaratılacaksa örnek alınan classda equals ve hasCode metotları override edilmelidir.
            //bu sayede aynı object eklenmek istenirse Hashset bunu kontrol edebileli
            //Kisi classımızda equals ve hasCode metotlarını override etmeseydik,kisi1,kisi2,kisi3 ekrana yazılacaktı.
            //Hashset hashlenen değere göre sıralama var

            Person p1 = new Person("37229214985","Mustafa","Kılıkoğlu");
            Person p2 = new Person("37229214985","Mustafa","Kılıkoğlu");
            Person p3=  new Person("37229214985","Mustafa","Kılıkoğlu2");
            HashSet<Person> ps= new HashSet<>();
            ps.add(p1);
            ps.add(p2);
            ps.add(p3);
            System.out.println(ps.contains(p1));

            Iterator itr2 = ps.iterator();
            while (itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }

}
