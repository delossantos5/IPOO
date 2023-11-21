public class Auto {
    private String marca;
    private String modelo;
    private String descripcion;
    private float precioCosto;

    public Auto(String marca, String modelo, String descripcion, float precioCosto) {
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }
}
