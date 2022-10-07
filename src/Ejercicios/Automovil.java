package Ejercicios;

public class Automovil {
    String marca, color;
    int modelo;

    public Automovil(String marca, String color, int modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Ejercicios.Automovil acelera");
    }
    public void frenar(){
        System.out.println("Ejercicios.Automovil frena");
    }
    public void arrancar(){
        System.out.println("Ejercicios.Automovil en marcha");
    }
}
