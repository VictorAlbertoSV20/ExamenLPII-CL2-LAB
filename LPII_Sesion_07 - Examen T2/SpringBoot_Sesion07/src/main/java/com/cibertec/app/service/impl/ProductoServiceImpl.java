package com.cibertec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Producto;
import com.cibertec.app.repository.ProductoRepository;
import com.cibertec.app.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	ProductoRepository productoRepository;
    
	@Override
	public Producto saveProducto(Producto userEntity) {
		// TODO Auto-generated method stub
		return productoRepository.save(userEntity);
	}

	@Override
	public List<Producto> getAllProducto() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Producto updateProducto(Producto userEntity) {
		// TODO Auto-generated method stub
		return productoRepository.save(userEntity);
	}

	@Override
	public void deleteProductoById(Integer idProd) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(idProd);
	}

	@Override
	public Producto findProductoById(Integer idProd) {
		// TODO Auto-generated method stub
		return productoRepository.findById(idProd).get();
	}
}
