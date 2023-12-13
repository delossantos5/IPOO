public class Camion extends Vehiculo {

    public Camion(String marca, int modelo, float precio, float alquiler) {
        super(marca, modelo, precio, alquiler);
    }

    @Override
    public float valorAlquiler() {
        return this.getAlquiler();
    }
}
