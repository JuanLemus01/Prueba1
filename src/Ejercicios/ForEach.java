package Ejercicios;

public class ForEach {
    //Solo sirve para arreglos
    public static void main(String[] args) {
        String[][] nombres = {{"Juan","lemus"},{"Peoe","cierra"},{"Raol","perez"}};



        for(String[] nom: nombres){
            System.out.print("Nombre :");
            for (String apel : nom){
                System.out.print(apel+"\t");
            }
            System.out.println();
        }
    }
}
