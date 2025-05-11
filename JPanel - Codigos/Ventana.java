package jlabel.en.un.jpanel;

import javax.swing.*;
import java.awt.*;

class Ventana extends JFrame {  // Now extends JFrame
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    public Ventana() {
        // Basic window configuration
        setTitle("Ventana con Paneles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        iniciarPaneles();
        iniciarEtiquetas();
    }

    protected void iniciarPaneles() {
        JPanel contenedor = new JPanel();
        getContentPane().add(contenedor);
        contenedor.setBackground(Color.RED);
    
        // Initialize panels
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
    
        contenedor.add(this.panel1);
        contenedor.add(this.panel2);
        contenedor.add(this.panel3);
    
        this.panel1.setBackground(new Color(0, 51, 102));  // Dark blue
        this.panel2.setBackground(new Color(0, 102, 255));  // Light blue
        this.panel3.setBackground(new Color(255, 0, 255));  // Magenta
    
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
    }

    protected void iniciarEtiquetas() {
        JLabel e1 = new JLabel("<html>Hola Humano soy la etiqueta1</html>");
        JLabel e2 = new JLabel("<html>Hola Humano soy la etiqueta2</html>");
        JLabel e3 = new JLabel("<html>Hola Humano soy la etiqueta3</html>");

        this.panel1.add(e1);
        this.panel2.add(e2);
        this.panel3.add(e3);

        e1.setForeground(Color.WHITE);
        e2.setForeground(Color.WHITE);
        e3.setForeground(Color.WHITE);

        this.panel1.setLayout(null);
        this.panel2.setLayout(null);
        this.panel3.setLayout(null);

        e1.setBounds(10, 100, 200, 60);
        e2.setBounds(10, 100, 200, 60);
        e3.setBounds(10, 100, 200, 60);

        e1.setText("<html>Hola<br>boolean#h@n</html>");
        this.panel2.setVisible(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}