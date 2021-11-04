package Atp39.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream fis = System.in;
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("Atp39/dados/leitura.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            String linha = br.readLine();
            while (linha != null && !linha.equals("q")) {
                linha = br.readLine();
                bw.write(linha + "\n");      
            }
            bw.close();
            br.close();

            System.out.println("Arquivo aberto!");
        } catch (FileNotFoundException ex) {
            System.out.println("\nArquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Não foi realizada a escrita no arquivo.");
        }
    }
}
