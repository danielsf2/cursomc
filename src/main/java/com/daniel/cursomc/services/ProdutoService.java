package com.daniel.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.cursomc.domain.Produto;
import com.daniel.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public Produto find(Integer id) {
		return produtoRepository.findById(id).get();
	}
	
}//class ProdutoService 
