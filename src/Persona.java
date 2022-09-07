import java.util.Scanner;

public class Persona {

    int iden;
    String password;
    String passwordHex;
    Scanner scr = new Scanner(System.in);

    public void convertHex(){

        System.out.println("Ingrese una contraseña");
        password = scr.nextLine();

        passwordHex = String.valueOf(Integer.toHexString(Integer.parseInt(password)));

    }
    public void imprimir(){
        System.out.println("Password"+passwordHex);
    }

    public static void main(String[] args) {
        Persona per1 = new Persona();

       per1.convertHex();
       per1.imprimir();
    }

}
