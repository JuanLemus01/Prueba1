package Ejercicios;

public class Libro {
    String tituloLibro, autor;
    int numEjemplares, numEjempPres;

    public Libro(String tituloLibro, String autor, int numEjemplares, int numEjempPres) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjempPres = numEjempPres;
    }

    public void imprimir() {
        System.out.println("Ejercicios.Libro: "+tituloLibro+"\nAutor: "+autor+"\nEjemplares: "+numEjemplares+"\nEjemplares prestados: "+numEjempPres);
    }
}
