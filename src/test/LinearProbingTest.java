package test;

import model.Chaining;
import model.LinearProbing;

public class LinearProbingTest {
    public static void main(String[] args) {
        LinearProbing teste = new LinearProbing(5);
        teste.gerarRepresentacao();
        teste.add("Rennan");
        teste.gerarRepresentacao();
        teste.add("Vinicius");
        teste.gerarRepresentacao();
        teste.add("Adailton");
        teste.gerarRepresentacao();
        teste.add("Falci");
        teste.gerarRepresentacao();
        teste.add("Matuzinho");
        teste.gerarRepresentacao();
        teste.add("Jabour");
        teste.gerarRepresentacao();
        /*teste.add("Daves");
        teste.gerarRepresentacao();
        teste.add("Ariane");
        teste.gerarRepresentacao();
        teste.add("Oliveira");
        teste.gerarRepresentacao();
        teste.add("Juventus");
        teste.gerarRepresentacao();
        teste.add("Alex");
        teste.gerarRepresentacao();
        teste.add("Melman");
        teste.gerarRepresentacao();
        teste.add("Glória");
        teste.gerarRepresentacao();
        teste.add("Marti");
        teste.gerarRepresentacao();

        teste.add("ABECEDARIO");
        teste.gerarRepresentacao();
        teste.searchObject("ABECEDARIO");*/
        teste.remove("Falci");
        teste.remove("Rennan");
        teste.gerarRepresentacao();
        teste.add("Marti");
        teste.gerarRepresentacao();
        /*teste.removeValue("Alex");
        teste.gerarRepresentacao();
        teste.removeValue("Ariane");
        teste.gerarRepresentacao();
        teste.removeValue("Ariane");
        teste.gerarRepresentacao();
        teste.searchValue("Jabour");*/
    }
}
