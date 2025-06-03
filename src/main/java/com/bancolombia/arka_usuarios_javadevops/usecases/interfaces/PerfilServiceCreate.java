package com.bancolombia.arka_usuarios_javadevops.usecases.interfaces;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseGenericObject;

public interface PerfilServiceCreate {

    ResponseGenericObject<PerfilDTO> crearNuevo(PerfilDTO perfilDTO);
}
