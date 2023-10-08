package logica;


public class ProductoFresco extends Producto{
public ProductoFresco() {

    }

    public ProductoFresco(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado, String paisDeOrigen) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
    }

    @Override

public String toString() {
        return super.toString();
    }
}