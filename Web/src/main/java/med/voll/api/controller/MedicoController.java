package med.voll.api.controller;


import med.voll.api.models.dto.MedicoDTO;
import med.voll.usecases.medico.CadastroDeMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    CadastroDeMedico cadastroDeMedico;


    @PostMapping
    public void Cadastrar(@RequestBody MedicoDTO jsonMedico) {
        cadastroDeMedico.cadastrar((jsonMedico.toMedico()));
        System.out.println(jsonMedico);
    }
}
