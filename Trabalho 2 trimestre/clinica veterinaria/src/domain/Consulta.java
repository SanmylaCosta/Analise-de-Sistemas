package domain;
import java.util.Date;
import java.util.List;

public class Consulta {
    private Integer codigo;
    private Date dtConsulta;
    private Veterinario veterinario;
    private String resumo;
    private Tratamento tratamento;
    private List<Exame>exames;


    public Consulta(Integer codigo, Date dtConsulta, Veterinario veterinario, String resumo, Tratamento tratamento, List<Exame>exames) {
        this.codigo = codigo;
        this.dtConsulta = dtConsulta;
        this.veterinario = veterinario;
        this.resumo = resumo;
        this.tratamento = tratamento;
        this.exames = exames;
    }


    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    public Date getDtConsulta() {
        return dtConsulta;
    }


    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }


    public Veterinario getVeterinario() {
        return veterinario;
    }


    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }


    public String getResumo() {
        return resumo;
    }


    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    public Tratamento getTratamento() {
        return tratamento;
    }


    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }


    public List<Exame> getExames() {
        return exames;
    }


    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    



    
}
