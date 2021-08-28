package test;


import model.LinearProbingIncrementUni;

public class LinearProbingIncramentUniTest {
    public static void main(String[] args) {
        LinearProbingIncrementUni teste = new LinearProbingIncrementUni(7,2);
        teste.gerarRepresentacao();
        teste.add("Rennan");
        teste.gerarRepresentacao();
        teste.add("Rennan");teste.gerarRepresentacao();
        teste.add("nanneR");teste.gerarRepresentacao();
        teste.add("nnaeRn");teste.gerarRepresentacao();
//        teste.add("Rennan");teste.gerarRepresentacao();
//        teste.add("Rennan");teste.gerarRepresentacao();
//        teste.add("Rennan");teste.gerarRepresentacao();
//        teste.add("Rennan");
//        teste.gerarRepresentacao();
//        teste.add("Vinicius");
//        teste.gerarRepresentacao();
//        teste.add("Adailton");
//        teste.gerarRepresentacao();
//        teste.add("Falci");
//        teste.gerarRepresentacao();
//        teste.add("Matuzinho");
//        teste.gerarRepresentacao();
//        teste.add("Jabour");
//        teste.gerarRepresentacao();
//        teste.add("Daves");
//        teste.gerarRepresentacao();
//        teste.add("Ariane");
//        teste.gerarRepresentacao();
//        teste.add("Oliveira");
//        teste.gerarRepresentacao();
//        teste.add("Juventus");
//        teste.gerarRepresentacao();
//        teste.add("Alex");
//        teste.gerarRepresentacao();
//        teste.add("Melman");
//        teste.gerarRepresentacao();
//        teste.add("Glória");
//        teste.gerarRepresentacao();
        //teste.add("Marti");
        //teste.gerarRepresentacao();

        //teste.add("ABECEDARIO");

        //teste.add("nnaeRn");teste.gerarRepresentacao();
        teste.gerarRepresentacao();
        teste.searchObject("nnaeRn");
        teste.remove("nanneR");
        teste.gerarRepresentacao();
        teste.remove("Rennan");
        teste.gerarRepresentacao();
       /* teste.remove("Rennan");
        teste.gerarRepresentacao();
        teste.add("Marti");
        teste.gerarRepresentacao();
        teste.remove("Alex");
        teste.gerarRepresentacao();
        teste.remove("Ariane");
        teste.gerarRepresentacao();
        teste.remove("Ariane");
        teste.gerarRepresentacao();*/

    }
}
