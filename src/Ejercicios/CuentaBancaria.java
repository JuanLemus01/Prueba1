package Ejercicios;

import java.util.Scanner;

public class CuentaBancaria {
    String numCuenta;
    String nomTitular, apellidosTitlar;
    int tipoCuenta;
    int saldoCuenta = 0;

    public CuentaBancaria(String numCuenta, String nomTitular, String apellidosTitlar, int tipoCuenta, int saldoCuenta) {
        this.numCuenta = numCuenta;
        this.nomTitular = nomTitular;
        this.apellidosTitlar = apellidosTitlar;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public CuentaBancaria() {

    }


    public void ingresarDatos(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese la numero del la cuenta");
        numCuenta = scr.nextLine();
        System.out.println("Ingrese el nombre del titular");
        nomTitular = scr.nextLine();
        System.out.println("Ingrese el apellido del titular");
        apellidosTitlar = scr.nextLine();
        System.out.println("Ingrese el tipo de cuenta, recuerde que debe ser ahorros = 1 o corriente = 2");
        try {
            tipoCuenta = scr.nextInt();
        }catch (Exception e){
            System.out.println("Error usted ingreso un valor incorrecto debe ser un numero \n Por favor vuelva a digitar sus datos");
            ingresarDatos();
            System.exit(0);
        }
        if (tipoCuenta != 1 && tipoCuenta !=2){
            System.out.println("Error usted ingreso un valor incorrecto recuerde que debe ser un 1 o 2 \n Por favor vuelva a digitar sus datos");
            ingresarDatos();
            System.exit(0);
        }
        System.out.println("Desea ingresar un saldo nuevo 1 para si o 2 para no");
        int operador = 0;
        try {
            operador = scr.nextInt();
        }catch (Exception e){
            System.out.println("Error usted ingreso un valor incorrecto \n Por favor vuelva a digitar sus datos");
            ingresarDatos();
            System.exit(0);
        }

        if (operador ==1){
            System.out.println("Ingrese el valor de la cuenta, recuerde que debe ser un numero entero");

            try {
                saldoCuenta = scr.nextInt();
            }catch (Exception e){
                System.out.println("Error usted ingreso un valor incorrecto recuerde que debe ser un numero entero \n Por favor vuelva a digitar sus datos");
                ingresarDatos();
                System.exit(0);
            }

        }


    }

    public String datos(){
        String valTipoCue = null;

        String salIniCu = "El saldo inicial de su cuenta es: "+saldoCuenta;

        if (saldoCuenta !=0){
            salIniCu =   salIniCu.replace("inicial", "");
        }
        if (tipoCuenta == 1){
            valTipoCue = "Ahorros";
        }else {
            valTipoCue = "Corriente";
        }
        String datos =  "Titular:" + nomTitular+
                " "+apellidosTitlar +"\nIipo cuenta :" +valTipoCue+
                "\nNumero cuenta: "+ numCuenta+"\n" +salIniCu;
                return datos;
    }



}
