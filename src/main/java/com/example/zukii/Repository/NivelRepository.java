package com.example.zukii.Repository;

import com.example.zukii.Models.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel,Long> {
}