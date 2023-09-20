package domain.Persona;

import domain.Comunicacion.MedioDeComunicacion;
import repository.AtributeConverter.MedioDeComunicacionAtributeConverter;

import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Persona(){

    }
    private String cuitCuil;
    @Embedded
    private Direccion direccion;

    @Convert(converter = MedioDeComunicacionAtributeConverter.class)
    @Column(name = "MedioDeComunicacion")
    private MedioDeComunicacion medioPreferido;

    public String nombre(){
        return null;
    }


}
