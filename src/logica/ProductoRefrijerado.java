package logica;


public class ProductoRefrijerado extends Producto {

    private int codigoOrganismoSupAl;
    private float tempRecomendada;

    public ProductoRefrijerado(String nombre,String fechaDeCaducidad, int numLote,String fechaDeEnvasado, String paisDeOrigen,
            int codigoOrganismoSupAl, float tempRecomendada) {
        super(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
        this.codigoOrganismoSupAl = codigoOrganismoSupAl;
        this.tempRecomendada = tempRecomendada;
    }

    public int getCodigoOrganismoSupAl() {
        return codigoOrganismoSupAl;
    }

    public void setCodigoOrganismoSupAl(int codigoOrganismoSupAl) {
        this.codigoOrganismoSupAl = codigoOrganismoSupAl;
    }

    public float getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(float tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    @Override

    public String toString() {
        return super.toString() + "\nCodigo de organismo de supervicion alimentaria: " + codigoOrganismoSupAl + "\nTemperatura recomendada: " + tempRecomendada;
    }
}
