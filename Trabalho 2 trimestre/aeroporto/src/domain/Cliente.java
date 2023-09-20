package domain;

public class Cliente {
    private  String cpf;
    private String nome;
    private String email;
    private Passagem passagem;
    public Cliente(String cpf, String nome, String email, Passagem passagem) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.passagem = passagem;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Passagem getPassagem() {
        return passagem;
    }
    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
    
}
