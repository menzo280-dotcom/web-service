package com.example.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservice.entities.Product;
import com.example.webservice.entities.User;
import com.example.webservice.repositories.ProductRepository;
import com.example.webservice.repositories.UserRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional <Product> obj = repository.findById(Id);
		return obj.get();
	}

}
