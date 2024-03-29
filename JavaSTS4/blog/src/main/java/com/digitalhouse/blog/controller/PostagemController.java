package com.digitalhouse.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalhouse.blog.model.Postagem;
import com.digitalhouse.blog.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")

public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
		@GetMapping("/{id}")
		public ResponseEntity<Postagem> GetById(@PathVariable Long id ){
			//Expressão lambda
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
		
		@GetMapping("/titulo/{titulo}") //Mapping para a pagina /postagens/titulo/[einsirapesquisaaqui]
		public ResponseEntity <List<Postagem>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		}
		
		@GetMapping("/texto/{texto}") //Mapping para a pagina /postagens/texto/[einsirapesquisaaqui]
		public ResponseEntity<List<Postagem>> getByTexto(@PathVariable String texto) {
		return ResponseEntity.ok(repository.findAllByTextoContainingIgnoreCase(texto));

		}
		
		@PostMapping //Mapping para posting
		public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		}

		@PutMapping //Mapping para update
		public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		}

		@DeleteMapping("/{id}") //Mapping para deletar pelo ID
		public void delete(@PathVariable Long id){
		repository.deleteById(id);
		}
}
