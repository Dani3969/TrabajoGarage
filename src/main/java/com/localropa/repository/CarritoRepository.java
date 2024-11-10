package com.localropa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.localropa.entity.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
    Optional<Carrito> findByProductoId(int id);
    Optional<Carrito> deleteById(int id);


}

