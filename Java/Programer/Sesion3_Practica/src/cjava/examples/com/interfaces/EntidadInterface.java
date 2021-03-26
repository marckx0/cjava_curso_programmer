package cjava.examples.com.interfaces;

import cjava.examples.com.bean.Persona;

import java.util.List;

public interface EntidadInterface<T> {
    public String grabar(T obj);
    public String modificar(T obj);
    public String eliminar(Object id);
    public Persona buscar(Object id);
    public List<T> listar();
}
