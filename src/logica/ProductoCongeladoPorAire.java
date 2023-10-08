
package logica;


public class ProductoCongeladoPorAire extends ProductoCongelado {

    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoCarbono;
    private int porcentajeVaporAgua;

    public ProductoCongeladoPorAire(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, int porcentajeNitrogeno, int porcentajeOxigeno,
            int porcentajeDioxidoCarbono, int porcentajeVaporAgua) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }
    
    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }
    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }
    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }
    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }
    public int getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }
    public void setPorcentajeDioxidoCarbono(int porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }
    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }
    public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override

    public String toString() {
        return super.toString() + "\nPorcentaje de nitrogeno: " + porcentajeNitrogeno + "\nPorcentaje de oxigeno: " + porcentajeOxigeno + "\nPorcentaje de dioxido de carbono: " + porcentajeDioxidoCarbono + "\nPorcentaje de vapor de agua: " + porcentajeVaporAgua;
    }
    
}

