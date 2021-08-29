package view;

import model.*;

import java.util.Scanner;

public class Main {
    static  Scanner leitor = new Scanner(System.in);
    static String menuDeOperacao="1-Adicionar um elemento \n" +
            "2-Buscar um elemento \n" +
            "3-Remover elemento\n" +
            "4-Gerar Representacao\n" +
            "5-sair";
    public static void main(String[] args) {
        String menu = "Informe qual método Hash deseja operar\n" +
                "1 - Chaining. \n" +
                "2- Linear Probing. \n" +
                "3 - Linear Probing fixed increment bidirecional.\n" +
                "4 - Linear Probing duas direções.\n" +
                "5 - Linear Probing fixed increment unidirecional. \n" +
                "6 - Sair";

        int op=5;
        do{
            System.out.println(menu);
            op = leitor.nextInt();
            switch (op){
                case 1:
                    chaning();
                    break;
                case 2:
                    linearProbing();
                    break;
                case 3:
                    linearProbingIncrementBidirectional();
                    break;
                case 4:
                    linearProbingBidirectional();
                    break;
                case 5:
                    linearProbingIncrementFixed();
                    break;
                default:
                    op=6;
                    System.out.println("Adeus!");
                    break;
            }
        }while (op!=6);
    }

    private static void linearProbingBidirectional() {
        System.out.println("Defina o tamanho do Hash");
        int tamanho = leitor.nextInt();
        int operacaoInterna;
        LinearProbingBidirectional hash = new LinearProbingBidirectional(tamanho);
        do{
            System.out.println(menuDeOperacao);
            operacaoInterna=leitor.nextInt();
            switch (operacaoInterna){
                case 1:
                    hash.add(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 2:
                    hash.searchObject(getValor());
                    break;
                case 3:
                    hash.remove(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 4:
                    hash.gerarRepresentacao();
                    break;
                default:
                    operacaoInterna=5;
            }
        }while (operacaoInterna<5);
    }

    private static void linearProbingIncrementFixed() {
        System.out.println("Defina o tamanho do Hash");
        int tamanho = leitor.nextInt();
        System.out.println("Defina o salto");
        int salto = leitor.nextInt();
        int operacaoInterna;
        LinearProbingIncrementUni hash = new LinearProbingIncrementUni(tamanho,salto);
        do{
            System.out.println(menuDeOperacao);
            operacaoInterna=leitor.nextInt();
            switch (operacaoInterna){
                case 1:
                    hash.add(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 2:
                    hash.searchObject(getValor());
                    break;
                case 3:
                    hash.remove(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 4:
                    hash.gerarRepresentacao();
                    break;
                default:
                    operacaoInterna=5;
            }
        }while (operacaoInterna<5);
    }

    private static void linearProbingIncrementBidirectional() {
        System.out.println("Defina o tamanho do Hash");
        int tamanho = leitor.nextInt();
        System.out.println("Defina o salto");
        int salto = leitor.nextInt();
        int operacaoInterna;
        LinearProbingIncrementBi hash = new LinearProbingIncrementBi(tamanho,salto);
        do{
            System.out.println(menuDeOperacao);
            operacaoInterna=leitor.nextInt();
            switch (operacaoInterna){
                case 1:
                    hash.add(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 2:
                    hash.searchObject(getValor());
                    break;
                case 3:
                    hash.remove(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 4:
                    hash.gerarRepresentacao();
                    break;
                default:
                    operacaoInterna=5;
            }
        }while (operacaoInterna<5);
    }

    private static void linearProbing() {
        System.out.println("Defina o tamanho do Hash");
        int tamanho = leitor.nextInt();
        int operacaoInterna;
        LinearProbing hash = new LinearProbing(tamanho);
        do{
            System.out.println(menuDeOperacao);
            operacaoInterna=leitor.nextInt();
            switch (operacaoInterna){
                case 1:
                    hash.add(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 2:
                    hash.searchObject(getValor());
                    break;
                case 3:
                    hash.remove(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 4:
                    hash.gerarRepresentacao();
                    break;
                default:
                    operacaoInterna=5;
            }
        }while (operacaoInterna<5);

    }

    private static void chaning() {
        System.out.println("Defina o tamanho do Hash");
        int tamanho = leitor.nextInt();
        int operacaoInterna;
        Chaining hash = new Chaining(tamanho);
        do{
            System.out.println(menuDeOperacao);
            operacaoInterna=leitor.nextInt();
            switch (operacaoInterna){
                case 1:
                    hash.addValue(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 2:
                    hash.searchValue(getValor());
                    break;
                case 3:
                    hash.removeValue(getValor());
                    hash.gerarRepresentacao();
                    break;
                case 4:
                    hash.gerarRepresentacao();
                    break;
                default:
                    operacaoInterna=5;
            }
        }while (operacaoInterna<5);


    }

    private static String getValor() {
        return leitor.next();
    }
}
