package cjava.examples.com.views;

import cjava.examples.com.bean.Persona;
import cjava.examples.com.util.Genero;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Prueba01 {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        Persona obj;

        obj = new Persona();
        obj.setDni("11111111");
        obj.setNombre("JOSE");
        obj.setSueldo(2000);
        obj.setGenero(Genero.MASCULINO);
        lista.add(obj);

        obj = new Persona();
        obj.setDni("22222222");
        obj.setNombre("MARIA");
        obj.setSueldo(4000);
        obj.setGenero(Genero.FEMENINO);
        lista.add(obj);

        obj = new Persona();
        obj.setDni("33333333");
        obj.setNombre("JOSE MARIA");
        obj.setSueldo(1000);
        obj.setGenero(Genero.FEMENINO);
        lista.add(obj);

        //Imprimir toda la lista
        double sumasueldos=0;
        for(int i=0;i<lista.size();i++){
            Persona p = lista.get(i);
            p.Imprimir();
            sumasueldos += p.getNeto();
        }
        System.out.println("La suma de los netos es :"+sumasueldos);

        System.out.println("Otra forma de imprimir");
        double sueldomayor=0;
        Persona pmayor=null;
        for(Persona p : lista){
            p.Imprimir();
            if(p.getNeto()>=sueldomayor){
                sueldomayor = p.getNeto();
                pmayor = p;
            }
        }
        System.out.println("Datos del que mas gana");
        pmayor.Imprimir();

        // Modifico un List
        Persona pmodifica = new Persona();
        pmodifica.setDni("33333333");
        pmodifica.setNombre("MERCEDES");
        pmodifica.setSueldo(2000);
        pmodifica.setGenero(Genero.FEMENINO);
        lista.set(2,pmodifica);
        System.out.println("Lista Modificada");
        for(Persona p:lista){
            p.Imprimir();
        }

        //Modificar el sueldo de las personas de Genero Femenino y actualizar su sueldo en un 10% menos

        for(int i=0;i<lista.size();i++){
            Persona p = lista.get(i);
            if(p.getGenero()==Genero.FEMENINO){
                p.setSueldo(p.getSueldo()*0.9);
                lista.set(i,p);
            }
        }
        System.out.println("Lista Modificada del genero femenino");
        for(Persona p:lista){
            p.Imprimir();
        }

        // Eliminar en un list (Elimina todo : lista.removeAll();)

        lista.remove(2);
        System.out.println("Lista despues de eliminar");
        for(Persona p:lista){
            p.Imprimir();
        }

        //Eliminar ingresando un DNI

        String dni = JOptionPane.showInputDialog("Ingrese DNI");
        for(int i=0;i<=lista.size();i++){
            Persona p = lista.get(i);
            if(p.getDni().equals(dni)){
                lista.remove(i);
            }
        }
        System.out.println("Lista despues de eliminar el DNI");
        for(Persona p:lista){
            p.Imprimir();
        }

    }
}
