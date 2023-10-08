package interfaz;

import java.util.ArrayList;
import logica.Producto;


public class AdministrarDatos {
    
    ArrayList <Producto> productos = new ArrayList<Producto>();
    
    public AdministrarDatos(){
        
    }

    public void crearArrayList(){
        productos = new ArrayList<>();

    }

    public void insertarProducto(Producto producto){
        productos.add(producto);
    }

    public String mostrarProductos(){
        String informacion = "";
        for (int i = 0; i < productos.size(); i++) {
            informacion = informacion + productos.get(i).toString() + "\n";
        }
        return informacion;
    }
    
}

