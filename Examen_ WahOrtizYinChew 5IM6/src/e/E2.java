/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Yin Wah
 */
public class E2 extends JFrame implements ActionListener {

    JTextField pantalla;
    double resultado;
    String operacion;
    boolean nuevaOperacion = true;
    JButton N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, Punto, Convertir, CE;

    /**
     * Constructor de la clase, se inicializan los metodos inicializarComponentes(), inicializarVentana();
     */

    public E2() {
        inicializarComponentes();
        inicializarVentana();
    }
    /**
     * En el metodo nicializarVentana() se configuran las propiedades de la ventana principal
     */
    public void inicializarVentana() {
        this.setTitle("Conversor de divisas");
        this.setSize(450, 370);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     /**
     * En el metodo inicializarComponentes() se inicializan los jtextfields, y los botones, ademas se les asigna el tamaño, posicion y action listener
     */
    public void inicializarComponentes() {
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setBounds(50, 20, 350, 40);
        pantalla.setVisible(true);
        pantalla.addActionListener(this);
        pantalla.setHorizontalAlignment(0);
        this.add(pantalla);

        N9 = new JButton("9");
        N9.setBounds(50, 80, 50, 50);
        N9.setVisible(true);
        N9.addActionListener(this);
        N9.setHorizontalAlignment(0);
        this.add(N9);

        N6 = new JButton("6");
        N6.setBounds(50, 140, 50, 50);
        N6.setVisible(true);
        N6.addActionListener(this);
        N6.setHorizontalAlignment(0);
        this.add(N6);

        N3 = new JButton("3");
        N3.setBounds(50, 200, 50, 50);
        N3.setVisible(true);
        N3.addActionListener(this);
        N3.setHorizontalAlignment(0);
        this.add(N3);

        N0 = new JButton("0");
        N0.setBounds(50, 260, 50, 50);
        N0.setVisible(true);
        N0.addActionListener(this);
        N0.setHorizontalAlignment(0);
        this.add(N0);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        N8 = new JButton("8");
        N8.setBounds(120, 80, 50, 50);
        N8.setVisible(true);
        N8.addActionListener(this);
        N8.setHorizontalAlignment(0);
        this.add(N8);

        N5 = new JButton("5");
        N5.setBounds(120, 140, 50, 50);
        N5.setVisible(true);
        N5.addActionListener(this);
        N5.setHorizontalAlignment(0);
        this.add(N5);

        N2 = new JButton("2");
        N2.setBounds(120, 200, 50, 50);
        N2.setVisible(true);
        N2.addActionListener(this);
        N2.setHorizontalAlignment(0);
        this.add(N2);

        Punto = new JButton(".");
        Punto.setBounds(120, 260, 50, 50);
        Punto.setVisible(true);
        Punto.addActionListener(this);
        Punto.setHorizontalAlignment(0);
        this.add(Punto);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        N7 = new JButton("7");
        N7.setBounds(190, 80, 50, 50);
        N7.setVisible(true);
        N7.addActionListener(this);
        N7.setHorizontalAlignment(0);
        this.add(N7);

        N4 = new JButton("4");
        N4.setBounds(190, 140, 50, 50);
        N4.setVisible(true);
        N4.addActionListener(this);
        N4.setHorizontalAlignment(0);
        this.add(N4);

        N1 = new JButton("1");
        N1.setBounds(190, 200, 50, 50);
        N1.setVisible(true);
        N1.addActionListener(this);
        N1.setHorizontalAlignment(0);
        this.add(N1);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        CE = new JButton("CE");
        CE.setBounds(260, 80, 140, 50);
        CE.setVisible(true);
        CE.addActionListener(this);
        CE.setHorizontalAlignment(0);
        this.add(CE);

        Convertir = new JButton("Convertir");
        Convertir.setBounds(260, 140, 140, 50);
        Convertir.setVisible(true);
        Convertir.addActionListener(this);
        Convertir.setHorizontalAlignment(0);
        this.add(Convertir);

    }

    private void numeroPulsado(String numerito) {
        if (pantalla.getText().equals("0") || nuevaOperacion) {
            pantalla.setText(numerito);
        } else {
            pantalla.setText(pantalla.getText() + numerito);
        }
        nuevaOperacion = false;
    }
    /**
     * En el metodo actionPerformed(ActionEvent e) recibe el valor de los botones pulsados y se colocan en en jtextfield, ademas estan las acciones de los botones "Convertir" que recibe el valor del jtextfield y lo divide 
     * entre 19 y el boton "CE" que limpia el jtextfield para que el usuario ingrese una nueva operacion
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String pant = "";

        if (e.getSource() == N1) {
            pantalla.setText("" + 1);
        } else if (e.getSource() == N2) {
            pantalla.setText(pantalla.getText() + 2);
        } else if (e.getSource() == N3) {
            pantalla.setText(pantalla.getText() + 3);
        } else if (e.getSource() == N4) {
            pantalla.setText(pantalla.getText() + 4);
        } else if (e.getSource() == N5) {
            pantalla.setText(pantalla.getText() + 5);
        } else if (e.getSource() == N6) {
            pantalla.setText(pantalla.getText() + 6);
        } else if (e.getSource() == N7) {
            pantalla.setText(pantalla.getText() + 7);
        } else if (e.getSource() == N8) {
            pantalla.setText(pantalla.getText() + 8);
        } else if (e.getSource() == N9) {
            pantalla.setText(pantalla.getText() + 9);
        } else if (e.getSource() == N0) {
            pantalla.setText(pantalla.getText() + 0);
        } else if (e.getSource() == Punto) {
            pantalla.setText(pantalla.getText() + ".");
        }

        if (e.getSource() == Convertir) {
            resultado = new Double(pantalla.getText()) / 19;
            pantalla.setText(String.valueOf(resultado + "dolares"));

        }
        if (e.getSource() == CE) {
            pantalla.setText("");
        }
    }

}
