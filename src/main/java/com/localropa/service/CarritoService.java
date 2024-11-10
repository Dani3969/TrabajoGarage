package com.localropa.service;

import java.util.List;

import com.localropa.entity.Carrito;

public interface CarritoService {
    List<Carrito> obtenerProductos();
    Carrito agregarProducto(Carrito item);
    void eliminarProducto(int id);
}

