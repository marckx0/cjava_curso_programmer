package cjava.examples.com.beans;

public class Categorias {
    private String cod;
    private String descri;
    public Categorias(){

    }
    public Categorias(String cod, String descri){
        this.cod = cod;
        this.descri = descri;
    }
    public void Imprimir(){
        System.out.println("Codigo : "+this.getCod());
        System.out.println("Descripcion : "+this.getDescri());
    }
    public String getCod() {
        return cod;
    }
    public String getDescri() {
        return descri;
    }
}
