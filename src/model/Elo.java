package model;

public class Elo {

    private  String value;
    private Elo proximo;
    private Elo anterior;

    public Elo getAnterior() {
        return anterior;
    }

    public void setAnterior(Elo anterior) {
        this.anterior = anterior;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Elo getProximo() {
        return proximo;
    }

    public void setProximo(Elo proximo) {
        this.proximo = proximo;
    }

    public String getProgress() {
        if (this.getProximo()==null){
            return getValue();
        }
        return this.getValue()+"=>"+this.getProximo().getProgress();
    }

    public void add(String value) {
        if (this.getValue()==null||this.getValue().isBlank()) {
            this.setValue(value);
            System.out.println("posicao primaria livre");
           return;
        }
       if (this.getProximo()!=null){
           System.out.println("Posicao ocupada, proximo elo ");
           this.getProximo().add(value);
       }else{
           Elo temp = new Elo();
           this.setProximo(temp);
           temp.setValue(value);
           temp.setAnterior(this);
           System.out.println("Posicao ocupada, proximo elo ");
       }
    }



    public void delete(String value) {

        if(this.getValue().equals(value)){

            this.getAnterior().setProximo(this.getProximo());
            System.out.println("Elemento removido");
        }
        else{
            if (this.getProximo()==null){
                System.out.println("Elemento não encontrado");
            }else{
                this.getProximo().delete(value);
            }
        }
    }




    public boolean search(String value) {
        if (this.getValue().equals(value)){
            return true;
        }else{
            if(this.getProximo()!=null){
                return this.getProximo().search(value);
            }else{
                return false;
            }
        }
    }
}
