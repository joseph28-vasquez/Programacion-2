package Ejercicio;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio_3 {


	public static void main(String[] args) {
		int n=0,op;
		float suma1=0,suma2=0,c=0,suma3=0,t1=0,t2 = 0,t3=0,t=0,sb=0,d=0;
		Scanner teclado = new Scanner (System.in);
				
		ArrayList<Float> clientes= new ArrayList<Float> ();

		do{	
		System.out.println("ingrese el total de su compra:");
		c=teclado.nextInt();
		do{
		System.out.println("elija un color de bolita:");
		System.out.println("1.-bolita roja");
		System.out.println("2.-bolita amarilla");
		System.out.println("3.-bolita blanca");
		
		op=teclado.nextInt();
		}while(!(op>0&op<4));
		switch(op){
		
		case 1:
			System.out.println("obtuvo un descuento del 40%:");
			sb=(c*40)/100;
			d=c-sb;
			System.out.println("el descuento de su compra es:"+d);
		 if(d!=0){
			 clientes.add(d);
		 }
			System.out.println("desea seguir utilizando el sistema");
			System.out.println("1.-Si");
			System.out.println("2.-No");
			n=teclado.nextInt();	
			suma1=d+0;
			t1=suma1;
			break;
		case 2:
			System.out.println("obtuvo un descuento del 25%:");
			d=(c*25)/100;
			d=c-sb;
			if(d!=0){
				 clientes.add(d);
			 }
			System.out.println("el descuento de su compra es:"+d);
			System.out.println("desea seguir utilizando el sistema");
			System.out.println("1.-Si");
			System.out.println("2.-No");
			n=teclado.nextInt();
			suma2=d+0;
			t2=suma2;
			break;
		case 3:
			System.out.println("no obtuvo descuento:");
			d=c;
			System.out.println("su valor a pagar es:"+d);
			if(d!=0){
				 clientes.add(d);
			 }
			System.out.println("desea seguir utilizando el sistema");
			System.out.println("1.-Si");
			System.out.println("2.-No");
			n=teclado.nextInt();	
			suma3=d+0;
		     t3=suma3;
			break;	
		} 
		}while(n==1);
		t=t1+t2+t3;
		
				if(n==2){
					System.out.println("valores de los clientes: ");
					System.out.println(clientes);
					
					System.out.println(""+t);
		}
	}

}
