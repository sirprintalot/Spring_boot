package med.voll.api.medico;

import jakarta.validation.constraints.*;
import med.voll.api.direccion.*;

public record DatosActualizacionMedico(@NotNull Long id, String nombre, String documento, DatosDireccion direccion) {
    
}
