package cjava.examples.com.bean;


public class Articulo {
    private String cod;
    private String descri;
    private String origen;
    private double precio;

    public static class Builder{
        private String cod;
        private String descri;
        private String origen;
        private double precio;

        public Articulo.Builder setCod(String cod) {
            this.cod = cod;
            return this;
        }

        public Articulo.Builder setDescri(String descri) {
            this.descri = descri;
            return this;
        }

        public Articulo.Builder setOrigen(String origen) {
            this.origen = origen;
            return this;
        }

        public Articulo.Builder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }
        public Articulo build(){
            return new Articulo(this);
        }
    }

    public String toString(){
        return this.getCod()+"\t"+this.getDescri()+"\t"+this.getOrigen()+'\t'+this.getPrecio();
    }
    
    private Articulo(Articulo.Builder builder){
        this.cod = builder.cod;
        this.descri = builder.descri;
        this.origen = builder.origen;
        this.precio = builder.precio;
    }

    public void Imprimir(){
        System.out.println("Codigo : "+this.getCod());
        System.out.println("Descripcion : "+this.getDescri());
        System.out.println("Origen : "+this.getOrigen());
        System.out.println("Precio : "+this.getPrecio());
    }

    public String getCod() {
        return cod;
    }

    public String getDescri() {
        return descri;
    }

    public String getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }
}
