package com.localropa.service;

import java.util.List;

import com.localropa.dto.ProductoDto;
import com.localropa.entity.*;
public interface ProductoService {
	
public void agregarProducto(Producto producto) throws Exception;

public List<ProductoDto> listar() throws Exception;
}
