package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JFrame {

public PantallaPrincipal() {
        setTitle("Administrar alimentos");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        PantallaAgregarProductoFresco productosFresco = new PantallaAgregarProductoFresco();
        PantallaAgregarProductoRefrigerado productoRefrigerado = new PantallaAgregarProductoRefrigerado();
        PantallaAgregarProductoCongelado productoCongelado = new PantallaAgregarProductoCongelado();

        JPanel panel = new JPanel(new GridLayout(5, 1));

        JLabel titulo = new JLabel("Administrar alimentos");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        JButton agregarProductoFresco_btn = new JButton("Agregar Productos Frescos");
        agregarProductoFresco_btn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        agregarProductoFresco_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productosFresco.setVisible(true);
            }
        });
        JButton agregarProductoRefrigerado_btn = new JButton("Agregar Productos Refrigerados");
        agregarProductoRefrigerado_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productoRefrigerado.setVisible(true);
            }
        });
        JButton agregarProductoCongelado_btn = new JButton("Agregar Productos Congelados");
        agregarProductoCongelado_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productoCongelado.setVisible(true);
            }
        });

        panel.add(titulo);
        panel.add(agregarProductoFresco_btn);
        panel.add(agregarProductoRefrigerado_btn);
        panel.add(agregarProductoCongelado_btn);
        panel.setVisible(true);

        this.add(panel);
    
}

}

