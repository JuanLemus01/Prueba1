package model;

public class Alumno implements Comparable<Alumno>{

    private String name;
    private int nota;

    public Alumno() {
    }

    public Alumno(String name, int nota) {
        this.name = name;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return name + " nota= " + nota ;
    }

gi
    @Override
    public int compareTo(Alumno a) {

        //Solo si deseo repetir o no
        /*if (this.nota == a.nota) {
            return 0;
        }
         */
        if (this.nota > a.nota) {
            return 1;
        } else {
            return -1;
        }
    }
}
