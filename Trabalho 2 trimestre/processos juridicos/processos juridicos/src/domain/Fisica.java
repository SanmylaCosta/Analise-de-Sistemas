package domain;

public class Fisica extends Pessoa {
    private String cpf;

    

       public Fisica(Integer codigo, String nome, String email, String cpf) {
        super(codigo, nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
