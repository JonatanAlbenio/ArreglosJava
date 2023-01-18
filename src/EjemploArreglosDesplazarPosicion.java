import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

int [] numero=new int[10];

        Scanner s = new Scanner(System.in);
            int ultimo;
        for (int i =0;i<numero.length;i++){
            System.out.println("Ingrese el numero ");
            numero[i]=s.nextInt();


        }
        ultimo=numero[numero.length-1];

        for (int i=numero.length-2 ;i>=0 ;i--){

            numero[i+1]=numero[i];

        }

        numero[0]=ultimo;

        System.out.println(" ARREGLO FINAL -----------");


        for (int i =0;i<numero.length;i++){
            System.out.println(" "+ numero[i]);
        }





    }
}
