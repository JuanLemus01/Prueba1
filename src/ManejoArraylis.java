import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManejoArraylis {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        List<String> arreglo = new ArrayList<>();
        int mayor = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            int num = src.nextInt();
            mayor = num > mayor ? num : mayor;
            arreglo.add(String.valueOf(num));
        }
        Collections.sort(arreglo);
        System.out.println("mayor = " + mayor);
        System.out.println("Lista Ordenada: "+arreglo);
    }
}
