import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

int [] numero=new int[10];

        Scanner s = new Scanner(System.in);
            int ultimo;
            int elemento;
            int posicio;
        for (int i =0;i<numero.length-1;i++){
            System.out.println("Ingrese el numero ");
            numero[i]=s.nextInt();


        }


        System.out.println("Nuevo elemento " );
        elemento = s.nextInt();

        System.out.println("Posicion donde agregar (de 0 a 9)" );

        posicio =s.nextInt();




        for (int i=numero.length-2 ;i>=posicio ;i--){

            numero[i+1]=numero[i];

        }

        numero[posicio]=elemento;


        System.out.println(" ARREGLO FINAL -----------");


        for (int i =0;i<numero.length;i++){
            System.out.println(" "+ numero[i]);
        }





    }
}
