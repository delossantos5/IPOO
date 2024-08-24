package menuTurno;
import menuPrincipal.PantallaPrincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PantallaTurnos {
    private JFrame ventana1;
    private JPanel panel1;
    private JPanel botonPanel;
    private JButton altaTurno;
    private JButton BajaTurno;
    private JButton modificacionTurno;
    private JButton listadoDeTurno;
    private JButton menuPrincipal;
    private PantallaPrincipal pantallaPrincipal; // Referencia a PantallaPrincipal


    public PantallaTurnos(){
        iniciar1();
    }

    public void iniciar1(){
        ventana1= new JFrame("clínica Salud+");
        ventana1.setSize(new Dimension(800,800));
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel(new GridLayout(1,5));
        botonPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        altaTurno = new JButton("Alta de turnos");
        modificacionTurno = new JButton(" Modificación turnos");
        BajaTurno = new JButton("Baja de turnos");
        listadoDeTurno= new JButton("Listado de turnos");
        menuPrincipal = new JButton("Menu principal");
        agregarComponentes1();
        registrarComponentes1();
        ventana1.getContentPane().add(panel1, BorderLayout.CENTER);
        ventana1.pack();
        ventana1.setVisible(true);
    }
    private void agregarComponentes1(){
        botonPanel.add(altaTurno);
        botonPanel.add(modificacionTurno);
        botonPanel.add(BajaTurno);
        botonPanel.add(listadoDeTurno);
        botonPanel.add(menuPrincipal);
        panel1.add(botonPanel, BorderLayout.CENTER);
    }
    private void registrarComponentes1(){
        altaTurno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Alta de turnos seleccionado");
            }
        });
        modificacionTurno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Modificación de turnos seleccionado");
            }
        });
        BajaTurno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Baja de turnos seleccionado");
            }
        });
        listadoDeTurno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Listado de turnos seleccionado");
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

