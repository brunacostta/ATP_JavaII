package Atp40.Parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Crie um sistema para cadastro de Pontos Turísticos. A classe de modelo deve possuir três atributos públicos: nome, descrição e localização.
public class PontosTuristicos implements IController {
   
    private String filename = "Atp40/Parte2/PontosTuristicos.csv";

    @Override
    public String salva(String nome, String descricao, String localizacao) {
        String mensagem;
        try {
            FileWriter fw = new FileWriter(filename, true);
            //DAO - Data Access Object = Object --> String

            String pontosTuristicoString = String.format("%s;%s;%s\n", nome, descricao, localizacao);
            fw.write(pontosTuristicoString);
            fw.close();
            mensagem = "Nome: " + nome + " Descrição: " + descricao + " Localização: " + localizacao + " Salvo com sucesso.";
        } catch (IOException e) {
            mensagem = "Não foi possível abrir o arquivo.";
        }
        return mensagem;
    }
       
    @Override
    public ArrayList<PontoTuristico> ler() {
        ArrayList<PontoTuristico> lista = new ArrayList<PontoTuristico>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] dadoString = linha.split(";");

                PontoTuristico pt2 = new PontoTuristico();
                pt2.nome = dadoString[0];
                pt2.descricao = dadoString[1];
                pt2.localizacao = dadoString[2];

                lista.add(pt2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
        return lista;
    }
    
}
