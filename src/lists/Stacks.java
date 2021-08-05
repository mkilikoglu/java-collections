package lists;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

      /*  empty() Stack boş mu dolu mu kontrolü yapar
        peek() yığının en üstündeki elemanı getirir
        pop() Yığının en üstündeki elemanı siler
        push(nesne) verilen elemanı yığına ekler .En üste eklenecektir.
        int search(nesne) verilen nesnenin stacktaki kacıncı eleman oldugunu söyler*/

        Stack<Person> stk= new Stack<Person>();
        stk.push(new Person("1","Mustafa","K"));
        stk.push(new Person("2","Ahmet","Demir"));
        stk.push(new Person("3","Osman","Kara"));
        stk.push(new Person("4","Hüseyin","Demir"));

        Iterator itr = stk.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
        if(stk.empty()){
            System.out.println("Stack boş");
        }
        stk.pop();
        stk.pop();
        System.out.println("Stacktan 2 kez  eleman silindi.Uzunluk:"+stk.size());
        Iterator itr2 = stk.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next().toString());
        }
        System.out.println("Stack içerisine aynı eleman eklenmeye çalışıldı.Uzunluk:"+stk.size());
        stk.push(new Person("2","Ahmet","Demir"));
        Iterator itr3 = stk.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next().toString());
        }
        System.out.println("Stack en üstündeki eleman"+stk.peek()+"Uzunluk:"+stk.size());

    }


}


