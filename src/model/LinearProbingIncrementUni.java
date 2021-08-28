package model;

import java.util.ArrayList;
import java.util.List;

public class LinearProbingIncrementUni {
    public String list [][];//frist position = value, second position = key reference, third position = factorMultiplex;
    public int tamanho ;
    public int salto;
    public String returnText;

    public LinearProbingIncrementUni(int tamanho,int salto) {
        this.list = new String[tamanho][3];
        this.tamanho = tamanho;
        this.salto = salto;
    }

    private int getPosition(String value) {
        int charCode=0;
        for (int i=0; i<value.length();i++){
            charCode+=(int)value.charAt(i);
            returnText += value.charAt(i)+"=="+(int)value.charAt(i)+"  SubTotal == "+charCode+"\n";
        }
        returnText+="\n\nTotal = "+charCode+"\n key == "+charCode%tamanho+"\n\n\n";
        return charCode%tamanho;
    }

    public void gerarRepresentacao(){
         returnText = "";
        for (int i = 0 ; i<tamanho;i++){
            returnText = returnText +i+"|";
            returnText= returnText+"=="+ list[i][0]+" == "+list[i][1]+" == "+list[i][2] ;
            returnText=returnText +"\n";
        }
        System.out.println(returnText);
        returnText=null;
    }

    private int find(String value, int position) {
        int multiplex=0;
        ArrayList<Integer> posicoesPercorridas = new ArrayList<>();
        if (list[position][0]!=null&&list[position][0].equals(value)){
            return position;
        }

        do {
            multiplex++;
            int newPosition = ((position+(multiplex*salto))%tamanho);
            if(posicoesPercorridas.contains(newPosition)){
                return -1;
            }
            if (list[newPosition][0]!=null&&list[newPosition][1].equals(String.valueOf(position))&&list[newPosition][0].equals(value)){
                return newPosition;
            }
            posicoesPercorridas.add(newPosition);
        }while (posicoesPercorridas.size()!=tamanho);

        return -1;
    }

    public void add(String value){
        returnText="String == "+value+"\n";
        int posicao = getPosition(value);
        int multiplex=0;
        ArrayList<Integer> posicoesPercorridas=new ArrayList<>();
        if(list[posicao][0]==null||list[posicao][0].isBlank()){
            list[posicao][0]=value;
            list[posicao][1]=String.valueOf(posicao) ;
            list[posicao][2]=String.valueOf(0);
            returnText+="Posição certa livre, string add\n";
            System.out.println(returnText);
            returnText=null;
            return;
        }
        do {
           multiplex++;
           int newPosition = ((posicao+(multiplex*salto))%tamanho);
           if(posicoesPercorridas.contains(newPosition)){
               returnText+="A procura entrou em LOOP , error";
               System.out.println(returnText);
               returnText=null;
               return;
           }
            if(list[newPosition][0]==null||list[newPosition][0].isBlank()){
                list[newPosition][0]=value;
                list[newPosition][1]=String.valueOf(posicao) ;
                list[newPosition][2]=String.valueOf(multiplex) ;

                returnText+="String add na posicao "+newPosition+"\n";
                System.out.println(returnText);
                returnText=null;
                return;
            }
            posicoesPercorridas.add(newPosition);
        }while (posicoesPercorridas.size()!=tamanho);



        returnText+="Não foi encontrado posicao livre, error";
        System.out.println(returnText);
        returnText=null;


    }

    public void searchObject(String value){
        int position = getPosition(value);
        if (find(value,position)>=0){
            System.out.println("Elemento encontrado");
        }else{
            System.out.println("Elemento não encontrado");
        }
    }

    public void remove(String value){

        int position = find(value, getPosition(value));
        if (position>=0){
            list[position][0]=null;
            list[position][1]=null;
            list[position][2]=null;
            for (int i = 0; i < tamanho; i++) {
                organizar();
            }
            System.out.println("O elemento "+value+" Foi removido");
        }else{
            System.out.println("elemento nao encontrado");
        }
    }

    private void organizar() {
        List positions = new ArrayList<Integer>();
        for (int i = 0; i<tamanho;i++){
            if (list[i][0]==null||list[i][0].isBlank()){
                list[i][1]=null;
                positions.add(i);
            }
        }
        for (int i = 0; i<tamanho;i++){
            Object obj=null;
            for(Object position :positions){
                if (list[i][1]!=null&&Integer.parseInt(list[i][1])!=i){
                    if (list[i][2]!=null&&!list[i][2].isBlank()){
                        for(int j = 0 ; j<Integer.parseInt(list[i][2]);j++){
                            int newPosition = ((Integer.parseInt(list[i][1])+(j*salto))%tamanho);
                                if (newPosition==(Integer)position){
                                    list[newPosition][0]=list[i][0];
                                    list[newPosition][1]=list[i][1];
                                    list[newPosition][2]=String.valueOf(j);
                                    list[i][0] = null;
                                    list[i][1] = null;
                                    list[i][2] = null;
                                    obj=position;
                                    break;
                                }
                        }
                    }
                }
            }
            if(obj!=null){
                positions.remove(obj);
            }
        }
    }


}
