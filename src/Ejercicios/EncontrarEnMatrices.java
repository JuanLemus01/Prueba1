package Ejercicios;

public class EncontrarEnMatrices {


    public static void main(String[] args) {
        int [][] matriz = {
                {35 , 23 ,40},
                {1,2,7},
                {2991,50,20}
        };
        int i = 0 ;
        int k = 0;
        boolean encontrado = false;
        buscar: for (i = 0; i < matriz.length; i++) {
            for (k = 0; k < matriz[i].length; k++) {
                if (matriz[i][k] == 7 ){
                    encontrado = true;
                    break buscar;
                }

            }
        }
        System.out.println("El elemento fue encontrado en la cordenada: "+i +" , "+k);
    }
}
