package POO;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {



    public static void main(String[] args) {
        String[] carros = {"Camaro","Mustang","Ferrari","Mustang"};
        Set<String> unicos = new HashSet<>();

        for (String carro: carros){
            if (!unicos.add(carro)){
                System.out.println(" El elemento duplicado es " + carro );
            }
        }
    }


}
