package cjava.examples.com.views;

import cjava.examples.com.bean.Articulo;
import cjava.examples.com.factory.DAOFactory;
import cjava.examples.com.interfaces.ArticuloInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prueba06_Lambdas {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance();
        ArticuloInterfaces dao = factory.getArticuloDAO();

        List<Articulo> lista = dao.listar();

        for(Articulo a:lista){
            System.out.println(a);
        }

        //IMPRIMIR LISTA LAMBDA
        lista.forEach(a-> System.out.println(a));

        //FILTRO
        System.out.println("****************************************************");
        lista.stream()
                .filter(a->a.getOrigen().equals("PE") && a.getPrecio()>1000)
                .forEach(a-> System.out.println(a));

        //AGRUPAR
        Map<String,List<Articulo>> artmap = new HashMap<>();
        artmap = lista.stream()
                .collect(Collectors.groupingBy(Articulo::getOrigen));
        artmap.forEach((ori,lis) -> {
            System.out.println(ori);
            lis.forEach(a-> System.out.println(a));
        }
        );
    }
}
