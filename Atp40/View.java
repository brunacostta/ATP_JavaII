package Atp40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa();
        emp1.nome = "Abreu ME";
        emp1.cnpj = "1245687455/221";
        emp1.ramo_atividade = "Industria";

        //Utilize o padrão DAO para criar uma estrutura de armazenamento de dados em um arquivo do tipo CSV.
        try {
            FileWriter fw = new FileWriter("Atp40/Empresas.csv", true);
            //DAO - DATA Access Object
            //Os dados devem ser convertidos de Objeto para String ao salvar.
            String empresaString = String.format("Nome: %s; CNPJ:%s;Ramo de Atividade: %s\n", emp1.nome, emp1.cnpj, emp1.ramo_atividade);
            fw.write(empresaString);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
        
        try {
            //Os dados devem ser convertidos de String para Objeto ao ler.
            Scanner sc = new Scanner(new File("Atp40/Empresas.csv"));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] empresaStrings = linha.split(";");
                System.out.println(linha);
                
                Empresa emp = new Empresa();
                emp.nome = empresaStrings[0];
                emp.cnpj = empresaStrings[1];
                emp.ramo_atividade = empresaStrings[2];
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
    }  
}
