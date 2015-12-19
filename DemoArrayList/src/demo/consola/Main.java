//poner las opciones modificar y eliminar 
package demo.consola;

import java.util.ArrayList;
import java.util.Scanner;

import demo.entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		//objetos
	Cliente cl1 =new Cliente ("0923581060","joseph","vasquez", 19);
	Cliente cl2 =new Cliente ("0923581070","john","sanchez", 17);
	Cliente cl3 =new Cliente ("0923581080",",miguel","romero", 18);
	
	
	//encapsulo / esconde  el comportamiento de un arreglo, inserto datos sin especificar el tamaño
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	clientes.add(cl1);
	clientes.add(cl2);
	clientes.add(cl3);
	
	//obtener el valor y  la guardo en una variable 
	/*Cliente temp1= clientes.get(0);
	Cliente temp2= clientes.get(1);
	Cliente temp3= clientes.get(2);*/
	
	
	/*System.out.println(temp1);
	System.out.println(temp2);
	System.out.println(temp3);*/
	
	System.out.println("tamaño de clientes"+clientes.size());
	
	
	/*for (int i=0;i<clientes.size();i++){
		Cliente temp = clientes.get(i);
		System.out.println(temp);
	}*/
	int op=0;
	do {
		System.out.println("<1> ingresar cliente");
		System.out.println("<2> modificar cliente");
		System.out.println("<3> eliminar clientes");
		System.out.println("<4> mostrar clientes");
		System.out.println("<5> Salir");
		Scanner sc=new Scanner (System.in);
		System.out.println("leer opcion");
		op= sc.nextInt();
		
		switch(op){
		case 1:
			System.out.println("ingrese identificacion");
			String identificacion= sc.next();
			System.out.println("ingrese nombres");
			String nombres= sc.next();
			System.out.println("ingrese apellidos");
			String apellidos= sc.next();
			System.out.println("ingrese edad");
			int edad= sc.nextInt();
			
			
			Cliente cl=new Cliente (identificacion, nombres, apellidos, edad);
			clientes.add(cl);
			break;
		case 2:
			int num;
			
			System.out.println("ingrese la posicion que desea cambiar");
			num=sc.nextInt();
			for (int i=0;i<clientes.size();i++){
			
			if (i==num){
				System.out.println("ingrese identificacion");
				identificacion= sc.next();
				clientes.get(i).setIdentificaciones(identificacion);
				System.out.println("ingrese nombres");
				nombres= sc.next();
				clientes.get(i).setNombres(nombres);
				System.out.println("ingrese apellidos");
				apellidos= sc.next();
				clientes.get(i).setApellidos(apellidos);
				System.out.println("ingrese edad");
			    edad= sc.nextInt();
			    clientes.get(i).setEdad(edad);		
				
			}
			
			}
			break;
		case 3:
			
			System.out.println("ingrese indice a eliminar");
			int id= sc.nextInt();
			
			for (int i=0;i<clientes.size();i++){
				
				if (i==id){

               clientes.remove(i);
				}
				
			}
			break;
			  
		case 4:
			System.out.println("Lista de clientes");
			for (int i=0;i<clientes.size();i++){
				Cliente temp = clientes.get(i);
				System.out.println(temp);
			}
			break;
		}
		
	}while(op!=5);
	
	
	}

}
