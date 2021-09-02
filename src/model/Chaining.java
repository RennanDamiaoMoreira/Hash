package model;

public class Chaining {
    private int tamanho;
    private Elo list[];

    public Chaining(int tamanho) {
        this.tamanho = tamanho;
        this.list = new Elo[tamanho];
    }
    public void addValue(String value){
        int charCode=0;
        int key;
        String returnText = "String == "+value+"\n";
        for (int i=0; i<value.length();i++){
            charCode+=(int)value.charAt(i);
            returnText += value.charAt(i)+"=="+(int)value.charAt(i)+"  SubTotal == "+charCode+"\n";
        }
        returnText+="\n\nTotal = "+charCode;
        key = charCode%tamanho;
        returnText+="  chave "+key+"\n\n";
        if (list[key]==null){
            list[key]=new Elo();
        }
        System.out.println(returnText);
        list[key].add(value);

    }

    public void removeValue(String value){
        int charCode=0;
        int key;
        String returnText = "String == "+value+"\n";
        for (int i=0; i<value.length();i++){
            charCode+=(int)value.charAt(i);
            returnText += value.charAt(i)+"=="+(int)value.charAt(i)+"  SubTotal == "+charCode+"\n";
        }
        returnText+="\n\nTotal = "+charCode;
        key = charCode%tamanho;
        returnText+="  chave "+key+"\n\n";

        System.out.println(returnText);
        if (list[key]==null){
            System.out.println("Elemento nao encontrado");
        }else{
            if(list[key].getValue().equals(value)){
                list[key]=list[key].getProximo();
                System.out.println("Elemento removido");
            }else{
                list[key].delete(value);
            }
        }



    }
    public void searchValue (String value){
        int charCode=0;
        int key;
        String returnText = "String == "+value+"\n";
        for (int i=0; i<value.length();i++){
            charCode+=(int)value.charAt(i);
            returnText += value.charAt(i)+"=="+(int)value.charAt(i)+"  SubTotal == "+charCode+"\n";
        }
        returnText+="\n\nTotal = "+charCode;
        key = charCode%tamanho;
        returnText+="  chave "+key+"\n\n";
        System.out.println(returnText);
        if (list[key]==null){
            System.out.println("Não encontrado");;
        }else{
            if (list[key].search(value)){
                System.out.println("Valor encontrado");
            }else{
                System.out.println("Não encontrado");
            }
        }


    }

    public void gerarRepresentacao(){
        String returnText = "";
        for (int i = 0 ; i<tamanho;i++){
            returnText = returnText +i+"|";
            if(list[i]!=null){
                returnText=returnText+list[i].getProgress();
            }
            returnText=returnText +"\n";
        }
        System.out.println(returnText);
    }

}
