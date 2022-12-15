package usecases.medico;

import entities.medico.Medico;
import entities.medico.MedicoRepository;
import usecases.medico.validação.ValidadorCadastroMedico;

import java.util.List;

public class CadastroDeMedico {

    MedicoRepository repositorio;
    List<ValidadorCadastroMedico> validacoes;

    public CadastroDeMedico(MedicoRepository medicoRepository, List<ValidadorCadastroMedico> v) {
        this.repositorio = medicoRepository;
        this.validacoes = v;
    }

    public void cadastrar(Medico novoMedico) {
        this.validacoes.forEach(validacao -> validacao.validar(novoMedico));
        this.repositorio.cadastrar(novoMedico);
    }

}
