package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //ArrayLists List interfacesi sınıfından gelirler sıralamalı null değer içerebilen sınırsız veri tutabilirler.
        ArrayList carModels = new ArrayList();
        carModels.add("Opel");
        carModels.add("Toyota");
        carModels.add("BMW");
        carModels.add(3,"Mercedes");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1","Mustafa","K"));
        persons.add(new Person("2","Ahmet","Demir"));
        persons.add(new Person("3","Osman","Kara"));

        //
        carModels.forEach(g->System.out.println(g));

        Iterator itr = persons.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        System.out.println("----------");
        persons.add(new Person("4","Hakan","Söylemez"));

        persons.forEach(t->System.out.println(t));
    }

    /*
    boolean add(index, eleman): Listeye eleman ekler
    boolean addAll(index, koleksiyon):
    int get(index): indexi verilen elemanı getirir
    int indexOf(nesne): Bulunmak istenen verinin index numarasını döner
    int lastindexOf(nesne):nesnenin son indexini getirir
    boolean remove(index): verilen indexdeki elemanı çıkarır
    boolean set(index, nesne): verilen indexe elemanımızı atarız
    subList(baslangicIndex, bitisIndex):Verilen indexler aralığına ait bir liste döner.*/

}
