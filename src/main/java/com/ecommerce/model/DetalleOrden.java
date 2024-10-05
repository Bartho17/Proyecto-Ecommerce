package com.ecommerce.model;

public class DetalleOrden {
	private int id;
	private String nombre;
	private int cantidad;
	private double precio;
	private double total;
	public DetalleOrden(int id, String nombre, int cantidad, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public DetalleOrden() {
		super();
	}
	
	
	
}
