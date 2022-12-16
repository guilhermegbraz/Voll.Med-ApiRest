package med.voll.usecases.validação.medico;

import med.voll.entities.BusinessException;
import med.voll.entities.medico.Medico;

public class ValidarNomeNotNull implements ValidadorCadastroMedico{
    @Override
    public void validar(Medico medico) {
        if(medico.getNome().isBlank() || medico.getNome() == null)
            throw new BusinessException("O atributo nome é de preenchimento obrigatorio");
    }
}
