import java.util.GregorianCalendar;

public class Lista implements Venta{
    private Persona cliente;
    private Auto auto1;
    private GregorianCalendar fechaDeAlta;
    private static final float RECARGO=0.15f;

    public Lista(Persona cliente, Auto auto, GregorianCalendar fechaDeAlta) {
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

    public GregorianCalendar getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(GregorianCalendar fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }
    @Override
    public double montoVenta() {
        double recargo = auto1.getPrecioCosto() * RECARGO;
        double precioFinal = auto1.getPrecioCosto() + recargo;
        return precioFinal;
    }
}
