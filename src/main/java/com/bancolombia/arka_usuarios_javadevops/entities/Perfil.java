package com.bancolombia.arka_usuarios_javadevops.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perfiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {

    @Id
    @NotNull(message = "Debe proporcionar un id unico al perfil")
    @Positive(message = "El id unico debe ser mayor a cero")
    private int idPerfil;

    @NotNull(message = "Debe proporcionar un nombre al perfil")
    @NotBlank(message = "Debe proporcionar un nombre al perfil")
    private String nombrePerfil;
}
