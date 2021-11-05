package Atp40.Parte2;

import java.io.FileWriter;
import java.io.IOException;

public class View {
    private static String filename = "Atp40/Parte2/PontosTuristicos.csv";
    public static void main(String[] args) {
        PontosTuristicos pt = new PontosTuristicos();
        pt.nome = "Centro Histórico";
        pt.localizacao = "Ilhabela";
        pt.descricao = "Principal ponto turistico de Ilhabela. Com comercio, museus e lojas";

        
        try {
            FileWriter fw = new FileWriter(filename, true);
            String pontosTuristicoString = String.format("%s;%s;%s\n", pt.nome, pt.localizacao, pt.descricao);
            fw.write(pontosTuristicoString);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
    }
}
