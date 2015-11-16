
package Ejercicio;
import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
     Scanner teclado=new Scanner (System.in);
     int cant,suma=0,i=1,n;
     float p=0;
     
     System.out.println("ingrese cantidad del grupo:");
     cant=teclado.nextInt();
     
     while (i<=cant){
    	 do{
    	 System.out.println("ingrese nota:");
    	 n=teclado.nextInt();
    	 }while(!(n>=0 &n<=10));
    	 suma=suma+n;
         p=suma/cant;
         
         i=i+1;
     }
     System.out.println("promedio de calificaciones:"+p);
	}
	

}
