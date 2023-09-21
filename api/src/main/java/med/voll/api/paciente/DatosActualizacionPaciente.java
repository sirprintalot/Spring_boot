package med.voll.api.paciente;

import jakarta.validation.constraints.*;
import med.voll.api.direccion.*;

public record DatosActualizacionPaciente(@NotNull Long id, String nombre, String documento,
                                         String telefono, String email, DatosDireccion direccion) {
}
