package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.EnderecoEntity;


public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Integer> {

	List<EnderecoEntity> findByClientId(Integer id);

}
