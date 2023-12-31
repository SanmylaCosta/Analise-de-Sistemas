package domain;

import java.util.List;

public class Cliente {
    private Integer codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Animal> animal;

    //construtores
    public Cliente(Integer codigo, String nome, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        //this.animal = animal;
    }

    //gets e seters
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
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public List<Animal> getAnimal() {
        return animal;
    }
    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    } 
    
    
}
