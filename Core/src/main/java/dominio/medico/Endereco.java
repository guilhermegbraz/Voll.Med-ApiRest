package dominio.medico;

public class Endereco {

    private  String logradouro;
    private  String bairro;
    private  String CEP;
    private  String cidade;
    private  String UF;
    private  String numero;
    private String complemento;

    public Endereco(String logradouro, String bairro, String CEP, String cidade, String UF, String numero) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.UF = UF;
        this.numero = numero;
    }
}
