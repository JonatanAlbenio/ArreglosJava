import java.util.Scanner;

public class EjemplosArreglosBuscarString {
    public static void main(String[] args) {


        String [] a =new String[4];

        Scanner s = new Scanner(System.in);


        for (int i =0;i<a.length;i++){

            System.out.println("Ingrese un Nombre");
            a[i]=s.next();
        }
        System.out.println("\r\n ingrese un Nombre a buscar");

        String num =s.next();
        int f=0;

        while(f<a.length && !a[f].equalsIgnoreCase(num)){
            f++;

        }
        if(f==a.length){
            System.out.println(" Nombre no encontrado  " );
        } else if (a[f].equalsIgnoreCase(num)) {
            System.out.println("Nombre encotrado posicion   = " + f);
        }

    }
}
