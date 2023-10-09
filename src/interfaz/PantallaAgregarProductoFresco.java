
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
import logica.ProductoFresco;

public class PantallaAgregarProductoFresco extends JFrame {

    AdministrarDatos administrarDatos;

    public PantallaAgregarProductoFresco() {
        iniciarComponentes();
        administrarDatos = new AdministrarDatos();
        administrarDatos.crearArrayList();
    }


    private void iniciarComponentes() {
        setTitle("Agregar Producto Fresco");
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


        JButton guardar_btn = new JButton("Guardar");
        guardar_btn.setBounds(10, 210, 100, 30);
        guardar_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombre_txt.getText();
                     String fechaDeCaducidad = fechaDeCaducidad_txt.getText();
                     int numLote = Integer.parseInt(numLote_txt.getText());
                     String fechaDeEnvasado = fechaDeEnvasado_txt.getText();
                     String paisDeOrigen = paisDeOrigen_txt.getText();
                     ProductoFresco productoFresco = new ProductoFresco(nombre, fechaDeCaducidad, numLote, fechaDeEnvasado, paisDeOrigen);
                     administrarDatos.insertarProducto(productoFresco);
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR Uno de los campos contiene un tipo de dato no valido o vacio  ");
                }

            }
        });

        JTextArea textArea = new JTextArea();
        textArea.setBounds(250, 10, 300, 500);
        textArea.setEditable(false);
        textArea.setVisible(true);


        JButton mostrar_btn = new JButton("Mostrar");
        mostrar_btn.setBounds(120, 210, 100, 30);
        mostrar_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "No hay datos para mostrar");
                }
                textArea.setText("");
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
        panel1.add(guardar_btn);
        panel1.add(mostrar_btn);
        panel1.add(textArea);
        panel1.setLayout(null);
        this.add(panel1);       
    
    
}
}
