package Ejercicios;

public class Rectangulo {

    int ladoA, ladoB;

    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public int area(){
        int area = 0;
        area = ladoA * ladoB;
        return area;
    }
    public int perimetro(){
        int perimetro = 0;
        perimetro = 2*(ladoB + ladoA);
        return perimetro;
    }
}
