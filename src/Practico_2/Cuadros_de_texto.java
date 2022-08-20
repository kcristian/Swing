/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author INTEL
 */
public class Cuadros_de_texto {
    
    public static void main(String[] args){
        MarcoTexto mimarco=new MarcoTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setTitle("Prueba Text Field");
        
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setBounds(600,300,600,350);
        LaminaTexto milamina=new LaminaTexto();
        add(milamina);
        setVisible(true);;
    }
}

class LaminaTexto extends JPanel{
    
    public LaminaTexto(){
        
        setLayout(new BorderLayout());
        JPanel milamina2=new JPanel();
        milamina2.setLayout(new FlowLayout());
        
        resultado=new JLabel("",JLabel.CENTER);
        
        JLabel texto1=new JLabel("email: ");
        milamina2.add(texto1);
        campo1=new JTextField(20);
        milamina2.add(campo1);
        add(resultado,BorderLayout.CENTER);
        
        JButton miboton=new JButton("captura");
        DameTexto mievento=new DameTexto();
        miboton.addActionListener(mievento);
        milamina2.add(miboton);
        
        add(milamina2,BorderLayout.NORTH);
    }
    
    private class DameTexto implements ActionListener{
           

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            int correcto=0;
            String email=campo1.getText().trim();
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    correcto++;
                }
            }
            
            if(correcto!=1){
                resultado.setText("email Incorrecto");
            }else{
                resultado.setText("email Correcto");
            }
            System.out.println(campo1.getText().trim());
            campo1.setText("");
        }
    }
    private JTextField campo1;
    private JLabel resultado;
}
