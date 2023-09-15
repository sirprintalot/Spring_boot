package med.voll.api.controller;

import med.voll.api.medico.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void registrarMedico(@RequestBody DatosDeRegistroMedico datosDeRegistroMedico) { 

        System.out.println(datosDeRegistroMedico);


    }
}
