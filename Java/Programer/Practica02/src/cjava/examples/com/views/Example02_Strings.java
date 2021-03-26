package cjava.examples.com.views;

public class Example02_Strings {
    public static void main(String[] args) {
        String cad1 = "hola", cad2 = "mundo";
        String cad3;

        cad3 = cad1.concat(cad2);
        System.out.println("Concat cad1 y cad2 "+cad3);
        System.out.println("Longitud "+cad3.length());

        cad3 = cad1.replace('o','x');
        System.out.println("Replace de cad1 (o,x) "+cad3);

        System.out.println("compareto (cad1,cad2) "+cad1.compareTo(cad2));

        System.out.println("Cad1 indexof(l) "+cad1.indexOf("l"));

        System.out.println("Cad2 toUpper :"+cad2.toUpperCase());

        System.out.println("cad2.charAt(2) :"+cad2.charAt(2));

        System.out.println("cad1.substring(1,2) "+cad1.substring(1,2));

    }
}
