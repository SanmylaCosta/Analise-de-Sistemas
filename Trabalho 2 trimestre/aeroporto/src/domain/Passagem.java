package domain;

public class Passagem {
    private String codigo;
    private Double valor;
    private Cliente cliente;
    private Voo voo;
    public Passagem(String codigo, Double valor, Cliente cliente, Voo voo) {
        this.codigo = codigo;
        this.valor = valor;
        this.cliente = cliente;
        this.voo = voo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
}
