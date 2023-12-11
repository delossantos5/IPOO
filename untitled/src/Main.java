import java.util.GregorianCalendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria= new Concesionaria();
        Auto auto = new Auto("Citroen","C3","SUV",3456789);
        concesionaria.agregarAuto(auto);
        Persona cliente = new Persona("Tobias","de los Santos","43305141");
        Contado venta1= new Contado(cliente,auto,new GregorianCalendar(2022,12,31));
        concesionaria.agregarVenta(venta1);
        System.out.print("El precio de la venta es: $"+venta1.montoVenta()+"\n");
        Auto auto1= new Auto("Toyota","Hillux","SRX",3805677);
        concesionaria.agregarAuto(auto1);
        Cuota venta2 = new Cuota(cliente, auto1, new GregorianCalendar(2024, 04, 8), 18);
        //try{
            //venta2.setCuotas(37);
            concesionaria.agregarVenta(venta2);
            System.out.print("El precio de la venta es: $"+venta2.montoVenta()+"\n");
        //} catch (CuotaException e) {
          //  System.out.println(e.toString());}
        Lista venta3=new Lista(cliente,auto1,new GregorianCalendar(2024,5,8));
        concesionaria.agregarVenta(venta3);
        System.out.print("El precio de la venta es: $"+venta3.montoVenta()+"\n");
        System.out.print("Cantidad total de ventas: "+concesionaria.cantidadTotalDeVentas()+"\n");
        System.out.print("Valor de todos los autos: $"+concesionaria.valorDeTodosLosAutos()+"\n");
        System.out.print("Monto total de las ventas: $"+concesionaria.montoTotalVentas()+"\n");
        System.out.print("Monto total de las Cuotas: $"+concesionaria.montoTotalCuotas()+"\n");
    }
}