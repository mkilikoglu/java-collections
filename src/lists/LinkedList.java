package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        //LinkedList ve arraylistler birbirine çok benzerdir.Arraylisten farkı ise bellekte tutulma sırası olduğudur.
        //Ekleme silme yapılacak ve büyümesi beklenecek durumlarda mantıklıdır. Bellek performansı Arraylistten kötüdür.
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1","Mustafa","K"));
        persons.add(new Person("2","Ahmet","Demir"));
        persons.add(new Person("3","Osman","Kara"));

        Iterator itr = persons.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
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
