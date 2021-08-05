# java-collections
				#Data Structures and algorithms(Veri Yapıları ve algoritmalar)
Data Structures:Verileri memoryde nasıl tuttuğumuzun kurallarını içerir.Amacı veriye kolay ve hızlı ıerişim sağlamak yönetmektir.
Her sınıfın memoryde farklı tutulma yöntemleri vardır.Kullanım ihtiyacımıza göre bunlardan herhangibi birini kullanabilirsiniz.
Yazılımın kullanışlı olması için en uygun veri yapısını kullanabilmemiz gerekir.

Java programlama dilinde bunları collection sınıfından türeyen sınıflar ile yaparız.

***List interfacsini kullanan sınıflar:***
1.ArrayList
2.LinkedList
3.Vector
4.Stack

şeklindedir.

List sınıfları kullanımları birbirine çok benzer.Farklı işlemler için farklı performansları vardır.Tekrarlanan veri barındırabilirler.

**ArrayList**:Boyutu sürekli değişebilir ve eleman ekledikçe dinamik olarak boyutu artacaktır.Sınırı yoktur.
Öğelerine get ve set kullanarak doğrudan erişim sağlanabilir O(1) karmaşıklığı içerir.Bir veriyi aramak için kullanılması mantıklı olabilir.
Arraylist hafızada sırayla tutulur yeni ekleme yapıldığında memoryde daha maliyetli işlere yol açabilir.Ekleme silme dışında veri alma işlemi yapıyorsak arraylistler daha mantıklı kullanımdır.

**Linkedlist**:Linkedlist ekleme,silme konularında arrayliste göre daha başarılıdır ancak veri bulma konusunda O(N) karmaşıklığında çalışır vakit alabilir.
Ögeye sürekli erişim olmadığı zaman ve ekleme silme sürekli yapılacaksa kullanımı daha mantıklıdır.

**Vector**:Arrayliste çok benzer.Vector senkronize olduğu için arrayliste göre yavaştır.vector elemanları içerisinde diğerlerinden farklı olarak Enumartion nesnesi ile gezilir.

**Stack**:Stack yani yığın yapısı LIFO(Son giren ilk çıkar) şeklinde depolama sağlar.Kullanımı yaygın olan bir sınıf olup gelen veri en sona koyulur.en baştaki veriye ulaşmak için üsttekileri boşaltarak ona ulaşmamız gerekir.


|method	   |ArrayList |LinkedList|
|----------|----------|----------|
|get()		 | O(1)			|O(n)      |
|add()		 |O(1)			|O(1)      |
|remove()	 |O(n)			|O(n)      |

***Set interfacisini kullanan sınıflar:***
1.Hashset
2.LinkedHashset
3.Treeset
4.şeklindedir.

Set interfacesini kullanan collectionlar tekrarlı veri içermezler.Uniq veri tutmamızı sağlarlar

**HashSet**:Set sınfları içerisinden performansı en yüksek olandır.Ekleme,silme,veriye ulaşmada en hızlısıdır.Veriler sıralı tutulmaz.nulldeğer içerebilir.LinkedHashSet ve Treesetten daha az bellek harcar çünkü verileri düzensiz tutar.
equals() ve hashCode yöntemini kullanır.

**LinkedHashSet**::En önemli özelliği elemanların eklenme sırasını tutar.Hashsete göre biraz daha yavaştır.Eklenecek ögelerin sırası önemliyse LinkedHashSet kullanımalıdır.Null eleman içerebilir.equals() ve hashCode yöntemini kullanır.

**TreeSet**:Ögeleri sıralıdır.null değer içermez.Performansı en az olan hashleme yöntemidir.Karşılaştırma yöntemi kullanılabilir.equals() ve hashCode yöntemini kullanmaz.Öge karşılaştırmak için kullanabilecek en uygun yöntemdir.

|method	   |Hashset   |LinkedHashSet|TreeSet  |
|----------|----------|-------------|---------|
|get()		 |O(1)			|O(1)         |O(log(n))|
|add()		 |O(1)			|O(1)         |O(log(n))|
|remove()	 |O(1)			|O(1)         |O(log(n))|


***Map interfacesini kullanan sınıflar***
1.HashMap,
2.LinkedHashMap,
3.TreeMap,
4.HashTable şeklindedir.

Veriler key-value şeklinde bellekte tutulur. Aralarındaki farkları tutma sırası ve performanslarıdır.Genel özellikleri Set ile aynı diyebiliriz.Farkı verileri key-value şeklinde tutmasıdır.

**HashMap**:equals() ve hashCode yöntemini kullanır.Kullanım amacı geniştir.Sıra önemli değildir.Ekleme silme getirme işlemi hızlıdır.

**LinkedHashMap**:Ekleme sırasını korur.null değer alabilir.equals() ve hashCode() kullanır.

**Treemap**:Sıralamayı korur.Null değerlere izinvermez.Karşılaştırma işlemlerinde kullanımı mantıklıdır.

**HashTable**:Null değere izin vermez.HashMape göre yavaştır.Fazla kullanılmaz.

**Queue**:FIFO(ilk giren ilk çıkar) şeklinde çalışır.

Örneklere proje kodlarından bakabilirsiniz .



