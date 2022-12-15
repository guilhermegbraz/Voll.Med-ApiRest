package med.voll.api.models.dto;

import med.voll.entities.Email;
import med.voll.entities.medico.Especialidade;
import med.voll.entities.medico.Medico;

public record MedicoDTO(String nome, String email, String CRM,
                        Especialidade especialidade, EnderecoDTO endereco) {
    public Medico toMedico() {
        return new
                Medico(this.nome,
                new Email(this.email),
                this.CRM,
                this.especialidade,
                endereco.toEndereco());
    }
}
