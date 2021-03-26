package cjava.examples.com.views;

public class Example03_MethodAndFunctions {
    public static void main(String[] args) {
        sumar();
        restar(120,20);
        int m = mayor(2,5);
        System.out.println("Mayor es "+m);
        String men = mensajeResiduo();
        System.out.println("Mensaje es "+men);

    }

    public static void sumar(){
        //Logica para sumar
        System.out.println("Aqui se esta haciendo la suma");
    }

    public static void restar(int a, int b){
        int r = a - b;
        System.out.println("la resta es "+r);
    }

    public static int mayor(int a, int b){
        return (a>b ? a : b);
    }

    public static String mensajeResiduo(){
        String mensaje = "El residuo es 20";
        return mensaje;
    }

}
