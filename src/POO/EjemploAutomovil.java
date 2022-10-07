package POO;

public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil f90 = new Automovil("avr123","Ferrari");
        f90.setPrecio(2000);
        f90.setTipo(TipoAutomovil.FAMILIAR);

        TipoAutomovil tipoF90 = f90.getTipo();

        switch (tipoF90){
            case DEPORTIVO -> System.out.println("El "+f90.getMarca()+" es un deportivo de "+tipoF90.getGama());
        }

    }
}
