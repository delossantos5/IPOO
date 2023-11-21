import java.time.LocalTime;

public class Cuota implements Venta{
    private Persona cliente;
    private Auto auto;
    private LocalTime fechaDeAlta;
    private static final float RECARGO=0.03f;
    private int cuotas;
    private static final int MINIMO=6;
    private static final int MAXIMO=36;

    public Cuota(Persona cliente, Auto auto, LocalTime fechaDeAlta, int cuotas) {
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

    public LocalTime getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalTime fechaDeAlta) {
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
    public float montoVenta() {
        float recargoFinal= cuotas*RECARGO;
        return auto.getPrecioCosto()+recargoFinal;
    }
}
