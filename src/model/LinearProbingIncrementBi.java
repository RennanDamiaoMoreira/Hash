package model;

import java.util.ArrayList;
import java.util.List;

public class LinearProbingIncrementBi {
    public String list [][];//frist position = value, second position = key reference;
    public int tamanho ;
    public int salto;
    public String returnText;

    public LinearProbingIncrementBi(int tamanho, int salto) {
        this.list = new String[tamanho][2];
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
            returnText= returnText+"=="+ list[i][0]+" == "+list[i][1] ;
            returnText=returnText +"\n";
        }
        System.out.println(returnText);
        returnText=null;
    }

    private int find(String value, int position) {
        if (list[position][0]!=null&&list[position][0].equals(value)){
            return position;
        }
        int i =position+salto;
        for (; i<tamanho;i+=salto){
            if(list[i][0]!=null&&list[i][1].equals(String.valueOf(position))){
                if (list[i][0].equals(value)){
                    return i;
                }
            }
        }
        i=i-tamanho;
        for (; i<position;i+=salto){
            if(list[i][0]!=null&&list[i][1].equals(String.valueOf(position))){
                if (list[i][0].equals(value)){
                    return i;
                }
            }
        }
        return -1;
    }

    public void add(String value){
        returnText="String == "+value+"\n";
        int posicao = getPosition(value);
        if(list[posicao][0]==null||list[posicao][0].isBlank()){
            list[posicao][0]=value;
            list[posicao][1]=String.valueOf(posicao) ;
            returnText+="Posição certa livre, string add\n";
            System.out.println(returnText);
            returnText=null;
            return;
        }
        int i = posicao+salto;
        for (; i<tamanho;i+=salto){
            returnText+="Posição ocupada, avaliando a próxima\n";
            if(list[i][0]==null||list[i][0].isBlank()){
                list[i][0]=value;
                list[i][1]=String.valueOf(posicao);
                returnText+="string add na posicao"+i+"\n";
                System.out.println(returnText);
                returnText=null;
                return;
            }
        }
        returnText+="Fim da tabela, retornando no início\n"+"i="+i;

        i = i-tamanho;
        returnText+="  i novo= "+i  +"\n";
        for (; i<posicao;i+=salto){
            returnText+="Posição ocupada, avaliando a próxima\n";
            if(list[i][0]==null||list[i][0].isBlank()){
                list[i][0]=value;
                list[i][1]=String.valueOf(posicao);
                returnText+="string add na posicao"+i+"\n";
                System.out.println(returnText);
                returnText=null;
                return;
            }
        }
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
        for(int i = 0 ;i<tamanho;i++){
            if(list[i][1]!=null&&Integer.parseInt(list[i][1])!=i){
                //System.out.println("O elemento da posicao"+i+" deveria ser realocado proximo a "+list[i][1]);
                Object obj = null;
                for(Object elem : positions){
                    //System.out.println(elem);
                    if (Integer.valueOf((Integer) elem)-Integer.valueOf(list[i][1])==0||Integer.valueOf((Integer) elem)-Integer.valueOf(list[i][1])%salto==0) { // se a posicao livre pertence ao salto em relacao a posicao certa
                        if (Integer.valueOf((Integer) elem) >= Integer.valueOf(list[i][1])) { // se a posicao livre fica mais proximo da posicao certa
                            if ((i - Integer.valueOf((Integer) elem) > 0)||i<Integer.valueOf(list[i][1])) {// se a posicao livre fica mais proximo da posicao certa em relacao ao elemento.
                                //System.out.println("Entrou aqui");
                                //System.out.println("Posicao    " + i + " Para " + (int) elem);
                                list[(int) elem][0] = list[i][0];
                                list[(int) elem][1] = list[i][1];
                                list[i][0] = null;
                                list[i][1] = null;
                                obj = elem;
                                break;
                            }
                        }
                    }
                }
                if (obj!=null){
                    positions.remove(obj);
                }
            }
        }
    }


}
