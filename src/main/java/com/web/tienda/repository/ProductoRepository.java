package com.web.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.tienda.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

	
	
}
