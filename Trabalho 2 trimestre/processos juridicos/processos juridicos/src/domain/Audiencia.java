package domain;


import java.util.Date;

public class Audiencia {
    private Integer codigo;
    private Date data;
    private String recomendacao;
    private Processo processo;
    private Custos custos;
    public Audiencia(Integer codigo, Date data, String recomendacao, Processo processo, Custos custos) {
        this.codigo = codigo;
        this.data = data;
        this.recomendacao = recomendacao;
        this.processo = processo;
        this.custos = custos;
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
    public String getRecomendacao() {
        return recomendacao;
    }
    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }
    public Processo getProcesso() {
        return processo;
    }
    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
    public Custos getCustos() {
        return custos;
    }
    public void setCustos(Custos custos) {
        this.custos = custos;
    }

    
}
