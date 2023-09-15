package med.voll.api.paciente;

import med.voll.api.direccion.*;

public record DatosDeRegistroPaciente(
        String nombre,
        String mail,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
) {
}
