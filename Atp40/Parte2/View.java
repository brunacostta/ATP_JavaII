package Atp40.Parte2;

public class View {
    public static void main(String[] args) {
        PontoTuristico pt = new PontoTuristico();
        pt.nome = "Centro Histórico";
        pt.descricao = "Principal ponto turistico";
        pt.localizacao = "Ilhabela";
        PontosTuristicos controller = new PontosTuristicos();
        String retorno = controller .salva(pt.nome, pt.descricao, pt.localizacao);
        System.out.println(retorno);
        
        
        for (PontoTuristico pto : controller.ler()) {
            System.out.printf("%s;%s;%s\n", pto.nome, pto.descricao, pto.localizacao);
        }
    }
}
