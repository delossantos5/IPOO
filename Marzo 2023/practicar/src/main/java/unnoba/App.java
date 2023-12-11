package unnoba;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("------");
        Hora h1=new Hora();
        System.out.println(h1);
        System.out.println("------");
        Hora h2= new Hora();
        h2.leer();
        System.out.println(h2);
        System.out.println("------");
        Hora h3=new Hora(17, 20, 12);
        System.out.println(h3);
        System.out.println("------");
        System.out.println(h1.aSegundos());
        System.out.println(h2.aSegundos());
        System.out.println(h3.aSegundos());
        System.out.println("------");
        System.out.println("Hora1 sin modificar "+h1);
        System.out.println("Hora2 sin modificar "+h2);
        System.out.println("Hora3 sin modificar "+h3);
        h1.deSegundos(350);
        h2.deSegundos(3600);
        h3.deSegundos(999);
        System.out.println("Hora1 modificada "+h1);
        System.out.println("Hora2 modificada "+h2);
        System.out.println("Hora3 modificada "+h3);
        System.out.println("------");
        System.out.println(h1.print());
        System.out.println(h1.esIgual(h2));
        System.out.println(h2.esIgual(h3));
        System.out.println("------");
        System.out.println(h1.mayorQue(h2));
        System.out.println(h2.mayorQue(h3));
        System.out.println("------");
        System.out.println(h1.menorQue(h2));
        System.out.println(h1.menorQue(h3));
        System.out.println("------");
        System.out.println(h1.copia());
    }
}
