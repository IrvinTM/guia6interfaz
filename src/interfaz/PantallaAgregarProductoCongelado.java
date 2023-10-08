package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import logica.ProductoCongeladoPorAire;

public class PantallaAgregarProductoCongelado extends JFrame {

    AdministrarDatos administrarDatos; 

    public PantallaAgregarProductoCongelado() {
        iniciarComponentes();
        administrarDatos = new AdministrarDatos();
        administrarDatos.crearArrayList();
    }

    private void iniciarComponentes() {
        setTitle("Agregar Producto Congelado");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //jtabbedpane para los tres tipos de producto congelado
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(10, 10, 500, 500);
         //crear el primer layout para productos congelados por aire 

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        JLabel nombre_lbl = new JLabel("Nombre: ");
        nombre_lbl.setBounds(10, 10, 100, 30);
        JTextField nombre_txt = new JTextField();
        nombre_txt.setBounds(120, 10, 100, 30);
        JLabel fechaDeCaducidad_lbl = new JLabel("Fecha de caducidad: ");
        fechaDeCaducidad_lbl.setBounds(10, 50, 100, 30);
        JTextField fechaDeCaducidad_txt = new JTextField();
        fechaDeCaducidad_txt.setBounds(120, 50, 100, 30);
        JLabel numLote_lbl = new JLabel("Numero de lote: ");
        numLote_lbl.setBounds(10, 90, 100, 30);
        JTextField numLote_txt = new JTextField();
        numLote_txt.setBounds(120, 90, 100, 30);
        JLabel fechaDeEnvasado_lbl = new JLabel("Fecha de envasado: ");
        fechaDeEnvasado_lbl.setBounds(10, 130, 100, 30);
        JTextField fechaDeEnvasado_txt = new JTextField();
        fechaDeEnvasado_txt.setBounds(120, 130, 100, 30);
        JLabel paisDeOrigen_lbl = new JLabel("Pais de origen: ");
        paisDeOrigen_lbl.setBounds(10, 170, 100, 30);
        JTextField paisDeOrigen_txt = new JTextField();
        paisDeOrigen_txt.setBounds(120, 170, 100, 30);
        JLabel tempRecomendada_lbl = new JLabel("Temperatura recomendada: ");
        tempRecomendada_lbl.setBounds(10, 210, 100, 30);
        JTextField tempRecomendada_txt = new JTextField();
        tempRecomendada_txt.setBounds(120, 210, 100, 30);
        JLabel porcentajeNitrogeno_lbl = new JLabel("Porcentaje de nitrogeno: ");
        porcentajeNitrogeno_lbl.setBounds(10, 250, 100, 30);
        JTextField porcentajeNitrogeno_txt = new JTextField();
        porcentajeNitrogeno_txt.setBounds(120, 250, 100, 30);
        JLabel porcentajeOxigeno_lbl = new JLabel("Porcentaje de oxigeno: ");
        porcentajeOxigeno_lbl.setBounds(10, 290, 100, 30);
        JTextField porcentajeOxigeno_txt = new JTextField();
        porcentajeOxigeno_txt.setBounds(120, 290, 100, 30);
        JLabel porcentajeDioxidoCarbono_lbl = new JLabel("Porcentaje de dioxido de carbono: ");
        porcentajeDioxidoCarbono_lbl.setBounds(10, 330, 100, 30);
        JTextField porcentajeDioxidoCarbono_txt = new JTextField();
        porcentajeDioxidoCarbono_txt.setBounds(120, 330, 100, 30);
        JLabel porcentajeVaporAgua_lbl = new JLabel("Porcentaje de vapor de agua: ");
        porcentajeVaporAgua_lbl.setBounds(10, 370, 100, 30);
        JTextField porcentajeVaporAgua_txt = new JTextField();
        porcentajeVaporAgua_txt.setBounds(120, 370, 100, 30);

        JButton guardar_btn = new JButton("Guardar");
        // guardar btn placed at the bottom of the panel
        guardar_btn.setBounds(10, 410, 100, 30);
        guardar_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombre_txt.getText();
                String fechaDeCaducidad = fechaDeCaducidad_txt.getText();
                int numLote = Integer.parseInt(numLote_txt.getText());
                String fechaDeEnvasado = fechaDeEnvasado_txt.getText();
                String paisDeOrigen = paisDeOrigen_txt.getText();
                int tempRecomendada = Integer.parseInt(tempRecomendada_txt.getText());
                int porcentajeNitrogeno = Integer.parseInt(porcentajeNitrogeno_txt.getText());
                int porcentajeOxigeno = Integer.parseInt(porcentajeOxigeno_txt.getText());
                int porcentajeDioxidoCarbono = Integer.parseInt(porcentajeDioxidoCarbono_txt.getText());
                int porcentajeVaporAgua = Integer.parseInt(porcentajeVaporAgua_txt.getText());
                ProductoCongeladoPorAire productoCongeladoAire = new ProductoCongeladoPorAire(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada, porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoCarbono, porcentajeVaporAgua);
                administrarDatos.insertarProducto(productoCongeladoAire);
                System.out.println(administrarDatos.mostrarProductos());

            }
        });

        JButton mostrarRegistros_btn = new JButton("Mostrar registros");
        mostrarRegistros_btn.setBounds(10, 410, 100, 30);
        mostrarRegistros_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(administrarDatos.mostrarProductos());
            }
        });

        
        
        panel1.add(nombre_lbl);
        panel1.add(nombre_txt);
        panel1.add(fechaDeCaducidad_lbl);
        panel1.add(fechaDeCaducidad_txt);
        panel1.add(numLote_lbl);
        panel1.add(numLote_txt);
        panel1.add(fechaDeEnvasado_lbl);
        panel1.add(fechaDeEnvasado_txt);
        panel1.add(paisDeOrigen_lbl);
        panel1.add(paisDeOrigen_txt);
        panel1.add(tempRecomendada_lbl);
        panel1.add(tempRecomendada_txt);
        panel1.add(porcentajeNitrogeno_lbl);
        panel1.add(porcentajeNitrogeno_txt);
        panel1.add(porcentajeOxigeno_lbl);
        panel1.add(porcentajeOxigeno_txt);
        panel1.add(porcentajeDioxidoCarbono_lbl);
        panel1.add(porcentajeDioxidoCarbono_txt);
        panel1.add(porcentajeVaporAgua_lbl);
        panel1.add(porcentajeVaporAgua_txt);
        panel1.add(mostrarRegistros_btn);
        panel1.add(guardar_btn);
        panel1.setVisible(true);
        tabbedPane.addTab("Congelado por aire", panel1);
        this.add(tabbedPane);

        


    
}
}
