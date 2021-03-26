package cjava.examples.com.interfaces;

public interface EntidadInterface<T> {
    public String grabarDatos(T obj);
    public String actualizarDatos(T obj);
    public T buscar(Object id);

}
