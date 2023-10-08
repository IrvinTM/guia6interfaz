package logica;

public class ProductoCongelado extends Producto {
    
   private float tempRecomendada;

    public ProductoCongelado(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado, String paisDeOrigen,
            float tempRecomendada) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
        this.tempRecomendada = tempRecomendada;
    }

    public float getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(float tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public void ProductosCongeladosPorAire() {
        
    }

    @Override

    public String toString() {
        return super.toString() + "\nTemperatura recomendada: " + tempRecomendada;
    }
    
}
