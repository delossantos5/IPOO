import java.util.ArrayList;
import java.util.List;

public class AlquilerFlota extends Alquiler{
    private List<Vehiculo>vehiculos=new ArrayList<>();
    public AlquilerFlota(Cliente cliente) {
        super(cliente);
        this.vehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void add(Vehiculo unVehiculo){
        vehiculos.add(unVehiculo);
    }
    public void remove(Vehiculo unVehiculo){
        vehiculos.remove(unVehiculo);
    }
    @Override
    public float getMontoAlquiler() {
        float total=0;
        for(Vehiculo unVehiculo : vehiculos ){
            total= total+unVehiculo.valorAlquiler();
        }
        return total;
    }
    @Override
    public float getMontoVehiculo() {
        float total=0;
        for(Vehiculo unVehiculo : vehiculos ){
            total= total+unVehiculo.getPrecio();
        }
        return total;
    }
    @Override
    public int getTotalVehiculos() {
        return vehiculos.size();
    }
}
