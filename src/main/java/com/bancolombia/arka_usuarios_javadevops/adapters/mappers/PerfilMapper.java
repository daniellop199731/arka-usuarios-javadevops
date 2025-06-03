package com.bancolombia.arka_usuarios_javadevops.adapters.mappers;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilControladorDTO;
import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.entities.Perfil;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PerfilMapper {

    @Mapping(source = "id", target = "idPerfil")
    @Mapping(source = "nombre", target = "nombrePerfil")
    Perfil perfilControladorDTOToPerfil(PerfilControladorDTO perfilControladorDTO);

    @Mapping(source = "idPerfil", target = "id")
    @Mapping(source = "nombrePerfil", target = "nombre")
    PerfilControladorDTO PerfilToPerfilControladorDTO(Perfil perfil);

    @Mapping(source = "id", target = "idPerfil")
    @Mapping(source = "nombre", target = "nombrePerfil")
    Perfil perfilDTOToPerfil(PerfilDTO perfilDTO);

    @Mapping(source = "idPerfil", target = "id")
    @Mapping(source = "nombrePerfil", target = "nombre")
    PerfilDTO PerfilToPerfilDTO(Perfil perfil);

    PerfilDTO perfilControladorDTOToPerfilDTO(PerfilControladorDTO perfilControladorDTO);

    PerfilControladorDTO perfilDTOToPerfilControladorDTO(PerfilDTO perfilDTO);

    @Mapping(source = "idPerfil", target = "id")
    @Mapping(source = "nombrePerfil", target = "nombre")
    List<PerfilDTO> perfilesToPerfilesDTO(List<Perfil> perfiles);

    List<PerfilControladorDTO> perfilDTOToPerfilControladorDTO(List<PerfilDTO> perfilDTO);
}
