
package logica;

public class ProductoCongeladoPorAgua extends ProductoCongelado {

    private String salinidadAgua;

    public ProductoCongeladoPorAgua(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado,
            String paisDeOrigen, float tempRecomendada, String salinidadAgua) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    public String getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(String salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override

    public String toString() {
        return super.toString() + "\nSalinidad del agua: " + salinidadAgua;
    }
    
    

    
}


