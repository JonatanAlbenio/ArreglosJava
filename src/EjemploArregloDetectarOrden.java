import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {




        int [] a =new int[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros");
        for (int i =0;i<a.length;i++){

            a[i]=s.nextInt();
        }

        boolean ascendent =false;
        boolean descendente = false;
        for (int i =0;i<a.length-1;i++){
            if (a[i]>a[i+1]){

                descendente=true;
            }
            if (a[i]<a[i+1]){

                ascendent=true;
            }

        }
        if (ascendent == true && descendente == true){
            System.out.println(" arreglo desordenado");
        }
        if (ascendent == false && descendente == false){
            System.out.println(" arreglo todos son iguales");
        }

        if (ascendent == true && descendente == false){
            System.out.println(" arreglo ordenado de forma ascendente");
        }
        if (ascendent == false && descendente == false){
            System.out.println(" arreglo ordenado de forma ascendente");
        }


    }
}
