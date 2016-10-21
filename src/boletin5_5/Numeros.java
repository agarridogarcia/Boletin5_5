
package boletin5_5;


public class Numeros {
    private int num1, num2, num3;
   //constructores
    public Numeros (){
        num1=0;
        num2=0;
        num3=0;
    }
    public Numeros(int n1, int n2, int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public void amosar(int n1, int n2, int n3){
        if (n1>n2&&n1>n3)
            System.out.println("El número " + n1 + " es el mayor");
        else if (n2>n1&&n2>n3)
            System.out.println("El número " + n2 + " es el mayor");
        else 
            System.out.println("El número " + n3 + " es el mayor");
    }
    
}
