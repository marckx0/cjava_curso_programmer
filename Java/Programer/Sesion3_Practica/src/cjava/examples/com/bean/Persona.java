package cjava.examples.com.bean;

import cjava.examples.com.util.Genero;
import cjava.examples.com.util.Utilitarios;

public class Persona {
    private String dni;
    private String nombre;
    private double sueldo;
    private Genero genero;

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getAFP() {
        return this.getSueldo() * Utilitarios.DESCUENTO_AFP;
    }

    public double getNeto () {
        double neto=0;
        if(this.getGenero() == Genero.MASCULINO) {
            neto = this.getSueldo() - this.getAFP();
        }else{
            neto = getSueldo();
        }
        return neto;
    }

    public void Imprimir(){
        System.out.println("DNI : "+this.getDni());
        System.out.println("Nombre : "+this.getNombre());
        System.out.println("Sueldo : "+this.getSueldo());
        System.out.println("Genero : "+this.getGenero());
        System.out.println("Descuento AFP : "+this.getAFP());
        System.out.println("Neto : "+this.getNeto());
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
