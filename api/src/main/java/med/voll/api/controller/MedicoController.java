package med.voll.api.controller;

import jakarta.validation.*;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosDeRegistroMedico datosDeRegistroMedico) {

        medicoRepository.save(new Medico(datosDeRegistroMedico));

    }
}
