package com.localropa.dto;

import java.util.List;

public class CarritoDto {
	private Long userId;
    private List<ProductoDto> productos;
	
    public Long getUserId() {
		return userId;
	}
	public List<ProductoDto> getProductos() {
		return productos;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setProductos(List<ProductoDto> productos) {
		this.productos = productos;
	}
    
    
}
