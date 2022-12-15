package med.voll.usecases.validação;

import med.voll.entities.BusinessException;
import med.voll.entities.medico.Medico;

public class ValidarEmailNotNull implements ValidadorCadastroMedico{

    @Override
    public void validar(Medico medico) {
       if (medico.getEmail().getEndereco() == null ||
               medico.getEmail().getEndereco().isBlank()) throw new BusinessException("Email must not be blank");
    }
}
