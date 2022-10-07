package Ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EstanqueGas {
    public static void main(String[] args) {


        ArrayList <String> arrNombre = new ArrayList<>();
        String mayor = "";
        String nombre1= JOptionPane.showInputDialog(null,"Ingrese el nombre completo de la persona 1");
        String nombre2= JOptionPane.showInputDialog(null,"Ingrese el nombre completo de la persona 2");
        String nombre3= JOptionPane.showInputDialog(null,"Ingrese el nombre completo de la persona 3");

        String[] newName1 = nombre1.split(" ");
        String[] newName2 = nombre2.split(" ");
        String[] newName3 = nombre3.split(" ");

        mayor = newName1[0].length() > newName2[0].length() ?newName1[0]:newName2[0];
        mayor = newName3[0].length() > newName1[0].length() ?newName3[0]:mayor;

        arrNombre.add(nombre1);
        arrNombre.add(nombre2);
        arrNombre.add(nombre3);

        System.out.println("Nombres: "+arrNombre);

        JOptionPane.showConfirmDialog(null,"El nombre mas largo es el de: "+mayor);


    }
}
