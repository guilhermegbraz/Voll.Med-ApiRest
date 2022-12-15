package med.voll.repositories.medico;

import med.voll.entities.medico.Medico;
import med.voll.entities.medico.MedicoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
public class JPAMedicoRepository implements MedicoRepository {

    //@Transactional
    @Override
    public void cadastrar(Medico novoMedico) {
        System.out.println("Salvei o medico no banco de dados");
    }
}
