package ventana;
/**
 * Enumeración que representa diferentes tipos de monedas, junto con sus tasas de cambio asociadas.
 */
public enum Moneda {
    DOLAR_BLUE(900),EURO(387),REAL(7490),PESO(1);
    private final float monto;
    /**
     * Constructor de la enumeración Moneda.
     *
     * @param monto La tasa de cambio asociada a la moneda.
     */
    Moneda (float monto){
        this.monto=monto;
    }
    /**
     * Obtiene la tasa de cambio de la moneda.
     *
     * @return La tasa de cambio de la moneda.
     */
    public float monto(){
        return monto;
    }
}

