package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import logica.ProductoRefrijerado;


public class PantallaAgregarProductoRefrigerado extends JFrame {

    AdministrarDatos administrarDatos;

    public PantallaAgregarProductoRefrigerado() {
        iniciarComponentes();
        administrarDatos = new AdministrarDatos();
        administrarDatos.crearArrayList();
    }


    private void iniciarComponentes() {
        setTitle("Agregar Producto Refrigerado");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel panel1 = new JPanel();

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
        JLabel codigoOrganismoSupAl_lbl = new JLabel("Codigo de organismo de supervicion alimentaria: ");
        codigoOrganismoSupAl_lbl.setBounds(10, 210, 100, 30);
        JTextField codigoOrganismoSupAl_txt = new JTextField();
        codigoOrganismoSupAl_txt.setBounds(120, 210, 100, 30);
        JLabel tempRecomendada_lbl = new JLabel("Temperatura recomendada: ");
        tempRecomendada_lbl.setBounds(10, 250, 100, 30);
        JTextField tempRecomendada_txt = new JTextField();
        tempRecomendada_txt.setBounds(120, 250, 100, 30);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(250, 10, 300, 500);
        textArea.setEditable(false);
        textArea.setVisible(true);


        JButton guardar1_btn = new JButton("Guardar");
        guardar1_btn.setBounds(10, 290, 100, 30);
        guardar1_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String nombre = nombre_txt.getText();
                String fechaDeCaducidad = fechaDeCaducidad_txt.getText();
                int numLote = Integer.parseInt(numLote_txt.getText());
                String fechaDeEnvasado = fechaDeEnvasado_txt.getText();
                String paisDeOrigen = paisDeOrigen_txt.getText();
                int codigoOrganismoSupAl = Integer.parseInt(codigoOrganismoSupAl_txt.getText());
                float tempRecomendada = Float.parseFloat(tempRecomendada_txt.getText());
                

                ProductoRefrijerado productoRefrijerado = new ProductoRefrijerado(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen, codigoOrganismoSupAl, tempRecomendada);
                administrarDatos.insertarProducto(productoRefrijerado);
                JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
}

        });

        // BOTON PARA MOSTRAR LOS REGISTROS
        JButton mostrarRegistros_btn = new JButton("Mostrar registros");
        mostrarRegistros_btn.setBounds(10, 330, 100, 30);
        mostrarRegistros_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(administrarDatos.mostrarProductos());
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
        panel1.add(codigoOrganismoSupAl_lbl);
        panel1.add(codigoOrganismoSupAl_txt);
        panel1.add(tempRecomendada_lbl);
        panel1.add(tempRecomendada_txt);
        panel1.add(guardar1_btn);
        panel1.add(mostrarRegistros_btn);
        panel1.add(textArea);
        panel1.setLayout(null);
        panel1.setVisible(true);
        

        this.add(panel1);


    }
}
