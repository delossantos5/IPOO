import java.time.LocalTime;


public class Contado implements Venta {
    private Persona cliente;
    private Auto auto;
    private LocalTime fechaDeAlta;
    private static final float RECARGO =0.10f;

    public Contado(Persona cliente, Auto auto, LocalTime fechaDeAlta) {
        this.cliente = cliente;
        this.auto = auto;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public LocalTime getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalTime fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public float montoVenta() {
        return auto.getPrecioCosto()+RECARGO;
    }
}
