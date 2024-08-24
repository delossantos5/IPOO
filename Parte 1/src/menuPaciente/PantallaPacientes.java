package menuPaciente;
import menuPrincipal.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPacientes {
    private JFrame ventana1;
    private JPanel panel1;
    private JPanel botonPanel;
    private JButton altaPaciente;
    private JButton bajaPacientes;
    private JButton modificacionPaciente;
    private JButton listadoDePacientes;
    private JButton menuPrincipal;
    private PantallaPrincipal pantallaPrincipal; // Referencia a PantallaPrincipal


    public PantallaPacientes(){
        iniciar1();
    }

    public void iniciar1(){
        ventana1= new JFrame("clínica Salud+");
        ventana1.setSize(new Dimension(800,800));
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel(new GridLayout(1,5));
        botonPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        altaPaciente = new JButton("Alta de pacientes");
        modificacionPaciente = new JButton(" Modificación de pacientes");
        bajaPacientes = new JButton("Baja de pacientes");
        listadoDePacientes= new JButton("Listado de pacientes");
        menuPrincipal = new JButton("Menu principal");
        agregarComponentes1();
        registrarComponentes1();
        ventana1.getContentPane().add(panel1, BorderLayout.CENTER);
        ventana1.pack();
        ventana1.setVisible(true);
    }
    private void agregarComponentes1(){
        botonPanel.add(altaPaciente);
        botonPanel.add(modificacionPaciente);
        botonPanel.add(bajaPacientes);
        botonPanel.add(listadoDePacientes);
        botonPanel.add(menuPrincipal);
        panel1.add(botonPanel, BorderLayout.CENTER);
    }
    private void registrarComponentes1(){
        altaPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"alta de pacientes seleccionado");
            }
        });
        modificacionPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"modificación de pacientes seleccionado");
            }
        });
        bajaPacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Baja de pacientes seleccionado");
            }
        });
        listadoDePacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Listado de pacientes seleccionado");
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

