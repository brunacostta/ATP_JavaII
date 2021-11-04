package Atp39.view;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Escrita {
    public static void main(String[] args) throws IOException {
        //classe FileWriter para salvar novas linhas no arquivo
        FileWriter fw = null;
        try {
            //Utilize a opção de append para que o arquivo não seja reescrito.
            fw = new FileWriter("Atp39/dados/leitura.txt", true);
            fw.write("Bruna\n");
            fw.write("Costa\n");
            fw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("\nArquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Não foi realizada a escrita no arquivo.");
        }
    }
}
