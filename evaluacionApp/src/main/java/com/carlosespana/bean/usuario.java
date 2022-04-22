package com.carlosespana.bean;

public class usuario {
	private Long id;
	private String nombre;
	private int descuento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
		return "usuario [id=" + id + ", nombre=" + nombre + ", descuento=" + descuento + "]";
	}
}
