package operadores;

import java.util.Scanner;


public class Operadores {

   
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int a = 10;
        int b = 2;
        int c = 4;
        int d = 9;
        int e = 8;
        boolean status; //true or false
        char letra = 'a';
        float numero = (float) 3.14;
        double n1 = 3.14;
        String Palavra = "Uma palavra ou varias";
       // System.out.println("adição de A e B: "+(a+b));
       // System.out.println("Subtração de A e B: "+(a+b));
       // System.out.println("Multiplicação de A e B: "+(a+b));
        //System.out.println("Quociente de A e B: "+(a/b));
        //System.out.println("Modelo de A e B: "+(a%b));
        
        //Media
        System.out.println("A soma dos valores A+B+C+D+E : "+(a+b+c+d+e) );
        System.out.println("A Media dos Valores è: "+(+a+b+c+d+e)/(5));
        
     
       // n1 = n1 + 1;
       // n1++;
        //n1+= 2;
       // n1 = n1 - 1;
        //n1--;
        
        
        //verificar se o numero é impar
        System.out.println("Digite um Numero :");
        int verifica = scann.nextInt();
        
        if (verifica /2==0 ) {
            System.out.println("Numero par");
        }else {
        System.out.println("Numero Impar");
    }
    }
        
        
        
          
}
