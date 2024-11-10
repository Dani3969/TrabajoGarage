package com.localropa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localropa.entity.Carrito;
import com.localropa.service.CarritoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping("/productos")
    public List<Carrito> obtenerProductos() {
        return carritoService.obtenerProductos();
    }

    @PostMapping("/agregar")
    public Carrito agregarProducto(@RequestBody Carrito item) {
        return carritoService.agregarProducto(item);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable int id) {
        carritoService.eliminarProducto(id);
    }
}



