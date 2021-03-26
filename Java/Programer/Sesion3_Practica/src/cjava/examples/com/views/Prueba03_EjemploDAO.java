package cjava.examples.com.views;

import cjava.examples.com.bean.Persona;
import cjava.examples.com.factory.DAOFactory;
import cjava.examples.com.interfaces.PersonaInterface;
import cjava.examples.com.util.Genero;

import java.util.List;

public class Prueba03_EjemploDAO {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance();
        PersonaInterface dao = factory.getPersonaDAO(1);

        Persona obj = new Persona();
        obj.setDni("11111111");
        obj.setNombre("ANA");
        obj.setSueldo(1000);
        obj.setGenero(Genero.FEMENINO);
        String msg = dao.grabar(obj);
        System.out.println(msg);

        obj = new Persona();
        obj.setDni("22222222");
        obj.setNombre("PEDRO");
        obj.setSueldo(2000);
        obj.setGenero(Genero.MASCULINO);
        msg = dao.grabar(obj);
        System.out.println(msg);

        List<Persona> lista = dao.listar();
        for(Persona p:lista){
            p.Imprimir();
        }

    }
}
