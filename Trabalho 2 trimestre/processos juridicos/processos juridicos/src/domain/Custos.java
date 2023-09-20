package domain;

import java.util.Date;

public class Custos {
    private Integer codigo;
    private Date data;
    private Double valor;
    private String descricao;
    private Audiencia audiencia;
    public Custos(Integer codigo, Date data, Double valor, String descricao, Audiencia audiencia) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.audiencia = audiencia;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Audiencia getAudiencia() {
        return audiencia;
    }
    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }

    
}
