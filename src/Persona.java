public class Persona {

    int iden;
    String nom;

    public void imprimir(){
        System.out.println("NOmbre"+nom);
    }

    public static void main(String[] args) {
        Persona per1 = new Persona();

        per1.nom = "Juan";

        per1.imprimir();
    }

}
