import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Zadanie03> student = new ArrayList<>();
        Zadanie03 students = new Zadanie03();
             student.add(new Zadanie03("1231", "Adam", "Dobrzycki", Plec.MALE));
             student.add(new Zadanie03("765", "LOPO", "BASDAS", Plec.FEMALE));
             student.add(new Zadanie03("23", "JGF", "QWEQW", Plec.MALE));
             student.add(new Zadanie03("1187", "Qwe", "QQWE", Plec.FEMALE));
             student.add(new Zadanie03("566", "ADF", "MMMGMG", Plec.MALE));

        System.out.println(student);

        for(Zadanie03 wypisz : student){
            System.out.println(wypisz);
        }

        System.out.println("Kobiety");


    }


}
