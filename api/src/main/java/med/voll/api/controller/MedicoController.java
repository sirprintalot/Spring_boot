package med.voll.api.controller;

import jakarta.transaction.*;
import jakarta.validation.*;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.data.web.*;
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

    @GetMapping
    public Page<DatosListadoMedico> listadoMedicos(@PageableDefault(size=9) Pageable paginacion){
//        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);listar todos los medicos
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid DatosActualizacionMedico datosActualizacionMedico){
        Medico medico = medicoRepository.getReferenceById(datosActualizacionMedico.id());
        medico.actualizarDatos(datosActualizacionMedico);
        
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medico.desactivarMedico();
    }








//    @DeleteMapping("/{id}")  hard delete from database
//    @Transactional
//    public void eliminarMedico(@PathVariable Long id){
//
//        Medico medico = medicoRepository.getReferenceById(id);
//        medicoRepository.delete(medico);
//
//    }
}
