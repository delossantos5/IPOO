
public class CuotaException extends Exception {
    private int cuota;
    public CuotaException(int cuota){
        this.cuota=cuota;
    }

    @Override
    public String toString() {
        if (cuota < 6) {
            return "La cantidad de cuotas que se ingreso es menor al minimo de cuotas ";
        }
        if (cuota > 36) {
            return "La cantidad de cuotas que se ingreso es mayor al maximo de cuotas ";
        }
        return null;
    }
}