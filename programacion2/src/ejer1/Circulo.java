package ejer1;

public class Circulo {

	private double radio;
	
	public Circulo(){
		this.radio=1;
	}
    public Circulo(double radioParam){
		
		this.radio=radioParam;
    }
    
    
    public void getRadio(double radioParam){
		this.radio=radioParam;
	}
    public double getRadio(){
		return this.radio;
	}
	
	
	public double getArea(){
		return Math.PI*radio*radio;
	}
	
	
	
	
	
	
	public static void main (String[] args){
		
	
		Circulo cir1= new Circulo();
		//cir1.getRadio(10);
		double result=cir1.getRadio();
		
		System.out.println("Area cir1:"+cir1.getArea());
		
	}
		
	
	
}
