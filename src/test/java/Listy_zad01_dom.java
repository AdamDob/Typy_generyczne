import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Listy_zad01_dom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("podaj 5 liczb");
        for(int i=0; i<5; i++){

            list.add(sc.nextInt());
        }

        System.out.println("System losuje 5 dowonlych liczb z zakresu od 0 do 1000");
        for(int i=0; i<5; i++){
            list.add(rand.nextInt(1000));
        }
        System.out.println("Cala lista " + list);

        int suma = 0;
       for(Integer elementyListy : list){
           suma += elementyListy;
       }
        System.out.println("suma = "+suma);
        System.out.println("srendia = " + suma/list.size());
    }

}
