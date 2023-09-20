package domain.Persona;

import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Entity
@Table(name = "Persona_Fisica")
public class PersonaFisica extends Persona{


    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String nombre;
    private String telefono;

    public PersonaFisica(){

    }


    public String emailPreferido(){
        return null;
    }

    public String numeroPreferido(){
        return null;
    }

    @Override
    public String nombre(){
        return " ";
    }
}
