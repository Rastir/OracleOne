package med.voll.api.domain.consulta.validaciones.reserva;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoConOtraConsultaEnElMismoHorario implements ValidadorDeConsultas {

    @Autowired
    private ConsultaRepository repository;

    public void validar (DatosReservaConsulta datos){
        var medicoTieneOtraConsultaEnElMismoHorario = repository.existsByMedicoIdAndFechaAndMotivoCancelamientoIsNull(datos.idMedico(), datos.fecha());
        if(medicoTieneOtraConsultaEnElMismoHorario){
            throw new ValidacionException("El medico no cuenta con disponibilidad en el horario seleccionado");
        }
    }
}
