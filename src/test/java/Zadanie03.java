import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //getter, stter, requiredargsconstructor, tostring, equalshashcode

@NoArgsConstructor
public class Zadanie03 {

    public Zadanie03(String nrIndeksu, String imie, String nazwisko, Plec plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    private String nrIndeksu;
    private String imie;
    private String nazwisko;
    private Plec plec;

}
