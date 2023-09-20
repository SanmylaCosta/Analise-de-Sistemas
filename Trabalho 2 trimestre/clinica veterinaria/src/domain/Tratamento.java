package domain;
import java.util.List;


public class Tratamento {
    private Integer codigo;
    private Animal animal;
    private String descricaoSintomas;
    private List<Consulta>consultas;

    public Tratamento(Integer codigo, Animal animal, String descricaoSintomas, List<Consulta>consultas) {
        this.codigo = codigo;
        this.animal = animal;
        this.descricaoSintomas = descricaoSintomas;
        this.consultas = consultas;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public String getDescricaoSintomas() {
        return descricaoSintomas;
    }
    public void setDescricaoSintomas(String descricaoSintomas) {
        this.descricaoSintomas = descricaoSintomas;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }


    
}
