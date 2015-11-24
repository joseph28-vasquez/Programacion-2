package ejer2;

public class Descuento {

	
	private double descuento;
	private double totalCompra;
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public Descuento (double descuentoParam, double totalCompraParam){
		this.descuento=descuentoParam;
		this.totalCompra=totalCompraParam;
	}
	public double getTotal(){
		double total=totalCompra*descuento;
		return total;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Descuento des1= new Descuento(0.1, 150 );
		des1.setTotalCompra(150);
		
		double total= des1.getTotal();
		
		
		System.out.println("Total Compra:"+total);
		System.out.println("Total Compra:"+des1.getTotal());

	}

}
