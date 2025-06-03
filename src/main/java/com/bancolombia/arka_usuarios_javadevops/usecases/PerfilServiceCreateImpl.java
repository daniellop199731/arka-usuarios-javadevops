package com.bancolombia.arka_usuarios_javadevops.usecases;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.adapters.mappers.PerfilMapper;
import com.bancolombia.arka_usuarios_javadevops.entities.Perfil;
import com.bancolombia.arka_usuarios_javadevops.entities.repositories.PerfilRepository;
import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.PerfilServiceCreate;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseGenericObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PerfilServiceCreateImpl implements PerfilServiceCreate {

    private final PerfilRepository perfilRepository;
    private final PerfilMapper perfilMapper;

    private static ResponseGenericObject<PerfilDTO> rgObjDto;

    @Override
    public ResponseGenericObject<PerfilDTO> crearNuevo(PerfilDTO perfilDTO) {
        rgObjDto = new ResponseGenericObject<>();
        Perfil perfil = perfilMapper.perfilDTOToPerfil(perfilDTO);
        if(perfil != null){
            perfil = perfilRepository.save(perfil);
            rgObjDto.setAsSuccesfuly("Perfil creado con exito", perfilMapper.PerfilToPerfilDTO(perfil));
            return rgObjDto;
        }
        rgObjDto.setAsNoSuccessfuly("Error al crear el nuevo perfil");
        return rgObjDto;
    }
}
