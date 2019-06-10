package Zad3;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

import static Zad3.Gender.FEMALE;
import static Zad3.Gender.MALE;

public class Main {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1234,"Franek", "Batory", Gender.MALE));
        students.add((new Student(9293,"Kamila","Braun", FEMALE)));
        students.add((new Student(923,"Sylwia","Czek", FEMALE)));
        students.add((new Student(6492,"Grzegorz","Mech",Gender.MALE)));

        System.out.println(students);

        System.out.println("B");
        for(Student wypisz : students){
            System.out.println(wypisz);
        }

        System.out.println("C");
        for(Student kobiety : students){
            if(kobiety.getGender().equals(FEMALE)){
                System.out.println(kobiety);
            }
        }

        System.out.println("D");
        for(Student mezczyzni : students){
            if(mezczyzni.getGender().equals(MALE)){
                System.out.println(mezczyzni);
            }
        }

        System.out.println("E");
        for(Student indeksy : students){
            System.out.println(indeksy.getNumerIndeksu());
        }
    }

}
