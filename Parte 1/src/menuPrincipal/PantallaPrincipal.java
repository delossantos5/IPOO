package menuPrincipal;
import menuEspecialidadMedica.PantallaEspecialidadMedica;
import  menuPaciente.PantallaPacientes;
import menuTurno.PantallaTurnos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaPrincipal {
    private JFrame ventana;
    private JPanel panel1;
    private JPanel botonPanel;
    private JButton administrarEspecialidadesMedicasButton;
    private JButton administrarPacientesButton;
    private JButton administrarTurnosButton;
    private JButton salirButton;

    public PantallaPrincipal(){
        iniciar();
    }
    public void iniciar(){
        ventana= new JFrame("clínica Salud+");
        ventana.setSize(new Dimension(1000,1000));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel(new GridLayout(1,4));
        botonPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        administrarPacientesButton = new JButton("Administrar Pacientes");
        administrarTurnosButton = new JButton("Administrar Turnos");
        administrarEspecialidadesMedicasButton = new JButton("Administrar Especialidades Médicas");
        salirButton = new JButton("Salir");
        agregarComponentes();
        registrarComponentes();
        ventana.getContentPane().add(panel1, BorderLayout.CENTER);
        ventana.pack();
        ventana.setVisible(true);
    }
    private void agregarComponentes(){
        botonPanel.add(administrarPacientesButton);
        botonPanel.add(administrarTurnosButton);
        botonPanel.add(administrarEspecialidadesMedicasButton);
        botonPanel.add(salirButton);
        panel1.add(botonPanel, BorderLayout.CENTER);
    }
    private void registrarComponentes(){
        administrarPacientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new PantallaPacientes();
            }
        });
        administrarTurnosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PantallaTurnos();
            }
        });
        administrarEspecialidadesMedicasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PantallaEspecialidadMedica();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarPrograma();
            }
        });
    }
    public void cerrarPrograma() {
        System.exit(0);
    }
}
