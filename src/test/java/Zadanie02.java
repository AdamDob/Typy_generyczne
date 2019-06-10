import java.util.*;

public class Zadanie02 {

    public static void main(String[] args) {
        List<Integer> list02 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        for(int i=0; i<11 ;i++){
            list02.add(rand.nextInt(49));
        }
        System.out.println(list02);

        int suma = 0;
        for(Integer sumaListy : list02){
            suma += sumaListy;
        }
        System.out.println("SUMA = " + suma);
        System.out.println("SREDNIA =" + suma/list02.size());

        List<Integer> kopiaListy02 = new ArrayList<>(list02);
        Collections.sort(kopiaListy02);
        //System.out.println("Posortowana kopia listy = " + kopiaListy02);

        //Mediana
        if(kopiaListy02.size() % 2 ==0){
            int indeksLewy = (kopiaListy02.size() / 2) -1;
            int indeksPrawy = kopiaListy02.size() /2;

            double mediana = kopiaListy02.get(indeksLewy) + kopiaListy02.get(indeksPrawy) / 2.0;
            System.out.println("Media = " + mediana);
        }
        else{
          int indeksSrodkowy =   kopiaListy02.size() / 2;
            double mediana = kopiaListy02.get(indeksSrodkowy) / 2;
            System.out.println("Mediana = " + mediana);
        }

        System.out.println();
        int najmniejszy = list02.get(0);
        int najwiekszy = list02.get(0);
        for (Integer obecny : list02) {
            if (najmniejszy > obecny) {
                najmniejszy = obecny;
            }
            if (najwiekszy < obecny) {
                najwiekszy = obecny;
            }

        }
        System.out.println("najmniejszy = " + najmniejszy);
        System.out.println("Najwiekszy  = " + najwiekszy);
    }

}
