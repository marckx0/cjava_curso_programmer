package cjava.examples.com.dao;

import cjava.examples.com.bean.Articulo;
import cjava.examples.com.bean.Persona;
import cjava.examples.com.interfaces.ArticuloInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ArticuloDAO implements ArticuloInterfaces {
    @Override
    public String grabar(Articulo obj) {
        return null;
    }

    @Override
    public String modificar(Articulo obj) {
        return null;
    }

    @Override
    public String eliminar(Object id) {
        return null;
    }

    @Override
    public Persona buscar(Object id) {
        return null;
    }

    @Override
    public List<Articulo> listar() {
        List<Articulo> lista = new ArrayList<Articulo>();
        lista.add(new Articulo.Builder().setCod("A01").setDescri("TV").setOrigen("PE").setPrecio(2400).build());
        lista.add(new Articulo.Builder().setCod("A02").setDescri("RADIO").setOrigen("PE").setPrecio(400).build());
        lista.add(new Articulo.Builder().setCod("A03").setDescri("DVD").setOrigen("US").setPrecio(600).build());
        lista.add(new Articulo.Builder().setCod("A04").setDescri("COCINA").setOrigen("US").setPrecio(800).build());
        lista.add(new Articulo.Builder().setCod("A05").setDescri("PLANCHA").setOrigen("IT").setPrecio(100).build());
        
        return lista;
    }
}
