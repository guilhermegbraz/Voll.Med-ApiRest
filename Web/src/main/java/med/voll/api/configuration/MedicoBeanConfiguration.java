package med.voll.api.configuration;

import med.voll.repositories.medico.JPAMedicoRepository;
import med.voll.usecases.medico.CadastroDeMedico;
import med.voll.usecases.validação.ValidadorCadastroMedico;
import med.voll.usecases.validação.ValidarEmailNotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MedicoBeanConfiguration {

    JPAMedicoRepository medRep;

    public MedicoBeanConfiguration() {
        this.medRep = new JPAMedicoRepository();
    }

    @Bean
    public CadastroDeMedico cadastroDeMedico() {
        return new CadastroDeMedico(medRep,validadoresCadastroMedico());
    }


    public List<ValidadorCadastroMedico> validadoresCadastroMedico() {
        return List.of(new ValidarEmailNotNull());
    }
}
