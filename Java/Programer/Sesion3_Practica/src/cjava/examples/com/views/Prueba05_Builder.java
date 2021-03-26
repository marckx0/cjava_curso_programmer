package cjava.examples.com.views;

import cjava.examples.com.bean.Articulo;
import cjava.examples.com.factory.DAOFactory;
import cjava.examples.com.interfaces.ArticuloInterfaces;

import java.util.List;

public class Prueba05_Builder {
    public static void main(String[] args) {
        /*
        Articulo a;
        a = new Articulo.Builder().setCod("A001").setDescri("TV").setOrigen("PE").setPrecio(2000).build();
        a.Imprimir();
         */
        DAOFactory factory = DAOFactory.getInstance();
        ArticuloInterfaces dao = factory.getArticuloDAO();

        List<Articulo> lista = dao.listar();
        for(Articulo a:lista){
            System.out.println(a);
        }
    }
}
