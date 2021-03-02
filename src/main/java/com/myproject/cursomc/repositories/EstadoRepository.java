package com.myproject.cursomc.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}