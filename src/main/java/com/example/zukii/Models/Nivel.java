package com.example.zukii.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="nivel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nivelId;

    @NotNull
    private Integer nivel;

    @NotNull
    private Integer experiencia;
}