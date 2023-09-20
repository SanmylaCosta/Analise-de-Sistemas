package domain;

import java.util.Date;
import java.util.List;

public class Escala {
    private Integer codigo;
    private Date dtHoraPartida;
    private Date dtHoraChegada;
    private String poltrona;
    private List<Voo>voos;
    public Escala(Integer codigo, Date dtHoraPartida, Date dtHoraChegada, String poltrona, List<Voo> voos) {
        this.codigo = codigo;
        this.dtHoraPartida = dtHoraPartida;
        this.dtHoraChegada = dtHoraChegada;
        this.poltrona = poltrona;
        this.voos = voos;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Date getDtHoraPartida() {
        return dtHoraPartida;
    }
    public void setDtHoraPartida(Date dtHoraPartida) {
        this.dtHoraPartida = dtHoraPartida;
    }
    public Date getDtHoraChegada() {
        return dtHoraChegada;
    }
    public void setDtHoraChegada(Date dtHoraChegada) {
        this.dtHoraChegada = dtHoraChegada;
    }
    public String getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    public List<Voo> getVoos() {
        return voos;
    }
    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    
}
