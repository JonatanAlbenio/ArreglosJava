import java.util.Arrays;

public class EjemplosArreglos {
    public static void main(String[] args) {


        String [] productor = new String[7];
        productor[0]="Kignstin penndravy";

        productor[1]="computador ";

        productor[2]="Roberto carlos";

        productor[3]="helicopter pendency";

        productor[4]="celular satsuma";

        productor[5]="carro";

        productor[6]="dog";

        Arrays.sort(productor);
        System.out.println("productor[0] = " + productor[0]);

        System.out.println("productor[1] = " + productor[1]);

        System.out.println("productor[2] = " + productor[2]);

        System.out.println("productor[3] = " + productor[3]);

        System.out.println("productor[4] = " + productor[4]);

        System.out.println("productor[5] = " + productor[5]);

        System.out.println("productor[6] = " + productor[6]);


     int [] numeros = new int[4];
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;


     int i =numeros[0];

        int j =numeros[1];

        int k =numeros[2];

        int l =numeros[3];

        System.out.println("l = " + i);
        System.out.println("l = " + k);

        System.out.println("l = " + j);

        System.out.println("l = " + l);

    }
}
