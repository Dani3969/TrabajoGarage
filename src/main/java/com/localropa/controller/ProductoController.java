package com.localropa.controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localropa.dto.ProductoDto;
import com.localropa.service.ProductoService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	

	@Autowired
	private ProductoService productoService;
	
	@PostMapping(value = "/agregar", produces = {MediaType.APPLICATION_JSON_VALUE } , consumes = {MediaType.APPLICATION_JSON_VALUE }  )
	public ResponseEntity<?> agregar(@RequestBody ProductoDto productoDto) throws Exception{
		productoService.agregarProducto(productoDto.getEntity());	
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ProductoDto>> agregar() throws Exception{
		return new ResponseEntity<List<ProductoDto>>(productoService.listar(), HttpStatus.OK);
	}
}
