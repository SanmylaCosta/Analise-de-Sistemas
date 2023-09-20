package domain;

public class Vara {
    private Integer codigo;
    private String nome;
    private Tribunal tribunal;
    private Processo processo;
    public Vara(Integer codigo, String nome, Tribunal tribunal, Processo processo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tribunal = tribunal;
        this.processo = processo;
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
    public Tribunal getTribunal() {
        return tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }
    public Processo getProcesso() {
        return processo;
    }
    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    
}
