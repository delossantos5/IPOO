import java.util.GregorianCalendar;

public class Cuota implements Venta{
    private Persona cliente;
    private Auto auto;
    private GregorianCalendar fechaDeAlta;
    private static final float RECARGO=0.03f;
    private int cuotas;
    private static final int MINIMO=6;
    private static final int MAXIMO=36;

    public Cuota(Persona cliente, Auto auto, GregorianCalendar fechaDeAlta, int cuotas) {
        this.cliente = cliente;
        this.auto = auto;
        this.fechaDeAlta = fechaDeAlta;
        this.cuotas = cuotas;
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

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) throws CuotaException {
        if (cuotas>=6 && cuotas<=36) {
            this.cuotas = cuotas;
        }
        else
            throw new CuotaException(cuotas);
    }

    @Override
    public double montoVenta() {
        double recargoPorCuotas = auto.getPrecioCosto() * cuotas * RECARGO;
        double precioFinal = auto.getPrecioCosto() + recargoPorCuotas;

        return precioFinal;
    }
}
