package domain;

import java.util.List;

public class Pessoa {
    private Integer codigo;
    private String nome;
    private String email;
    private Escritorio escritorio;
    private List<Processo>processos;

    public Pessoa(Integer codigo, String nome, String email, Escritorio escritorio, List<Processo>processos) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.escritorio = escritorio;
        this.processos = processos;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
    public Escritorio getEscritorio() {
        return escritorio;
    }
    public void setEcritorio(Escritorio escritorio) {
        this.escritorio = escritorio;
    }
    public List<Processo> getProcessos() {
        return processos;
    }
    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    
}
