package unnoba;

import java.util.ArrayList;
import java.util.List;

public class DataBag {
    public final int capacidadMaxima= 3;

    private List<Elemento>elementos= new ArrayList<Elemento>();

    public void add(Elemento e) throws FullDataBagException{
        if (elementos.size()<capacidadMaxima)
            elementos.add(e);
        else
         throw new FullDataBagException(elementos.size());    
    }
    public void remove(Elemento e) throws EmptyDataBagException{
        if(!elementos.isEmpty() && elementos.contains(e))     
            elementos.remove(e);
        else
            throw new EmptyDataBagException(elementos.size());
    }
    
    
    
}
