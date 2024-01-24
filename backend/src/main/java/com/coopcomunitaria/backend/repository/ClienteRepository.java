package com.coopcomunitaria.backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coopcomunitaria.backend.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{

   

}
