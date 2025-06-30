package com.example.project1.repository;

import com.example.project1.model.Courseregistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courseregistryrepo extends JpaRepository<Courseregistry,Integer> {
}
