package cjava.examples.com.dao;

import cjava.examples.com.bean.Persona;
import cjava.examples.com.interfaces.PersonaInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements PersonaInterface {

    private List<Persona> lista = new ArrayList<Persona>();


    @Override
    public String grabar(Persona obj) {
        String result="";
        try{
            lista.add(obj);
            result = "Se grabo exitosamente";

        }catch (Exception ex){
            result = ex.getMessage();
        }
        return result;
    }

    @Override
    public String modificar(Persona obj) {
        String result="";
        try{
            int pos = BuscarDNI(obj.getDni());
            if (pos >= 0){
                lista.set(pos,obj);
                result = "Se modifico exitosamente";
            } else {
                result = "ERROR :: Codigo no existe";
            }

        }catch (Exception ex){
            result = ex.getMessage();
        }
        return result;
    }

    @Override
    public String eliminar(Object id) {
        String result="";
        try{
            int pos = BuscarDNI(String.valueOf(id));
            if(pos>=0){
                lista.remove(pos);
                result = "Se elimino exitosamente";
            } else {
                result = "El codigo no existe";
            }

        }catch (Exception ex){
            result = ex.getMessage();
        }
        return result;
    }

    @Override
    public Persona buscar(Object id) {
        Persona p =null;
        int pos = BuscarDNI(String.valueOf(id));
        if (pos >= 0){
            p = lista.get(pos);
        }
        return p;
    }

    private int BuscarDNI(String dni){
        int pos = -1;
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getDni().equals(dni)){
                pos = i;
            }
        }
        return pos;
    }


    @Override
    public List<Persona> listar() {
        return lista;
    }
}
