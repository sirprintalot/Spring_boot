package med.voll.api.medico;

import med.voll.api.direccion.*;

public record DatosDeRegistroMedico(String nombre, String mail, String documento, Especialidad especialidad,
                                    DatosDireccion direccion) {

    
}
