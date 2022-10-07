package POO;

public enum TipoAutomovil {
    DEPORTIVO("Deportivo", "Alta gama", 2),
    FAMILIAR("Familiar", "Baja gama", 4),
    CAMIONETA("Camioneta 4x4 ", "Media gama",7);


    private final String nombre;
    private final String gama;
    private final int capacidad;

    TipoAutomovil(String nombre, String gama, int capacidad) {
        this.nombre = nombre;
        this.gama = gama;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGama() {
        return gama;
    }

    public int getCapacidad() {
        return capacidad;
    }
}