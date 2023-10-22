package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import ventana.Conversor;

/**
 * Clase que representa una ventana de una aplicación de conversión de monedas.
 */
public class Pantalla1 {
    private JFrame ventana;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel botonPanel;
    private JComboBox moneda_origen1;
    private JTextField importe_origen1;

    private JComboBox moneda_destino1;
    private JTextField importe_destino1;

    private JButton convertir;
    private JButton limpiarButton;
    private JButton recargarButton;
    private JLabel moneda_origen;
    private JLabel importe_origen;
    private JLabel moneda_destino;
    private JLabel importeConvetido;
    private JLabel cartel1;

    /**
     * Constructor de la clase Pantalla1 que inicializa la ventana y configura los componentes.
     */
    public Pantalla1() {
        iniciar();
    }

    /**
     * Inicializa la ventana y configura los componentes.
     */
    private void iniciar() {
        ventana = new JFrame("Conversor de monedas");
        ventana.setSize(new Dimension(200, 200));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel(new GridLayout(4, 2)); //GridLayout organizará los componentes en el JPanel en una cuadrícula de 4 filas y 1 columna.
        panel2 = new JPanel(new GridLayout(2, 4));
        botonPanel = new JPanel(new GridLayout(1, 3));
        agregarComponentes();
        registrarComponentes();
        ventana.getRootPane().setDefaultButton(convertir);
        ventana.getContentPane().add(panel1, BorderLayout.CENTER);
        recargar();
        ventana.pack();// la ventana se ajusta automáticamente para que sea lo suficientemente grande como para mostrar todos los componentes en su interior de manera adecuada
        ventana.setVisible(true);
    }

    /**
     * Agrega los componentes a la ventana y configura su disposición.
     */

    private void agregarComponentes() {
        importe_origen1 = new JTextField();
        importe_destino1 = new JTextField();
        importe_destino1.setEditable(false);

        moneda_destino1 = new JComboBox();
        moneda_origen1 = new JComboBox();
        panel2.add(new JLabel("Moneda: "));
        panel2.add(moneda_origen1);
        panel2.add(new JLabel("Moneda destino: "));
        panel2.add(moneda_destino1);

        convertir = new JButton("Convertir");
        limpiarButton = new JButton("Limpiar");
        recargarButton = new JButton("Recargar");
        botonPanel.add(convertir);
        botonPanel.add(limpiarButton);
        botonPanel.add(recargarButton);
        panel1.add(importe_origen1);
        panel1.add(panel2);
        panel1.add(importe_destino1);
        panel1.add(botonPanel);
    }

    /**
     * Registra los controladores de eventos para los botones.
     */
    private void registrarComponentes() {
        convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertir();
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

        recargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recargar();
            }
        });
    }

    /**
     * Realiza la conversión de monedas según las tasas de cambio seleccionadas por el usuario.
     */
    private void convertir() {
        Conversor conversor = new Conversor();
        try {
            // Obtén el valor ingresado por el usuario como una cadena
            String valorIngresado = importe_origen1.getText();

            // Intenta convertir la cadena a un valor numérico
            double cantidad = 0;
            try {
                cantidad = Double.parseDouble(valorIngresado);
            } catch (NumberFormatException ex) {
                throw new NoEsNumeroException(0); // Lanza la excepción si no es un número
            }

            Moneda m1 = (Moneda) moneda_origen1.getSelectedItem();
            Moneda m2 = (Moneda) moneda_destino1.getSelectedItem();

            if (m1 != Moneda.PESO) {
                double c = conversor.convertirAMonedaExtranjera(m1, (float) cantidad, m2);
                importe_destino1.setText(String.valueOf(c));
            } else {
                double c = conversor.convertirPesos(m1, (float) cantidad, m2);
                importe_destino1.setText(String.valueOf(c));
            }
        } catch (NoEsNumeroException e) {
            mostrarExcepcionEnPanel(e);
        }


    }

    /**
     * Recarga las listas desplegables de monedas.
     */
    private void recargar() {
        DefaultComboBoxModel list = new DefaultComboBoxModel();
        DefaultComboBoxModel list2 = new DefaultComboBoxModel();
        list.addElement(Moneda.DOLAR_BLUE);
        list.addElement(Moneda.EURO);
        list.addElement(Moneda.REAL);
        list.addElement(Moneda.PESO);
        list2.addElement(Moneda.DOLAR_BLUE);
        list2.addElement(Moneda.EURO);
        list2.addElement(Moneda.REAL);
        list2.addElement(Moneda.PESO);
        moneda_origen1.setModel(list);
        moneda_destino1.setModel(list2);
    }

    /**
     * Limpia los campos de entrada y salida.
     */
    private void limpiar() {
        importe_origen1.setText("");
        importe_destino1.setText("");
    }

    /**
     * Muestra una ventana emergente con el mensaje de excepción.
     *
     * @param e La excepción que se mostrará en la ventana emergente.
     */
    private void mostrarExcepcionEnPanel(NoEsNumeroException e) {
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText(e.getMessage());
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        panel.add(textArea);

        JOptionPane.showMessageDialog(ventana, panel, "Excepción", JOptionPane.ERROR_MESSAGE);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:d:grow,left:4dlu:noGrow,fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:max(d;4px):noGrow", "center:d:noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow"));
        final JSeparator separator1 = new JSeparator();
        CellConstraints cc = new CellConstraints();
        panel1.add(separator1, cc.xy(1, 2, CellConstraints.FILL, CellConstraints.FILL));
        moneda_origen = new JLabel();
        moneda_origen.setText("Moneda:");
        panel1.add(moneda_origen, cc.xy(1, 3));
        importe_origen = new JLabel();
        importe_origen.setText("Importe");
        panel1.add(importe_origen, cc.xy(1, 5));
        moneda_destino = new JLabel();
        moneda_destino.setText("Moneda:");
        panel1.add(moneda_destino, cc.xy(1, 7));
        importeConvetido = new JLabel();
        importeConvetido.setText("Importe comberido");
        panel1.add(importeConvetido, cc.xy(1, 9));
        convertir = new JButton();
        convertir.setText("Convertir");
        panel1.add(convertir, cc.xy(1, 11));
        limpiarButton = new JButton();
        limpiarButton.setText("Limpiar");
        panel1.add(limpiarButton, cc.xy(3, 11));
        importe_destino1 = new JTextField();
        panel1.add(importe_destino1, cc.xy(3, 9, CellConstraints.FILL, CellConstraints.DEFAULT));
        moneda_destino1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Dolar");
        defaultComboBoxModel1.addElement("Euro");
        defaultComboBoxModel1.addElement("Real");
        defaultComboBoxModel1.addElement("Peso");
        moneda_destino1.setModel(defaultComboBoxModel1);
        panel1.add(moneda_destino1, cc.xy(3, 7));
        importe_origen1 = new JTextField();
        panel1.add(importe_origen1, cc.xy(3, 5, CellConstraints.FILL, CellConstraints.DEFAULT));
        moneda_origen1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Dolar");
        defaultComboBoxModel2.addElement("Euro");
        defaultComboBoxModel2.addElement("Real");
        defaultComboBoxModel2.addElement("Peso");
        moneda_origen1.setModel(defaultComboBoxModel2);
        panel1.add(moneda_origen1, cc.xy(3, 3));
        recargarButton = new JButton();
        recargarButton.setText("Recargar");
        panel1.add(recargarButton, cc.xy(5, 11));
        cartel1 = new JLabel();
        cartel1.setText("Conversor de monedas");
        panel1.add(cartel1, cc.xy(3, 1));
        moneda_origen.setLabelFor(moneda_origen1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}