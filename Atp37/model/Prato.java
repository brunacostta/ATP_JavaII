package Atp37.model;

public class Prato extends Descricao{
    public String nome;

    @Override
    public String toString() {
        return super.toString() + "\nNome: " + this.nome;
    }
}
