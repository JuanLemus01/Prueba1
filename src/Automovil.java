public class Automovil {
    String marca, color;
    int modelo;

    public Automovil(String marca, String color, int modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Automovil acelera");
    }
    public void frenar(){
        System.out.println("Automovil frena");
    }
    public void arrancar(){
        System.out.println("Automovil en marcha");
    }
}
