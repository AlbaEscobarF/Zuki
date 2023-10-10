package com.example.zukii.Repository;

import com.example.zukii.Models.ConfNivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfNivelRepository extends JpaRepository<ConfNivel, Long> {
}
