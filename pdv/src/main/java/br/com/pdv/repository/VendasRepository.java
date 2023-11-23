package br.com.pdv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidades.VendasEntidade;

@Repository
public interface VendasRepository extends JpaRepository<VendasEntidade, Long>{

}
