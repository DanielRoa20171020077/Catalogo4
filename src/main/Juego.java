
package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Juego extends JFrame implements ActionListener{
    
    private final JButton b1 = new JButton("Generar mapa");
    private final JButton b2 = new JButton("Ingresar elfo");
    private final JButton b3 = new JButton("Ingresar Humano");
    private final JButton b4 = new JButton("Ingresar Orco");
    private final JButton b5 = new JButton("Atacar");
    
    private final JTextField elfos=new JTextField("");
    private final JTextField humanos=new JTextField("");
    private final JTextField orco=new JTextField("");
    private final JTextField textoX=new JTextField();
    private final JTextField textoY=new JTextField();
    
    private final JLabel posX = new JLabel("posicion X:");
    private final JLabel posY = new JLabel("posicion Y:");
    
    CampoBatalla campo = new CampoBatalla();
    Archivos fu = new Archivos();
    String[][] matriz;
    
    public Juego(){
        
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(new Color(37,119,25));
        
        b1.setBackground(Color.MAGENTA);
        b1.setBounds(1100, 100, 170, 30);
        b1.addActionListener(this);
        b2.setBackground(Color.ORANGE);
        b2.setBounds(1100, 400, 170, 30);
        b2.addActionListener(this);
        b3.setBackground(Color.ORANGE);
        b3.setBounds(1100, 450, 170, 30);
        b3.addActionListener(this);
        b4.setBackground(Color.ORANGE);
        b4.setBounds(1100, 500, 170, 30);
        b4.addActionListener(this);
        b5.setBackground(Color.RED);
        b5.setBounds(1100, 560, 170, 30);
        b5.addActionListener(this);
        
        posX.setBounds(1100, 330, 100, 20);
        posY.setBounds(1100, 370, 100, 20);
        
        elfos.setBounds(1100, 250, 170, 20);
        humanos.setBounds(1100, 275, 170, 20);
        orco.setBounds(1100, 300, 170, 20);
        
        textoX.setBounds(1170, 330, 20, 20);
        textoY.setBounds(1170, 370, 20, 20);
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(posX);
        c.add(posY);
        c.add(elfos);
        c.add(humanos);
        c.add(orco);
        c.add(textoX);
        c.add(textoY);
        
        iniciarComponentes();
        
    }
    
    public void iniciarComponentes(){
        String archivo = fu.archivoAleatorio("../archivos");
        
        System.out.println(archivo);
        
        matriz = fu.fileToMatriz("../archivos/" + archivo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(campo);
        pack();
        setBounds(0, 0, 1350, 730);
        campo.iniciarCampo(matriz);
        campo.setBounds(0, 0, 1300, 730);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
         
            System.out.println("boton_1");
            
        } else if(e.getSource()==b2){
        
            System.out.println("boton_2");
            
        } else if(e.getSource()==b3){
        
            System.out.println("boton_3");
            
        } else if(e.getSource()==b4){
        
            System.out.println("boton_4");
            
        } else if(e.getSource()==b5){
        
            System.out.println("boton_5");
            
        }
        
    }
    
}
