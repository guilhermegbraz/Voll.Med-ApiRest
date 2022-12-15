package med.voll.api.models.dto;

import med.voll.entities.Endereco;

public record EnderecoDTO(String logradouro, String bairro, String CEP,
                          String cidade, String UF, String numero, String complemento) {
    public Endereco toEndereco(){
        Endereco endereco = new Endereco(
                this.logradouro(),
                this.bairro(),
                this.CEP(),
                this.cidade(),
                this.UF,
                this.numero);
        endereco.setComplemento(this.complemento);
        return endereco;

    }
}
