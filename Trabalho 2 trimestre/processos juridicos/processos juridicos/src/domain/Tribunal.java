package domain;

import java.util.List;

public class Tribunal {
    private Integer codigo;
    private String nome;
    private List<Processo>processos;
    private List<Vara>varas;
    public Tribunal(Integer codigo, String nome, List<Processo> processos, List<Vara> varas) {
        this.codigo = codigo;
        this.nome = nome;
        this.processos = processos;
        this.varas = varas;
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
    public List<Processo> getProcessos() {
        return processos;
    }
    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    public List<Vara> getVaras() {
        return varas;
    }
    public void setVaras(List<Vara> varas) {
        this.varas = varas;
    }

    
}
