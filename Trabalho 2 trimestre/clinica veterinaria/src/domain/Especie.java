package domain;

import java.util.List;

public class Especie {
    private Integer codigo;
    private String nome;
    private List<Animal>animal;

    public Especie(Integer codigo, String nome, List<Animal>animal){
        this.codigo = codigo;
        this.nome = nome;
        this.animal = animal;
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

    public List<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }

    
}
