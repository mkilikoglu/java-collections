package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //tree setlerde elementler artan sırayla tutulur.
        //null kaul etmez,kendi içerisinde sıralama yapar
        //add, clear, clone, contains, isEmpty, iterator, remove, size

        Set treeset = new TreeSet();
        treeset.add("Mustafa");
        treeset.add("AHakan");
        treeset.add("Hasan");
        treeset.add("Ömer");
        treeset.add("Osman");
        treeset.add("Ismail");
        treeset.forEach(item->System.out.println(item));
    }
}
