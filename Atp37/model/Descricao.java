package Atp37.model;

public class Descricao extends Base{
    public String principal;
    public String acompanhamento;
    public double valor;
    public String dia_semana;

    @Override
    public String toString() {
        return super.toString() + "\nPrincipal: " + this.principal + "\nAcompanhamento: " + this.acompanhamento + "\nValor: R$ " + this.valor + "\nDia da Semana: " + this.dia_semana;
    }
}
