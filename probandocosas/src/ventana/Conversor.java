package ventana;
/**
 * La clase Conversor proporciona métodos para convertir cantidades de una moneda a otra.
 * Se utiliza para realizar conversiones entre diferentes monedas utilizando sus tasas de cambio.
 */
public class Conversor {

    /**
     * Convierte una cantidad de una moneda a otra.
     *
     * @param m1   La moneda de origen.
     * @param cant La cantidad a convertir.
     * @param m2   La moneda de destino.
     * @return La cantidad convertida en la moneda de destino.
     * @throws NoEsNumeroException Si alguna de las monedas no es un número válido.
     */
    public float convertirPesos(Moneda m1,float cant,Moneda m2) throws NoEsNumeroException{
        if(m1.equals(m2)){
            return cant;
        }
        return (cant*m1.monto())/m2.monto();
    }
    /**
     * Convierte una cantidad de una moneda a otra.
     *
     * @param m1   La moneda de origen.
     * @param cant La cantidad a convertir.
     * @param m2   La moneda de destino.
     * @return La cantidad convertida en la moneda de destino.
     * @throws NoEsNumeroException Si alguna de las monedas no es un número válido.
     */
    public float convertirAMonedaExtranjera(Moneda m1,float cant, Moneda m2)throws NoEsNumeroException{
        if(m1.equals(m2)){
            return cant;
        }
        return (cant*m1.monto())/m2.monto();
    }
}
