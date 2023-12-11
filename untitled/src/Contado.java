import java.util.GregorianCalendar;


public class Contado implements Venta {
    private Persona cliente;
    private Auto auto;
    private GregorianCalendar fechaDeAlta;
    private static final float RECARGO =0.10f;

    public Contado(Persona cliente, Auto auto, GregorianCalendar fechaDeAlta) {
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

    public GregorianCalendar getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(GregorianCalendar fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    @Override
    public double montoVenta() {
        double recargo = auto.getPrecioCosto() * RECARGO;
        double precioFinal = auto.getPrecioCosto() + recargo;
        return precioFinal;
    }
}
