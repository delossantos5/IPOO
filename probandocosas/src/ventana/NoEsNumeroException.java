package ventana;
/**
 * Excepción personalizada que se lanza cuando no se ingresa un número por teclado.
 */
public class NoEsNumeroException extends Throwable {
    private int cantidad;
    /**
     * Constructor de la excepción.
     *
     * @param teclado La cantidad ingresada por teclado que generó la excepción.
     */
    public NoEsNumeroException(int teclado) {

        cantidad = teclado;
    }
    /**
     * Obtiene un mensaje descriptivo de la excepción.
     *
     * @return Un mensaje que indica que no se ingresó nada por teclado.
     */
    public String getMessage() {

        return "No ingreso nada por teclado";
    }
}
