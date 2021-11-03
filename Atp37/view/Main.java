package Atp37.view;

import Atp37.controller.PratoController;
import Atp37.model.Prato;

public class Main {
    public static void main(String[] args) {
        
        PratoController prato = new PratoController();
        
        Prato p1 = new Prato();
        p1.id = 45;
        p1.nome = "Linguini All Mare";
        p1.acompanhamento = "Talharim";
        p1.principal = "Lagosta";
        p1.valor = 52.63;
        p1.dia_semana = "Sabado";
        
        prato.create(p1);
        for (Prato pp1 : prato.read()) {
            System.out.println(pp1);
        }

        Prato p2 = new Prato();
        p2.id = 45;
        p2.nome = "Fetuccine All Mare";
        p2.acompanhamento = "Fetuccine";
        p2.principal = "Camarão";
        p2.valor = 52.63;
        p2.dia_semana = "Terça";

        prato.update(p2);
        for (Prato pp1 : prato.read()) {
            System.out.println(pp1);
        }

        prato.delete(p1);
        for (Prato pp1 : prato.read()) {
            System.out.println("\nDeletado!");
        }
    }
}
