package domain;

public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(Integer codigo, String nome, String email, String cnpj) {
        super(codigo, nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
