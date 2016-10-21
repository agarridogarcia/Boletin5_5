
package boletin5_5;

import javax.swing.JOptionPane;


public class Boletin5_5 {

   
    public static void main(String[] args) {
        Numeros numero=new Numeros();
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
         int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
          int n3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
          numero.amosar(n1, n2, n3);
                
    
}}
