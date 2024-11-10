package com.localropa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localropa.dto.ProductoDto;
import com.localropa.entity.Producto;
import com.localropa.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void agregarProducto(Producto producto) throws Exception {
        productoRepository.save(producto);
    }

	@Override
	public List<ProductoDto> listar() throws Exception {
		List<ProductoDto> productos = new ArrayList<ProductoDto>();
		
		productoRepository.findAll().forEach(x ->{
			ProductoDto unProductoDto = new ProductoDto();
			unProductoDto.setNombre(x.getNombre());
			unProductoDto.setDescripcion(x.getDescripcion());
			unProductoDto.setPrecio(x.getPrecio());
			productos.add(unProductoDto);
		});
		return productos;
	}
}
/*package com.localropa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.localropa.entity.Producto;
import com.localropa.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService{
	
	@Autowired 
	private ProductoRepository productoRepository;

	@Override
	public void agregarProducto(Producto producto) throws Exception {
		Optional<Producto> optProducto = this.productoRepository.findByNombre(producto.getNombre());
		//if(!optProducto.isEmpty()) {
		// new Exception("El producto no puede existir");
		//}
		productoRepository.save(producto);
	}
	
}*/
