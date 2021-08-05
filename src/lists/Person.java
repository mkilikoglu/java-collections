package lists;

import java.util.Objects;

public class Person {
    private String id;
    private String adi;
    private String soyadi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Person(String id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getAdi(), person.getAdi()) && Objects.equals(getSoyadi(), person.getSoyadi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAdi(), getSoyadi());
    }
}
