package med.voll.api.paciente;

import jakarta.validation.*;
import jakarta.validation.constraints.*;
import med.voll.api.direccion.*;

public record DatosRegistroPaciente(

        @NotBlank
        String nombre,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{6,8}")
        String telefono,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String documento,


        @NotNull
        @Valid
        DatosDireccion direccion)
 {

}
