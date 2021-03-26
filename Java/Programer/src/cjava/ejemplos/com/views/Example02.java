package cjava.ejemplos.com.views;

import java.util.Date;

public class Example02 {

    public static void main(String[] args) {
        int a=10,b=20, iProm;
        String snomALu = "Juan Perez";
        double dPension = 1500.30;
        char cGenero = 'M';
        boolean bActivo = true;
        Date fFecNac;

        if (bActivo==true) {

            iProm = (a + b) / 2;

            String sMensajeProm;
            String sEstadoProm ="";

            if (iProm >= 0 && iProm <= 5) {
                sMensajeProm = "Deficiente";
            } else if (iProm >= 6 && iProm <= 10) {
                sMensajeProm = "Bajo";
            } else if (iProm >= 11 && iProm <= 15) {
                sMensajeProm = "Regular";
            } else if (iProm >= 16 && iProm <= 20) {
                sMensajeProm = "Bueno";
            } else {
                sMensajeProm = "Error";
            }

            sEstadoProm = (iProm>=13 ? "Aprobado" : "Desaprobado");

            String sMensajeGenero="";
            switch (cGenero){
                case 'M':sMensajeGenero="Masculino";break;
                case 'F':sMensajeGenero="Femenino";break;
                case 'T':sMensajeGenero="Transgenero";break;
                default :sMensajeGenero="No definido";break;
            }

            System.out.print("El alumno :"+snomALu+" Cuya pension es : "+dPension);
            System.out.print(" de genero : "+sMensajeGenero);
            System.out.println("\nTiene las siguientes notas :");
            System.out.println("Nota 1 : "+a);
            System.out.println("Nota 2 : "+b);
            System.out.println("Promedio : "+iProm);
            System.out.println("Estado : "+sEstadoProm);
            System.out.println("Categoria : "+sMensajeProm);

        } else {
            System.out.println("El alumno esta eliminado");
        }



    }
}
