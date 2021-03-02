

package com.myproject.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
