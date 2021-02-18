package com.daniel.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		return ResponseEntity.ok().body(produtoService.find(id));
	}//find
	
}//class ProdutoResource 
