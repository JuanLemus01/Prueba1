package Ejercicios;

public class main {
    public static void main(String[] args) {

        //Ejercicio cuenta bancaria
        CuentaBancaria cuentaA = new CuentaBancaria();

        cuentaA.ingresarDatos();

        System.out.println(cuentaA.datos());
        System.out.println("---------------Ejercicio2---------------------");
        //Libros
        Libro libro1 = new Libro("El principito","desconocido",4,2);

        libro1.imprimir();
        System.out.println("---------------Ejercicio3---------------------");

        //Ejercicios.Operaciones
        Operaciones ope1 = new Operaciones(2,2);
        ope1.mostrarOP();
        System.out.println("---------------Ejercicio4---------------------");

        //Ejercicios.Rectangulo

        Rectangulo rect = new Rectangulo(3,2);
        System.out.println("El area del rectangulo es: "+rect.area());
        System.out.println("El perimetro del rectangulo es: "+rect.perimetro());
    }
}
