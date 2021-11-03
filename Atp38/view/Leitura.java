package Atp38.view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static void main(String[] args) {
        //java.io

        //criando fluxo de entrada através de um arquivo.
        try{
            FileInputStream fis = new FileInputStream("Atp38/dados/escrita.txt");

            //leitor de fluxo e um buffer de leitura
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            //Com o buffer, imprima as linhas do arquivo no console.
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();

            System.out.println("\nArquivo aberto com sucesso.");
        }catch (FileNotFoundException ex){
            System.out.println("\nArquivo não encontrado.");
        }catch (IOException ex){
            System.out.println("\nNão foi possível executar o arquivo.");
        }
    }
}
