package Ejercicios;

public class Operaciones {

    int num1, num2, resu;

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void suma(){
        resu = num1 + num2;
        System.out.println("El resultado de la suma es " + resu);
    }
    public void resta(){
        resu = num1 - num2;
        System.out.println("El resultado de la resta es " + resu);
    }
    public void multiplicacion(){
        resu = num1 * num2;
        System.out.println("El resultado de la miltiplicacion es " + resu);
    }
    public void division(){
        resu = num1 / num2;
        System.out.println("El resultado de la division es " + resu);
    }

    public void mostrarOP(){
        suma();
        resta();
        multiplicacion();
        division();
    }
}
