package com.autolasa.entidades;

public class Vehiculo {
	   private String matricula;
	   private String marca;
	   private String modelo;
	   private String color;
	   private int anio;
	 
	  public Vehiculo(){  
	  }
	  
	  public Vehiculo(String matricula, String marca, String modelo,String color,int anio) {
			super();
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.anio = anio;
		}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", color=" + color + ", anio=" + anio
				+ "]";
	}
 
	  
	  
}
 

