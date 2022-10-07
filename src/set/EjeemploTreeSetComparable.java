package set;


import model.Alumno;

import java.util.*;

public class EjeemploTreeSetComparable {

    public static void main(String[] args) {

        //Ordenado desde clase
        /*
        Set<Alumno> al = new TreeSet<>();
        al.add(new Alumno("Juan",2));
        al.add(new Alumno("pepe",2));
        al.add(new Alumno("ramon",4));
        al.add(new Alumno("julio",5));
        al.add(new Alumno("Zeus",3));

        System.out.println("al = " + al);

         */



        //Ordenado desde constructor del metodo

        /*Set<Alumno> al = new TreeSet<>((a , b ) -> b.getName().compareTo(a.getName()));
        al.add(new Alumno("Juan",2));
        al.add(new Alumno("pepe",2));
        al.add(new Alumno("ramon",4));
        al.add(new Alumno("aulio",5));
        al.add(new Alumno("Zeus",3));

        System.out.println("al = " + al);

         */

        //Ordenando arraylist por clase (por nota)

        ArrayList<Alumno> al = new ArrayList<>();
        al.add(new Alumno("Juan",7));
        al.add(new Alumno("pepe",2));
        al.add(new Alumno("ramon",4));
        al.add(new Alumno("aulio",5));
        al.add(new Alumno("Zeus",3));
        Collections.sort(al);
        System.out.println(al);

        //Ordenando arraylist por consytuctor (nombre)

        List<Alumno> alu = new ArrayList<>();
        alu.add(new Alumno("Juan",7));
        alu.add(new Alumno("pepe",2));
        alu.add(new Alumno("ramon",4));
        alu.add(new Alumno("aulio",5));
        alu.add(new Alumno("Zeus",3));
        alu.add(new Alumno("Zeus",3));
        Collections.sort(alu, (a , b ) -> b.getName().compareTo(a.getName()));
        System.out.println("Por nombre " + alu);




    }
}
