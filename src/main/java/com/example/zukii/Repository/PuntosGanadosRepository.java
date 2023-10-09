package com.example.zukii.Repository;

import com.example.zukii.Models.PuntosGanados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntosGanadosRepository extends JpaRepository<PuntosGanados, Long> {

}