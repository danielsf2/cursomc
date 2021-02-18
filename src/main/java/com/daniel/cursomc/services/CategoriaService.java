package com.daniel.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.cursomc.domain.Categoria;
import com.daniel.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {		
		try {
			return categoriaRepository.findById(id).get();	
		}
		catch (Exception e) {
			return new Categoria(null, "");
		}
		
	}//buscar
	
}//class CategoriaService 
