public abstract class Vehiculo {
    private String marca;
    private int modelo;
    private float precio;
    private float alquiler;

    public Vehiculo(String marca, int modelo, float precio, float alquiler) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.alquiler = alquiler;
    }
    public abstract float valorAlquiler();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(float alquiler) {
        this.alquiler = alquiler;
    }
}
