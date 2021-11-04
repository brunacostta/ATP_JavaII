package Atp39.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //leitura deve utilizar a classe Scanner para ler os dados do arquivo. Imprima todas as linhas no terminal
        try {
            Scanner sc = new Scanner(new File("Atp39/dados/leitura.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
