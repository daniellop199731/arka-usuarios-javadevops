package com.bancolombia.arka_usuarios_javadevops.usecases;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.adapters.mappers.PerfilMapper;
import com.bancolombia.arka_usuarios_javadevops.entities.Perfil;
import com.bancolombia.arka_usuarios_javadevops.entities.repositories.PerfilRepository;
import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.PerfilServiceRead;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseGenericObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerfilServiceReadImpl implements PerfilServiceRead {

    private final PerfilRepository perfilRepository;
    private final PerfilMapper perfilMapper;

    private static ResponseGenericObject<List<PerfilDTO>> rgObjetListDto;

    @Override
    public ResponseGenericObject<List<PerfilDTO>> obtenerPerfiles() {
        rgObjetListDto = new ResponseGenericObject<>();
        List<PerfilDTO> perfilesDto = perfilMapper.perfilesToPerfilesDTO((List<Perfil>) perfilRepository.findAll());
        if(perfilesDto.isEmpty()){
            rgObjetListDto.setAsNoSuccessfuly("No hay perfiles para mostrar");
        }
        rgObjetListDto.setAsSuccesfuly("Consulta ejecutada con exito", perfilesDto);
        return rgObjetListDto;
    }
}
