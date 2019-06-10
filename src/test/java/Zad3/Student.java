package Zad3;

public class Student {

    private long numerIndeksu;
    private String imie, nazwisko;
    private Gender gender;

    public Student(long numerIndeksu, String imie, String nazwisko, Gender gender) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu=" + numerIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gender=" + gender +
                '}';
    }

    public long getNumerIndeksu() {

        return numerIndeksu;
    }

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
