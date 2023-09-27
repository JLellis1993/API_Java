package br.com.julia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.julia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
