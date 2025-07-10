package med.voll.api.controller;

import med.voll.api.domain.direccion.DatosDireccion;
import med.voll.api.domain.direccion.Direccion;
import med.voll.api.domain.medico.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class MedicoControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JacksonTester<DatosRegistroMedico> datosRegistroMedicoJson;

    @Autowired
    private JacksonTester<DatosDetalleMedico> datosDetalleMedicoJson;

    @MockitoBean
    private MedicoRepository repository;

    @Test
    @DisplayName("Deberia devolver codigo http 400 cuand las informaciones son invalidas")
    @WithMockUser
    void registrar_escenario1() throws Exception{
        var response = mvc
                .perform(post("/medicos"))
                .andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @DisplayName("Deberia devolver codigo http 200 cuand las informaciones son validas")
    @WithMockUser
    void registrar_escenario2() throws Exception{
        var datosRegistro = new DatosRegistroMedico(
                "medico",
                "medico@voll.med",
                "123456789",
                "1234567",
                Especialidad.CARDIOLOGIA,
                datosDireccion());

        when(repository.save(any())).thenReturn(new Medico(datosRegistro));

        var response = mvc
                .perform(post("/medicos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(datosRegistroMedicoJson.write(datosRegistro).getJson()))
                .andReturn().getResponse();

        var datosDetalle = new DatosDetalleMedico(
                null,
                datosRegistro.nombre(),
                datosRegistro.email(),
                datosRegistro.documento(),
                datosRegistro.telefono(),
                datosRegistro.especialidad(),
                new Direccion(datosRegistro.direccion())
        );

        var jsonEsperado = datosDetalleMedicoJson.write(datosDetalle).getJson();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
        assertThat(response.getContentAsString()).isEqualTo(jsonEsperado);
    }

    private DatosDireccion datosDireccion(){
        return new DatosDireccion(
                "calle ejemplo",
                "89",
                "complemento",
                "barrio bravo",
                "cancun",
                "7755",
                "CUliacan"
        );
    }
}
