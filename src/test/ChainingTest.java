package test;

import com.sun.tools.javac.Main;
import model.Chaining;

public class ChainingTest {
    public static void main(String[] args) {
        Chaining teste = new Chaining(4);
        teste.gerarRepresentacao();
        teste.addValue("Rennan");
        teste.gerarRepresentacao();
        teste.addValue("Vinicius");
        teste.gerarRepresentacao();
        teste.addValue("Adailton");
        teste.gerarRepresentacao();
        teste.addValue("Falci");
        teste.gerarRepresentacao();
        teste.addValue("Matuzinho");
        teste.gerarRepresentacao();
        teste.addValue("Jabour");
        teste.gerarRepresentacao();
        teste.addValue("Daves");
        teste.gerarRepresentacao();
        teste.addValue("Ariane");
        teste.gerarRepresentacao();
        teste.addValue("Oliveira");
        teste.gerarRepresentacao();
        teste.addValue("Juventus");
        teste.gerarRepresentacao();
        teste.addValue("Alex");
        teste.gerarRepresentacao();
        teste.addValue("Melman");
        teste.gerarRepresentacao();
        teste.addValue("Glória");
        teste.gerarRepresentacao();
        teste.addValue("Marti");
        teste.gerarRepresentacao();
        teste.searchValue("Jabour");
        teste.removeValue("Jabour");
        teste.gerarRepresentacao();
        teste.removeValue("Alex");
        teste.gerarRepresentacao();
        teste.removeValue("Ariane");
        teste.gerarRepresentacao();
        teste.removeValue("Ariane");
        teste.gerarRepresentacao();
        teste.searchValue("Jabour");
    }
}
