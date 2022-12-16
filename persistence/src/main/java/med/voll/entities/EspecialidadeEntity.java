package med.voll.entities;

import med.voll.entities.medico.Especialidade;

import javax.persistence.*;

@Entity(name = "Especialidade")
@Table(name = "especialidade")
public class EspecialidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Especialidade esp;

    public EspecialidadeEntity(Especialidade esp) {
        this.esp = esp;
    }
}
