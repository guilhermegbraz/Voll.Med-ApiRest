package med.voll.api.configuration;

import med.voll.repositories.medico.JPAMedicoRepository;
import med.voll.usecases.medico.CadastroDeMedico;
import med.voll.usecases.validação.medico.ValidadorCadastroMedico;
import med.voll.usecases.validação.medico.ValidarEmailNotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
public class MedicoBeanConfiguration {

    JPAMedicoRepository medRep;

    public MedicoBeanConfiguration(JPAMedicoRepository medRepo) {
        this.medRep = medRepo;
    }

    @Bean
    public CadastroDeMedico cadastroDeMedico() {
        return new CadastroDeMedico(medRep,validadoresCadastroMedico());
    }


    public List<ValidadorCadastroMedico> validadoresCadastroMedico() {
        return List.of(new ValidarEmailNotNull());
    }
}
