package cjava.examples.com.beans;

public class Tecnico extends Empleado {
    private String especialidad;
    private int comision;

    public void Imprimir(){
        super.Imprimir();
        System.out.println("Especialidad : "+this.getEspecialidad());
        System.out.println("Comision(%) : "+this.getComision());
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
}
