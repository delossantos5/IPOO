import java.util.ArrayList;
import java.util.List;
public class Concesionaria {
    private List<Auto> autos = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public Concesionaria() {
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void agregarVenta(Venta unaVenta) {
        ventas.add(unaVenta);
    }

    public void agregarAuto(Auto unAuto) {
        autos.add(unAuto);
    }

    public long montoTotalVentas() {
        long total = 0;
        for (Venta unaVenta : ventas) {
            total += unaVenta.montoVenta();
        }
        return total;
    }

    public int cantidadTotalDeVentas() {
        return ventas.size();
    }

    public int valorDeTodosLosAutos() {
        int total = 0;
        for (Auto unAuto : autos) {
            total += unAuto.getPrecioCosto();
        }
        return total;
    }

    public float montoTotalCuotas() {
        float totalCuotas = 0;
        for (Venta unaVenta : ventas) {
            // Verificamos si la venta es a plazos (es una instancia de Cuota)
            if (unaVenta instanceof Cuota) {
                Cuota cuota = (Cuota) unaVenta;
                totalCuotas += cuota.montoVenta();
            }
        }
        return totalCuotas;
    }
}
