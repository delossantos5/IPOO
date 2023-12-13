public class AlquilerSimple extends Alquiler{
    private Vehiculo vehiculo;
    public AlquilerSimple(Cliente cliente, Vehiculo unVehiculo) {
        super(cliente);
        this.vehiculo=unVehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public float getMontoAlquiler() {
        return vehiculo.valorAlquiler();
    }

    @Override
    public float getMontoVehiculo() {
        return vehiculo.getModelo();
    }

    @Override
    public int getTotalVehiculos() {
        return 1;
    }
}
