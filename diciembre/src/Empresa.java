import java.util.ArrayList;
import java.util.List;
public class Empresa {
    private String nombre;
    private String direccion;
    private int limite;
    private List<Alquiler> alquileres=new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Empresa(String nombre, String direccion, int limite) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    private  void add(Alquiler unAlquiler){
        alquileres.add(unAlquiler);
    }
    private void remove(Alquiler unAlquiler){
        alquileres.remove(unAlquiler);
    }
    public void registarAlquilerSimple(AlquilerSimple unAlquiler){
        add(unAlquiler);
    }
    public void registrarAlquilerFlota(AlquilerFlota unAlquiler){
        add(unAlquiler);
    }
    public float montoAlquilerDe(Alquiler unAlaquiler){
        return  unAlaquiler.getMontoAlquiler();
    }
    public float montoTotalAlquileres(){
        float total=0;
        for(Alquiler unAlquiler:alquileres){
            total= total+unAlquiler.getMontoAlquiler();
        }
        return total;
    }
}
