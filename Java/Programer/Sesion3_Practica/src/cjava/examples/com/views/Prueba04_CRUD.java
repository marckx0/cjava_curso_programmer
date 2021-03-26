package cjava.examples.com.views;

import cjava.examples.com.bean.Persona;
import cjava.examples.com.factory.DAOFactory;
import cjava.examples.com.interfaces.PersonaInterface;
import cjava.examples.com.util.Genero;

import javax.swing.*;
import java.util.List;

public class Prueba04_CRUD {
    public static DAOFactory factory = DAOFactory.getInstance();
    public static PersonaInterface dao = factory.getPersonaDAO(1);

    public static void main(String[] args) {

        int op=0;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opcion : \n1. -Grabar\n2. -Listar\n3. -Modificar\n4. -Buscar\n5. -Eliminar\n0. -Salir"));
            switch (op){
                case 1: grabar();break;
                case 2: listar();break;
                case 3: modificar();break;
                case 4: buscar();break;
                case 5: eliminar();break;
            }
        } while (op!=0);
    }

    public static void grabar(){
        Persona obj = new Persona();
        obj.setDni(JOptionPane.showInputDialog("Ingrese DNI"));
        obj.setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
        obj.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Sueldo")));
        String genero = JOptionPane.showInputDialog("Ingrese Genero : M o F");
        if(genero.equals("M")) obj.setGenero(Genero.MASCULINO);
        else obj.setGenero(Genero.FEMENINO);
        JOptionPane.showMessageDialog(null,dao.grabar(obj));

    }
    public static void listar(){
        List<Persona> lista = dao.listar();
        for(Persona p:lista){
            p.Imprimir();
        }

    }
    public static void modificar(){
        // INGRESAR DNI SI EXISTE DEBEN INGRESAR LOS NUEVOS DATOS A EXCEON DEL DNI

    }
    public static void buscar(){
        // INGRESAR DNI Y SI EXISTE MOSTRAR SUS DATOS

    }
    public static void eliminar(){
        // INGRESAR DNI Y ELIMINAR DATOS

    }
}
