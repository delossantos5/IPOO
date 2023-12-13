public class Auto extends Vehiculo {
    private float seguro;

    public Auto(String marca, int modelo, float precio, float alquiler,float seguro) {
        super(marca, modelo, precio, alquiler);
        this.seguro=seguro;
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }


    @Override
    public float valorAlquiler() {
        return  this.getAlquiler()+this.seguro ;
    }
}
