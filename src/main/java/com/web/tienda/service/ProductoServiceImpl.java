package com.web.tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.tienda.model.Producto;
import com.web.tienda.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	
	@Autowired
	private ProductoRepository productoRepository;
	

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(producto);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}
	
	

}
