import java.time.LocalTime;

public class Lista implements Venta{
    private Persona cliente;
    private Auto auto1;
    private LocalTime fechaDeAlta;
    private static final float RECARGO=0.15f;

    public Lista(Persona cliente, Auto auto, LocalTime fechaDeAlta) {
        this.cliente = cliente;
        this.auto1 = auto;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto1;
    }

    public void setAuto(Auto auto) {
        this.auto1 = auto;
    }

    public LocalTime getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalTime fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public float montoVenta() {
        return auto1.getPrecioCosto() + RECARGO;
    }
}
