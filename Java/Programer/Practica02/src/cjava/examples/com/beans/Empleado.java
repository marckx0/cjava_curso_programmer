package cjava.examples.com.beans;

public class Empleado {
    private String dni;
    private String nom;
    private double sueldo;
    
    public void Imprimir(){
        System.out.println("Dni : "+this.getDni());
        System.out.println("Nombre : "+this.getNom());
        System.out.println("Sueldo : "+this.getSueldo());
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
