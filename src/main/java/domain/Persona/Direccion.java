package domain.Persona;

import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.persistence.Transient;

@Setter
@Embeddable
public class Direccion {

    @Transient
    private int altura;
    @Transient
    private String calle;
    @Transient
    private String localidadBarrio;
    private String municipioComuna;
    private String provincia;

    public String leyendaCompleta(){
        return null;
    }



}
