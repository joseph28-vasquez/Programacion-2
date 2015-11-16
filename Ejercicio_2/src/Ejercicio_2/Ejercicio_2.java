package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner (System.in);
			int ind=0,acum=0,n;
			float i;
			
			for (ind=0;ind<50;ind++){
				do{
				System.out.println("ingrese calificaciones :");
				System.out.println("nota:");
				n=teclado.nextInt();
				}while(!(n>=0 &n<=100));
				if (n<70){	
						acum=acum+1;					
				}
			
			}
	         
			System.out.println("estudiandes reprobados:"+acum);
              i=(acum*100)/50;
              System.out.println("porcentaje de los estudiandes reprobados:"+i+"%");
	}

}
