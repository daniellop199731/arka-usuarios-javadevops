package com.bancolombia.arka_usuarios_javadevops.puertos;

import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilControladorDTO;
import com.bancolombia.arka_usuarios_javadevops.adapters.dtos.PerfilDTO;
import com.bancolombia.arka_usuarios_javadevops.adapters.mappers.PerfilMapper;
import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.PerfilServiceCreate;
import com.bancolombia.arka_usuarios_javadevops.usecases.interfaces.PerfilServiceRead;
import com.bancolombia.arka_usuarios_javadevops.utils.ResponseGenericObject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfiles")
@RequiredArgsConstructor
public class PerfilController {

    private final PerfilServiceRead perfilServiceRead;
    private final PerfilServiceCreate perfilServiceCreate;
    private final PerfilMapper perfilMapper;

    @GetMapping("")
    public ResponseEntity<ResponseGenericObject<List<PerfilControladorDTO>>> obtenerPerfiles(){
        ResponseGenericObject<List<PerfilDTO>> response = perfilServiceRead.obtenerPerfiles();
        if(response.isSuccessfuly()){
            return new ResponseEntity(response, HttpStatus.OK);
        }
        return new ResponseEntity(response, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/crearNuevo")
    public ResponseEntity<ResponseGenericObject<PerfilControladorDTO>> crearNuebo(@RequestBody PerfilDTO perfilDTO){
        ResponseGenericObject<PerfilDTO> response = perfilServiceCreate.crearNuevo(perfilDTO);
        if(response.isSuccessfuly()){
            ResponseGenericObject<PerfilControladorDTO> responseDTO = new ResponseGenericObject<>();
            responseDTO.setAsSuccesfuly(response.getMessage(), perfilMapper.perfilDTOToPerfilControladorDTO(response.getObj()));
            return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
