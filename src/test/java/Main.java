import com.mysql.cj.xdevapi.SessionFactory;
import domain.Persona.Persona;
import domain.Persona.PersonaFisica;
import domain.Persona.PersonaJuridica;
import repository.Dao;
import repository.DaoRepositorio;

import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {

        DaoRepositorio dao = new DaoRepositorio(PersonaFisica.class);
        PersonaFisica x = new PersonaFisica();
        dao.agregar(x);





    }
}
