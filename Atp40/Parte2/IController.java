package Atp40.Parte2;

import java.util.ArrayList;

public interface IController {
    public String salva(String nome, String descricao, String localizacao);
    public ArrayList<PontoTuristico> ler();
}
