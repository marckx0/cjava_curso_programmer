package cjava.examples.com.views;

import cjava.examples.com.beans.Categorias;
import cjava.examples.com.beans.Empleado;
import cjava.examples.com.beans.Tecnico;

public class Example04_POO {
    public static void main(String[] args) {

        Empleado emp = new Empleado();
        emp.setDni("11111111");
        emp.setNom("JUAN PEREZ");
        emp.setSueldo(2000);
        emp.Imprimir();

        Tecnico tec = new Tecnico();
        tec.setDni("12345678");
        tec.setNom("PEDRO SALAS");
        tec.setSueldo(25000);
        tec.setEspecialidad("Motores");
        tec.setComision(8);
        tec.Imprimir();

        Categorias cat = new Categorias("C1","VENDEDOR");
        cat.Imprimir();
    }
}
