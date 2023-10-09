package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logica.ProductoCongeladoPorAgua;
import logica.ProductoCongeladoPorAire;
import logica.ProductoCongeladoPorNitrogeno;

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
        JTextArea areaDeTexto = new JTextArea();
        areaDeTexto.setBounds(250, 10, 300, 500);
        areaDeTexto.setEditable(false);
        areaDeTexto.setVisible(true);

        JButton guardar_btn = new JButton("Guardar");
        guardar_btn.setBounds(10, 410, 100, 30);
        guardar_btn.setVisible(true);
        guardar_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
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
                    
                } catch (Exception t) {
                    JOptionPane.showMessageDialog(null, "ERROR Uno de los campos contiene un tipo de dato no valido o vacio  ");
                }
                

            }
        });

        JButton mostrarRegistros_btn = new JButton("Mostrar reg.");
        mostrarRegistros_btn.setBounds(120, 410, 120, 30);
        mostrarRegistros_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (areaDeTexto.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No hay registros para mostrar");
                }
                areaDeTexto.setText("");
                areaDeTexto.setText(administrarDatos.mostrarProductos());
            }
        });
        
        
        JLabel nombre_lbl2 = new JLabel("Nombre: ");
        nombre_lbl2.setBounds(10, 10, 100, 30);
        JTextField nombre_txt2 = new JTextField();
        nombre_txt2.setBounds(120, 10, 100, 30);
        JLabel fechaDeCaducidad_lbl2 = new JLabel("Fecha de caducidad: ");
        fechaDeCaducidad_lbl2.setBounds(10, 50, 100, 30);
        JTextField fechaDeCaducidad_txt2 = new JTextField();
        fechaDeCaducidad_txt2.setBounds(120, 50, 100, 30);
        JLabel numLote_lbl2 = new JLabel("Numero de lote: ");
        numLote_lbl2.setBounds(10, 90, 100, 30);
        JTextField numLote_txt2 = new JTextField();
        numLote_txt2.setBounds(120, 90, 100, 30);
        JLabel fechaDeEnvasado_lbl2 = new JLabel("Fecha de envasado: ");
        fechaDeEnvasado_lbl2.setBounds(10, 130, 100, 30);
        JTextField fechaDeEnvasado_txt2 = new JTextField();
        fechaDeEnvasado_txt2.setBounds(120, 130, 100, 30);
        //fix the position one below the previous one
        JLabel paisDeOrigen_lbl2 = new JLabel("Pais de origen: ");
        paisDeOrigen_lbl2.setBounds(10, 170, 100, 30);
        JTextField paisDeOrigen_txt2 = new JTextField();
        paisDeOrigen_txt2.setBounds(120, 170, 100, 30);
        JLabel tempRecomendada_lbl2 = new JLabel("Temperatura recomendada: ");
        tempRecomendada_lbl2.setBounds(10, 210, 100, 30);
        JTextField tempRecomendada_txt2 = new JTextField();
        tempRecomendada_txt2.setBounds(120, 210, 100, 30);
        JLabel salinidadAgua_lbl = new JLabel("Salinidad del agua: ");
        salinidadAgua_lbl.setBounds(10, 250, 100, 30);
        JTextField salinidadAgua_txt = new JTextField();
        salinidadAgua_txt.setBounds(120, 250, 100, 30);
        JTextArea areaDeTexto2 = new JTextArea();
        //add the area de texto to the second panel at the left
        areaDeTexto2.setBounds(250, 10, 300, 500);
        areaDeTexto2.setEditable(false);
        areaDeTexto2.setVisible(true);




        JButton agregarProductoCongeladoPorAgua_btn = new JButton("Guardar");
        agregarProductoCongeladoPorAgua_btn.setBounds(10, 300, 100, 30);
        agregarProductoCongeladoPorAgua_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombre_txt2.getText();
                    String fechaDeCaducidad = fechaDeCaducidad_txt2.getText();
                    int numLote = Integer.parseInt(numLote_txt2.getText());
                    String fechaDeEnvasado = fechaDeEnvasado_txt2.getText();
                    String paisDeOrigen = paisDeOrigen_txt2.getText();
                    float tempRecomendada = Float.parseFloat(tempRecomendada_txt2.getText());
                    String salinidadAgua = salinidadAgua_txt.getText();
                    ProductoCongeladoPorAgua productoCongeladoAgua = new ProductoCongeladoPorAgua(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada, salinidadAgua);
                    administrarDatos.insertarProducto(productoCongeladoAgua);
                    
                } catch (Exception d) {
                    JOptionPane.showMessageDialog(null, "ERROR Uno de los campos contiene un tipo de dato no valido o vacio  ");
                }

            }
        });

        JButton mostrarRegPorAgua = new JButton("Mostrar reg.");
        mostrarRegPorAgua.setBounds(130, 300, 100, 30);
        mostrarRegPorAgua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (areaDeTexto2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No hay registros para mostrar");
                }
                areaDeTexto2.setText("");
                areaDeTexto2.setText(administrarDatos.mostrarProductos());

            }
        });


         JLabel nombre_lbl3 = new JLabel("Nombre: ");
            nombre_lbl3.setBounds(10, 10, 100, 30);
            JTextField nombre_txt3 = new JTextField();
            nombre_txt3.setBounds(120, 10, 100, 30);
            JLabel fechaDeCaducidad_lbl3 = new JLabel("Fecha de caducidad: ");
            fechaDeCaducidad_lbl3.setBounds(10, 50, 100, 30);
            JTextField fechaDeCaducidad_txt3 = new JTextField();
            fechaDeCaducidad_txt3.setBounds(120, 50, 100, 30);
            JLabel numLote_lbl3 = new JLabel("Numero de lote: ");
            numLote_lbl3.setBounds(10, 90, 100, 30);
            JTextField numLote_txt3 = new JTextField();
            numLote_txt3.setBounds(120, 90, 100, 30);
            JLabel fechaDeEnvasado_lbl3 = new JLabel("Fecha de envasado: ");
            fechaDeEnvasado_lbl3.setBounds(10, 130, 100, 30);
            JTextField fechaDeEnvasado_txt3 = new JTextField();
            fechaDeEnvasado_txt3.setBounds(120, 130, 100, 30);
            JLabel paisDeOrigen_lbl3 = new JLabel("Pais de origen: ");
            paisDeOrigen_lbl3.setBounds(10, 170, 100, 30);  
            JTextField paisDeOrigen_txt3 = new JTextField();
            paisDeOrigen_txt3.setBounds(120, 170, 100, 30);
            JLabel tempRecomendada_lbl3 = new JLabel("Temperatura recomendada: ");
            tempRecomendada_lbl3.setBounds(10, 210, 100, 30);
            JTextField tempRecomendada_txt3 = new JTextField();
            tempRecomendada_txt3.setBounds(120, 210, 100, 30);
            JLabel metodoDeCongelacion_lbl = new JLabel("Metodo de congelacion: ");
            metodoDeCongelacion_lbl.setBounds(10, 250, 100, 30);
            JTextField metodoDeCongelacion_txt = new JTextField();
            metodoDeCongelacion_txt.setBounds(120, 250, 100, 30);
            JLabel tiempoExpoNitrogeno_lbl = new JLabel("Tiempo de exposicion al nitrogeno: ");
            tiempoExpoNitrogeno_lbl.setBounds(10, 290, 100, 30);
            JTextField tiempoExpoNitrogeno_txt = new JTextField();
            tiempoExpoNitrogeno_txt.setBounds(120, 290, 100, 30);
            JTextArea areaDeTexto3 = new JTextArea();
            areaDeTexto3.setBounds(250, 10, 300, 500);
            areaDeTexto3.setEditable(false);
            areaDeTexto3.setVisible(true);


            JButton agregarProductoCongeladoPorNitrogeno_btn = new JButton("Guardar");
            agregarProductoCongeladoPorNitrogeno_btn.setBounds(10, 330, 100, 30);
            agregarProductoCongeladoPorNitrogeno_btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String nombre = nombre_txt3.getText();
                        String fechaDeCaducidad = fechaDeCaducidad_txt3.getText();
                        int numLote = Integer.parseInt(numLote_txt3.getText());
                        String fechaDeEnvasado = fechaDeEnvasado_txt3.getText();
                        String paisDeOrigen = paisDeOrigen_txt3.getText();
                        float tempRecomendada = Float.parseFloat(tempRecomendada_txt3.getText());
                        String metodoDeCongelacion = metodoDeCongelacion_txt.getText();
                        int tiempoExpoNitrogeno = Integer.parseInt(tiempoExpoNitrogeno_txt.getText());
                        ProductoCongeladoPorNitrogeno productoCongeladoNitrogeno = new ProductoCongeladoPorNitrogeno(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, tempRecomendada, metodoDeCongelacion, tiempoExpoNitrogeno);
                        administrarDatos.insertarProducto(productoCongeladoNitrogeno);
                        
                    } catch (Exception x) {
                        JOptionPane.showMessageDialog(null, "ERROR Uno de los campos contiene un tipo de dato no valido o vacio  ");
                    }

                }
            });

            JButton mostrarRegPorNitrogeno = new JButton("Mostrar reg.");
            mostrarRegPorNitrogeno.setBounds(130, 330, 100, 30);
            mostrarRegPorNitrogeno.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (areaDeTexto3.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "No hay registros para mostrar");
                    }
                    areaDeTexto3.setText("");
                    areaDeTexto3.setText(administrarDatos.mostrarProductos());

                }
            });





        //buttons for the other two types of congelados
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);

            JPanel panel3 = new JPanel();


        
        
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
        panel1.add(areaDeTexto);
        panel1.add(guardar_btn);
        panel1.add(mostrarRegistros_btn);
        panel1.setLayout(null);
        panel1.setVisible(true);
        tabbedPane.addTab("Congelado por aire", panel1);
        tabbedPane.addTab("Congelado por agua", panel2);
        this.add(tabbedPane);


        panel2.add(nombre_lbl2);
        panel2.add(nombre_txt2);
        panel2.add(fechaDeCaducidad_lbl2);
        panel2.add(fechaDeCaducidad_txt2);
        panel2.add(numLote_lbl2);
        panel2.add(numLote_txt2);
        panel2.add(fechaDeEnvasado_lbl2);
        panel2.add(fechaDeEnvasado_txt2);
        panel2.add(paisDeOrigen_lbl2);
        panel2.add(paisDeOrigen_txt2);
        panel2.add(tempRecomendada_lbl2);
        panel2.add(tempRecomendada_txt2);
        panel2.add(salinidadAgua_lbl);
        panel2.add(salinidadAgua_txt);
        panel2.add(areaDeTexto2);
        panel2.add(agregarProductoCongeladoPorAgua_btn);
        panel2.add(mostrarRegPorAgua);
        panel2.setLayout(null);
        panel2.setVisible(true);
        tabbedPane.addTab("Congelado por agua", panel2);
        this.add(tabbedPane);


        panel3.add(nombre_lbl3);
        panel3.add(nombre_txt3);
        panel3.add(fechaDeCaducidad_lbl3);
        panel3.add(fechaDeCaducidad_txt3);
        panel3.add(numLote_lbl3);
        panel3.add(numLote_txt3);
        panel3.add(fechaDeEnvasado_lbl3);
        panel3.add(fechaDeEnvasado_txt3);
        panel3.add(paisDeOrigen_lbl3);
        panel3.add(paisDeOrigen_txt3);
        panel3.add(tempRecomendada_lbl3);
        panel3.add(tempRecomendada_txt3);
        panel3.add(metodoDeCongelacion_lbl);
        panel3.add(metodoDeCongelacion_txt);
        panel3.add(tiempoExpoNitrogeno_lbl);
        panel3.add(tiempoExpoNitrogeno_txt);
        panel3.add(areaDeTexto3);
        panel3.add(agregarProductoCongeladoPorNitrogeno_btn);
        panel3.add(mostrarRegPorNitrogeno);
        panel3.setLayout(null);
        panel3.setVisible(true);
        tabbedPane.addTab("Congelado por nitrogeno", panel3);
        this.add(tabbedPane);
        


    
}
}
