package com.localropa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localropa.entity.Carrito;
import com.localropa.repository.CarritoRepository;

@Service
public class CarritoServiceImp implements CarritoService {

	@Autowired
    private CarritoRepository carritoRepository;
	
	@Override
	public List<Carrito> obtenerProductos() {
		return carritoRepository.findAll();
	}

	@Override
	public Carrito agregarProducto(Carrito item) {
		Optional<Carrito> itemExistente = carritoRepository.findByProductoId(item.getProducto().getId());
        if (itemExistente.isPresent()) {
            Carrito existente = itemExistente.get();
            existente.setCantidad(existente.getCantidad() + item.getCantidad());
            return carritoRepository.save(existente);
        } else {
            return carritoRepository.save(item);
        }
	}

	@Override
	public void eliminarProducto(int id) {
		carritoRepository.deleteById(id);
	}


	
}
