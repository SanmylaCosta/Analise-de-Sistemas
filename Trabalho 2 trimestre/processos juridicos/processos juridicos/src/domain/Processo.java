package domain;

import java.util.Date;
import java.util.List;

public class Processo {
    private String codigo;
    private Date dataAbertura;
    private Date dataConclusao;
    private List<Pessoa>pessoas;
    private Tribunal tribunal;
    private List<Audiencia>audiencias;
    public Processo(String codigo, Date dataAbertura, Date dataConclusao, List<Pessoa> pessoas, Tribunal tribunal, List<Audiencia>audiencias) {
        this.codigo = codigo;
        this.dataAbertura = dataAbertura;
        this.dataConclusao = dataConclusao;
        this.pessoas = pessoas;
        this.tribunal = tribunal;
        this.audiencias = audiencias;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Date getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public Date getDataConclusao() {
        return dataConclusao;
    }
    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public Tribunal getTribunal() {
        return tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }
    public List<Audiencia> getAudiencias() {
        return audiencias;
    }
    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }
    


}
