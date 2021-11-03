package Atp38.view;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Atp38/dados/escrita.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            //fluxo e um buffer de escrita
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("O Rato roeu");
            bw.write("\na roupa do rei");
            bw.write("\nde Roma.");
            bw.write("\nFIM");
            bw.close();

            System.out.println("Arquivo aberto!");
        } catch (FileNotFoundException ex) {
            System.out.println("\nArquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Não foi realizada a escrita no arquivo.");
        }
    }
}
