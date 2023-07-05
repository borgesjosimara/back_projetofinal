package com.esmalteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esmalteria.app.entity.Servico;



@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
