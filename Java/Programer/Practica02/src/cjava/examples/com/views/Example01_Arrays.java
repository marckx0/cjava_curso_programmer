package cjava.examples.com.views;

public class Example01_Arrays {
    public static void main(String[] args) {
        int[] num = new int[3];

        num[0] = 12;
        num[1] = 20;
        num[2] = 18;

        int suma = 0;
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
            suma = suma + num[i];
        }
        System.out.println("La suma del arreglo es: "+suma);

        String[] cad = {"PERU","CUBA","MEXICO"};
        for(String a:cad){
            System.out.println(a);
        }
    }
}
