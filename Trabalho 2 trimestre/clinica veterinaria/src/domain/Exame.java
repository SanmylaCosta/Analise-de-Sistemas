package domain;

import java.util.Date;
import java.util.List;

public class Exame {
    private Integer codigo;
    private List<Consulta>consultas;
    private Date dtExame;
    private String resultados;
    public Exame(Integer codigo, List<Consulta> consultas, Date dtExame, String resultados) {
        this.codigo = codigo;
        this.consultas = consultas;
        this.dtExame = dtExame;
        this.resultados = resultados;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public Date getDtExame() {
        return dtExame;
    }
    public void setDtExame(Date dtExame) {
        this.dtExame = dtExame;
    }
    public String getResultados() {
        return resultados;
    }
    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    
}
