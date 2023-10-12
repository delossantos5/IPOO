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
        Objeto obj3 = new Objeto("lapiz");
        Objeto obj4 = new Objeto("goma");
        try{
            bolsa.add(obj1);
            bolsa.add(obj2);
            bolsa.add(obj4);
            bolsa.add(obj3);
            bolsa.remove(obj4);
            bolsa.remove(obj2);
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
