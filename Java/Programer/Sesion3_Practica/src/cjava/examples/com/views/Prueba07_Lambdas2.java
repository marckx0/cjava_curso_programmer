package cjava.examples.com.views;

import cjava.examples.com.bean.Articulo;
import cjava.examples.com.factory.DAOFactory;
import cjava.examples.com.interfaces.ArticuloInterfaces;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Prueba07_Lambdas2 {
    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance();
        ArticuloInterfaces dao = factory.getArticuloDAO();

        List<Articulo> lista = dao.listar();
        System.out.println("****************************************************");
        for (Articulo a:lista){
            if(a.getPrecio()>1000){
                System.out.println(a);
            }
        }

        System.out.println("****************************************************");
        for (Articulo a:lista){
            if(isPrecio(a)){
                System.out.println(a);
            }
        }

        //Predicate
        System.out.println("****************************************************");
        Predicate<Articulo> predPrecio = a -> a.getPrecio()>1000;
        for (Articulo a:lista){
            if(predPrecio.test(a)){
                System.out.println(a);
            }
        }

        //Predicate
        System.out.println("****************************************************");
        lista.stream().filter(predPrecio).forEach(a -> System.out.println(a));

        //SUM, COUNT, AVG y PEEK
        double sumaprecio;
        sumaprecio = lista.stream().mapToDouble(a -> a.getPrecio()).peek(p-> System.out.println(p)).sum();
        System.out.println("La suma de los precios es : "+sumaprecio);

        sumaprecio = lista.stream().filter(a->a.getOrigen().equals("PE")).peek(a -> System.out.println(a)).mapToDouble(a -> a.getPrecio()).sum();
        System.out.println("La suma de los precios de PE es : "+sumaprecio);

        OptionalDouble promprecio;
        promprecio = lista.stream().filter(a->a.getOrigen().equals("PE")).peek(a -> System.out.println(a)).mapToDouble(a -> a.getPrecio() * 2).average();
        if(promprecio.isPresent()){
            System.out.println("Promedio del doble de precios es "+promprecio.getAsDouble());
        }

        long cont = lista.stream().filter(a->a.getOrigen().equals("PE")).peek(a -> System.out.println(a)).count();
        System.out.println("La cantidad de registros PE es : "+cont);

        //MAP
        lista.stream().filter(a -> a.getOrigen().equals("PE")).peek(a-> System.out.println(a)).map(a->a.getPrecio() * 0.1).forEach(p -> System.out.println(p));

        //findFirst

        Optional<Articulo> art;
        art = lista.stream().filter(a->a.getOrigen().equals("PE")).findFirst();
        if(art.isPresent()){
            //Articulo a = art.get();
            //System.out.println(a);
            System.out.println("Primer articulo "+art.get());
        } else {
            System.out.println("No se encontro el primer articulo");
        }

        //Order:Collect
        System.out.println("****************************************************");
        lista.stream().forEach(a-> System.out.println(a));

        System.out.println("****************************************************");
        List<Articulo> lista2 = lista.stream().sorted(Comparator.comparing(Articulo::getDescri))
                .collect(Collectors.toList());
        lista2.stream().forEach(a-> System.out.println(a));

        //Muestra el articulo con mayor precio
        System.out.println("****************************************************");
        /*List<Articulo> lista3 = lista.stream().sorted(Comparator.comparing(Articulo::getPrecio).reversed())
                .collect(Collectors.toList());
        Optional<Articulo> artmayorprecio = lista3.stream().findFirst();
        */
        Optional<Articulo> artmayorprecio = lista.stream().sorted(Comparator.comparing(Articulo::getPrecio).reversed())
                .collect(Collectors.toList()).stream().findFirst();

        if(art.isPresent()){
            System.out.println(artmayorprecio);
        }

        //AGRUPAR
        System.out.println("****************************************************");
        Map<String,List<Articulo>> artmap = new HashMap<>();
        artmap = lista.stream()
                .collect(Collectors.groupingBy(Articulo::getOrigen));
        artmap.forEach((ori,lis) -> {
                    System.out.println(ori);
                    lis.forEach(a-> System.out.println(a));
                }
        );

        //AGRUPAR y Contar
        System.out.println("****************************************************");
        Map<String,Long> artcountmap = new HashMap<>();
        artcountmap = lista.stream()
                .collect(Collectors.groupingBy(Articulo::getOrigen, Collectors.counting()));

        artcountmap.forEach((ori,cant) -> {
                    System.out.println(ori + " : " + cant);

                }
        );

        //AGRUPAR y Contar
        System.out.println("****************************************************");
        Map<String,Double> artsummap = new HashMap<>();
        artsummap = lista.stream()
                .collect(Collectors.groupingBy(Articulo::getOrigen, Collectors.summingDouble(Articulo::getPrecio)));

        artsummap.forEach((ori,suma) -> {
                    System.out.println(ori + " : " + suma);

                }
        );

    }

    public static boolean isPrecio(Articulo a) {
        return a.getPrecio()>1000;
    }

}
