package med.voll.api.models.dto;

import dominio.medico.Especialidade;

public record MedicoDTO(String nome, String email, String CRM, Especialidade especialidade, EnderecoDTO endereco) {
}
