package com.ecommerce.model;

import java.util.Date;

public class Orden {
	private int id;
	private String numero;
	private Date fechaPedido;
	private Date fechaEntrega;
	private double total;
	public Orden(int id, String numero, Date fechaPedido, Date fechaEntrega, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.total = total;
	}
	public Orden() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaPedido=" + fechaPedido + ", fechaEntrega="
				+ fechaEntrega + ", total=" + total + "]";
	}
	
	
}
