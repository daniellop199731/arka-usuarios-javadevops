package com.bancolombia.arka_usuarios_javadevops.usecases.interfaces;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.entities.Perfil;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseGenericObject;

import java.util.List;

public interface PerfilServiceRead {

    ResponseGenericObject<List<PerfilDTO>> obtenerPerfiles();

}
