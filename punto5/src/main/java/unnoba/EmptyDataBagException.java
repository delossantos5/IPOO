package unnoba;

public class EmptyDataBagException extends Exception {
    private int cantidad;
    
    public EmptyDataBagException(int numero){
        cantidad=numero;
    }

    @Override
    public String toString() {
        return "La cantidad es" + cantidad + " por lo tanto no se pueden remover elementos de la bolsa";
    }
    

}
