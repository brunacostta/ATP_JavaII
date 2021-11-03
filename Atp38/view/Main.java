package Atp38.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //java.io

        //criando fluxo de entrada através de um arquivo.
        try{
            FileInputStream fis = new FileInputStream("Atp38/dados/leitura.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }

            br.close();

            System.out.println("Arquivo aberto com sucesso.");
        }catch (FileNotFoundException ex){
            System.out.println("Arquivo não encontrado.");
        }catch (IOException ex){
            System.out.println("Não foi possível executar o arquivo.");
        }
    }
}
