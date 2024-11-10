package com.localropa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.localropa.entity.Producto;

import lombok.Data;

@Data
public class ProductoDto {

	private String nombre;
	private String descripcion;
	private int precio;
	
	public ProductoDto() {
	}

	public ProductoDto(String nombre, String descripcion, int precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@JsonIgnore
	public Producto getEntity() {
		return new Producto(nombre, descripcion, precio);
	}
	
	public Producto toEntity() {
		return new Producto(getNombre(),getDescripcion(),getPrecio());
	}
}
