package domain;

import java.util.List;

public class Escritorio {
    private Integer codigo;
    private List<Pessoa>pessoas;

    public Escritorio(Integer codigo, List<Pessoa>pessoas){
        this.codigo = codigo;
        this.pessoas = pessoas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
}
