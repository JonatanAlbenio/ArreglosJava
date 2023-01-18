import java.util.Scanner;

public class EjemplosArreglosBuscarNumero {
    public static void main(String[] args) {


        int [] a =new int[10];

        Scanner s = new Scanner(System.in);


        for (int i =0;i<a.length;i++){

            System.out.println("Ingrese un numero");
            a[i]=s.nextInt();
        }
        System.out.println("\r\n ingrese un numero a buscar");

        int num =s.nextInt();
        int f=0;

        while(f<a.length && a[f] !=num){
            f++;

        }
        if(f==a.length){
            System.out.println(" Numero no encontrado  " );
        } else if (a[f]==num) {
            System.out.println("Numero encotrado posicion   = " + f);
        }

    }
}
