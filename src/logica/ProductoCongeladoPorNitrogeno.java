package logica;


public class ProductoCongeladoPorNitrogeno extends ProductoCongelado {

    private String metodoDeCongelacion;
    private int tiempoExpoNitrogeno;
    public ProductoCongeladoPorNitrogeno(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, String metodoDeCongelacion, int tiempoExpoNitrogeno) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
    }
    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }
    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }
    public int getTiempoExpoNitrogeno() {
        return tiempoExpoNitrogeno;
    }
    public void setTiempoExpoNitrogeno(int tiempoExpoNitrogeno) {
        this.tiempoExpoNitrogeno = tiempoExpoNitrogeno;
    }

    @Override

    public String toString() {
        return super.toString() + "\nMetodo de congelacion: " + metodoDeCongelacion + "\nTiempo de exposicion al nitrogeno: " + tiempoExpoNitrogeno;
    }
    
}