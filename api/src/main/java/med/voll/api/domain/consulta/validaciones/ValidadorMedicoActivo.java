package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoActivo implements ValidadorDeConsultas {
    @Autowired
    private MedicoRepository repository;

    public void validar (DatosReservaConsulta datos){

        //Se comprueba que no se haya seleccionado un medico null
        if(datos.idMedico() == null){
            return;
        }
        var medicoEstaActivo = repository.findActivoById(datos.idMedico());
        if(!medicoEstaActivo){
            throw new ValidacionException("Consulta no puede ser agendada por un medico inactivo");
        }
    }
}
