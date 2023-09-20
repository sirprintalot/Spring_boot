package med.voll.api.controller;

import jakarta.transaction.*;
import jakarta.validation.*;
import med.voll.api.paciente.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.data.web.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void registrarPaciente(@RequestBody @Valid DatosRegistroPaciente datos ){

        pacienteRepository.save(new Paciente(datos));
    }

    @GetMapping
    public Page<DatosListadoPaciente> listarPacientes(@PageableDefault(size=8, sort={"nombre"})Pageable paginacion){
        return pacienteRepository.findAll(paginacion).map(DatosListadoPaciente::new);
    }
}
