
package logica;


public class Producto {
    private String nombre;
    private String fechaDeCaducidad;
    private int numLote;
    private String fechaDeEnvasado;
    private String paisDeOrigen;

    public Producto() {
    }

    public Producto(String nombre, String fechaDeCaducidad, int numLote, String fechaDeEnvasado, String paisDeOrigen) {
        this.nombre = nombre;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numLote = numLote;
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(String fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override

    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Fecha de caducidad: " + this.fechaDeCaducidad + "\n" +
                "Numero de lote: " + this.numLote + "\n" +
                "Fecha de envasado: " + this.fechaDeEnvasado + "\n" +
                "Pais de origen: " + this.paisDeOrigen + "\n";
    }
    
}