package com.localropa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.localropa.entity.Producto;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByNombre(String nombre);
}

/*package com.localropa.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.localropa.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer>{

	Optional<Producto> findByNombre(String nombre);
	
}*/
