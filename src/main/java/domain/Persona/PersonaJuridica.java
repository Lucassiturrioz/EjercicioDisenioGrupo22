package domain.Persona;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "Persona_Juridica")
public class PersonaJuridica extends Persona{

    @ElementCollection
    @CollectionTable(name = "Emails_De_Contacto", joinColumns = @JoinColumn(name = "persona_id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;
    private LocalDate fechaConstitucion;
    private String razonSocial;
    @ElementCollection
    @CollectionTable(name = "telefonos_de_contacto", joinColumns = @JoinColumn(name = "persona_id"))
    @Column(name = "telefonos")
    private List<String> telefonosDeContacto;

    public PersonaJuridica(){

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
