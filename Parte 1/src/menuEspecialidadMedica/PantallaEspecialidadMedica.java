package menuEspecialidadMedica;
import menuPrincipal.PantallaPrincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaEspecialidadMedica {
    private JFrame ventana1;
    private JPanel panel1;
    private JPanel botonPanel;
    private JButton altaEspecialidad;
    private JButton bajaEspecialidad;
    private JButton modificacionEspecialidad;
    private JButton listadoDeEspecialidad;
    private JButton menuPrincipal;
    private PantallaPrincipal pantallaPrincipal; // Referencia a PantallaPrincipal


    public PantallaEspecialidadMedica(){
        iniciar1();
    }

    public void iniciar1(){
        ventana1= new JFrame("clínica Salud+");
        ventana1.setSize(new Dimension(800,800));
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel(new GridLayout(1,5));
        botonPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        altaEspecialidad = new JButton("Alta de especialidades medicas");
        modificacionEspecialidad = new JButton(" Modificación especialidades medicas");
        bajaEspecialidad = new JButton("Baja de especilidades medicas");
        listadoDeEspecialidad= new JButton("Listado de especialidad medica");
        menuPrincipal = new JButton("Menu principal");
        agregarComponentes1();
        registrarComponentes1();
        ventana1.getContentPane().add(panel1, BorderLayout.CENTER);
        ventana1.pack();
        ventana1.setVisible(true);
    }
    private void agregarComponentes1(){
        botonPanel.add(altaEspecialidad);
        botonPanel.add(modificacionEspecialidad);
        botonPanel.add(bajaEspecialidad);
        botonPanel.add(listadoDeEspecialidad);
        botonPanel.add(menuPrincipal);
        panel1.add(botonPanel, BorderLayout.CENTER);
    }
    private void registrarComponentes1(){
        altaEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Alta de especialidades medicas seleccionado");
            }
        });
        modificacionEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Modificación de especialidades medicas seleccionado");
            }
        });
        bajaEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Baja de especialidades medicas seleccionado");
            }
        });
        listadoDeEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Listado de especialidades medicas seleccionado");
            }
        });
        menuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana1.dispose(); // Cierra la ventana actual
            }
        });
    }
}

