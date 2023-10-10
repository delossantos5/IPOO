package unnoba;

public class FullDataBagException extends Exception {
    private int cantidad;
    
    public FullDataBagException(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Se llego a la capacidad maxima de la bolsa, elimine uno de los "+ cantidad + "elemntos que hay en la bolsa " ;
    }
    
}
