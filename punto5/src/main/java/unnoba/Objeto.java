package unnoba;

public class Objeto implements Elemento {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }
    
}
