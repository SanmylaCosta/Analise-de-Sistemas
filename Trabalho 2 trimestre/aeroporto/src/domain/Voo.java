package domain;

import java.util.List;

public class Voo {
    private String prefixo;
    private String nome;
    private Integer limite;
    private List<Passagem>passagens;
    private List<Escala>escalas;
    private List<Aeroporto>aeroportos;
    
    public Voo(String prefixo, String nome, Integer limite, List<Passagem> passagens, List<Escala> escalas,
            List<Aeroporto> aeroportos) {
        this.prefixo = prefixo;
        this.nome = nome;
        this.limite = limite;
        this.passagens = passagens;
        this.escalas = escalas;
        this.aeroportos = aeroportos;
    }
    public String getPrefixo() {
        return prefixo;
    }
    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getLimite() {
        return limite;
    }
    public void setLimite(Integer limite) {
        this.limite = limite;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    public List<Escala> getEscalas() {
        return escalas;
    }
    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }
    public List<Aeroporto> getAeroportos() {
        return aeroportos;
    }
    public void setAeroportos(List<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }
    
    
}
