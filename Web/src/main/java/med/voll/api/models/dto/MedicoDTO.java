package med.voll.api.models.dto;

import entities.Email;
import entities.medico.Especialidade;
import entities.medico.Medico;

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
