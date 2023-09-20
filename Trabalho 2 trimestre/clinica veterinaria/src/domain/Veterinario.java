package domain;

import java.util.List;

public class Veterinario {
    private Integer codigo;
    private String nome;
    private String cmv;
    private String telefone;
    private List<Consulta>consultas;
    public Veterinario(Integer codigo, String nome, String cmv, String telefone, List<Consulta> consultas) {
        this.codigo = codigo;
        this.nome = nome;
        this.cmv = cmv;
        this.telefone = telefone;
        this.consultas = consultas;
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
    public String getCmv() {
        return cmv;
    }
    public void setCmv(String cmv) {
        this.cmv = cmv;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    
    
}
