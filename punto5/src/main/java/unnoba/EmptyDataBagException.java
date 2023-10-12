package unnoba;

public class EmptyDataBagException extends Exception {
    private int cantidad;
    
    public EmptyDataBagException(int numero){
        cantidad=numero;
    }

    @Override
    public String toString() {
        if (cantidad==0){
            return "DataBag no tiene elementos";
        }
        else{
            return "El elemento no esta en DataBag ";
        }
    }

}
