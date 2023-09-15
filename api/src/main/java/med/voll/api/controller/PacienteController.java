package med.voll.api.controller;

import med.voll.api.paciente.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @PostMapping
    public void registrarPaciente(@RequestBody DatosDeRegistroPaciente datosDeRegistroPaciente ){

        System.out.println("Datos recibidos: " + datosDeRegistroPaciente);
    }
}
