package med.voll.usecases.medico;

import med.voll.entities.medico.Medico;
import med.voll.entities.medico.MedicoRepository;
import med.voll.usecases.validação.ValidadorCadastroMedico;

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
