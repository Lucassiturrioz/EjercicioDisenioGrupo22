package repository.AtributeConverter;

import domain.Comunicacion.Email;
import domain.Comunicacion.MedioDeComunicacion;
import domain.Comunicacion.Telegram;
import domain.Comunicacion.Whatsapp;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MedioDeComunicacionAtributeConverter  implements AttributeConverter<MedioDeComunicacion,String> {

    @Override
    public String convertToDatabaseColumn (MedioDeComunicacion medioDeComunicacion){
        String nombreMedioDeComunicacion = null;

        switch (medioDeComunicacion.getClass().getSimpleName()){
            case "MedioNotificacionWpp" : nombreMedioDeComunicacion = "wpp"; break;
            case "MedioNotificacionCorreo" : nombreMedioDeComunicacion = "correo"; break;
            case "MedioNotificacionTelegram" : nombreMedioDeComunicacion = "telegram"; break;

        }
        
        return nombreMedioDeComunicacion;
    }

    @Override
    public MedioDeComunicacion convertToEntityAttribute(String dato) {
        MedioDeComunicacion medio = null;

        if (dato == "wpp") {
            medio = new Whatsapp();
        }
        if (dato == "correo") {
            medio = new Email();
        }
        if (dato == "telegram") {
            medio = new Telegram();
        }

        return medio;
    }



}







