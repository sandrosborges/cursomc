package com.myproject.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
