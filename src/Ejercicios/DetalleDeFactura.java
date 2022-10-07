package Ejercicios;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        double totalFact = 0;
        double totalSinImp= 0;
        double totImpu = 0;
        double impueto19 = 0.19;
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFact = obj.nextLine();
        System.out.println("Ingrese el precio del producto 1");
        double precioProd1 = obj.nextDouble();
        System.out.println("Ingrese el precio del producto 2 ");
        double precioProd2 = obj.nextDouble();

        totalSinImp = precioProd1 + precioProd2;
        totImpu = totalSinImp * impueto19;

        totalFact = totImpu + totalSinImp;


        System.out.println("La factura "+nombreFact+" tiene un total neto de: "+totalSinImp+" y un impuesto del 19 que corresponde a "+totImpu+", su total es "+totalFact);

    }
}
