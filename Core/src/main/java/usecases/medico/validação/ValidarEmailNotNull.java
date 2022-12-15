package usecases.medico.validação;

import entities.BusinessException;
import entities.medico.Medico;

public class ValidarEmailNotNull implements ValidadorCadastroMedico{

    @Override
    public void validar(Medico medico) {
       if (medico.getEmail().getEndereco() == null ||
               medico.getEmail().getEndereco().isBlank()) throw new BusinessException("Email must not be blank");
    }
}
