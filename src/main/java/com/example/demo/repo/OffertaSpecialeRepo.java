package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.OffertaSpeciale;

@Repository
public interface OffertaSpecialeRepo extends JpaRepository<OffertaSpeciale, Integer> {

}
