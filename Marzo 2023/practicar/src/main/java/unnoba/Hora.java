package unnoba;
import java.util.Scanner;
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;
    
    public Hora(){
        this.horas=00;
        this.minutos=00;
        this.segundos=00;
    }
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        validar();
    }
  public void leer() {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Introduce las horas: ");
        this.horas = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        this.minutos = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        this.segundos = scanner.nextInt();
        validar();
    } finally {
        scanner.close();
    }
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int hora) {
        this.horas = hora;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void validar(){
        if(horas<0 || horas>=24){
            horas=0;
        }
        if(minutos<0 || minutos>=60){
            minutos=0;
        }
        if(segundos<0||segundos>=60){
            segundos=0;
        }
    }
    public String print(){
        return "07:03:21";
    }
    public int aSegundos(){
        return horas*3600+horas*60+segundos;
    }
    public void deSegundos(int segundos) {
        this.horas = segundos / 3600 % 24;
        this.minutos = (segundos % 3600) / 60;
        this.segundos = segundos % 60;
    }

    public int segundosDesde(Hora unaHora){
        return Math.abs(this.aSegundos()-unaHora.aSegundos());
    }
    public void siguiente(){
        int totalSegundos = aSegundos();
        totalSegundos = (totalSegundos + 1) % (24 * 3600);
        deSegundos(totalSegundos);
    }
    public void anterior(){
        int totalSegundos = aSegundos();
        totalSegundos = (totalSegundos - 1 + 24 * 3600) % (24 * 3600);
        deSegundos(totalSegundos);
    }
    public Hora copia() {
        return new Hora(this.horas, this.minutos, this.segundos);
    }
    public Boolean esIgual(Hora unHora){
        return this.horas == unHora.horas && this.minutos== unHora.minutos && this.segundos==unHora.segundos;
    }
    public Boolean menorQue(Hora unHora){
        return this.aSegundos()<unHora.aSegundos();
    }
    public Boolean mayorQue(Hora unHora){
        return this.aSegundos()>unHora.aSegundos();
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",horas,minutos,segundos);
    }
}