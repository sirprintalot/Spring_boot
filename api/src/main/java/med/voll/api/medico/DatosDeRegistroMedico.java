package med.voll.api.medico;

import jakarta.validation.*;
import jakarta.validation.constraints.*;
import med.voll.api.direccion.*;

public record DatosDeRegistroMedico(@NotBlank
                                    String nombre,

                                    @NotBlank
                                    @Email
                                    String email,

                                    @NotNull
                                    @Pattern(regexp = "\\d{4,6}")
                                    String documento,

                                    @NotNull 
                                    Especialidad especialidad,

                                    @NotNull
                                    @Valid
                                    DatosDireccion direccion) {

}
