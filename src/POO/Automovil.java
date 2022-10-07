package POO;

public class Automovil {

    private String placa;
    private String marca;
    private int precio;
    private TipoAutomovil tipo;

    public Automovil(String placa, String marca, int precio, TipoAutomovil tipo) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Automovil(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
}
