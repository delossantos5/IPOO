package unnoba;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DataBag bolsa= new DataBag();
        Objeto obj1=new Objeto("cartas");
        Objeto obj2= new Objeto("dados");
        try{
            bolsa.add(obj2);
            bolsa.add(obj1);
            bolsa.remove(obj1);
        }
        catch(FullDataBagException e){
            System.out.println(e.toString());
        }
        catch(EmptyDataBagException e){
            System.out.println(e.toString());
        }
    }
}
