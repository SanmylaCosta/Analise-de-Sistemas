package domain;

import java.util.List;

public class Aeroporto {
    private Integer codigo;
    private String nome;
    private String localizacao;
    private List<Voo>voos;
    private List<Escala>escalas;
    private Cidade cidade;
    public Aeroporto(Integer codigo, String nome, String localizacao, List<Voo> voos, List<Escala> escalas,
            Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = voos;
        this.escalas = escalas;
        this.cidade = cidade;
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
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public List<Voo> getVoos() {
        return voos;
    }
    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    public List<Escala> getEscalas() {
        return escalas;
    }
    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

}
