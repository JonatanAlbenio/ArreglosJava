import java.util.Arrays;

public class EjemplosArreglosFor {
    public static void main(String[] args) {


        String [] productor = new String[7];
        int count =productor.length;

        productor[0]="Kignstin penndravy";

        productor[1]="computador ";

        productor[2]="Roberto carlos";

        productor[3]="helicopter pendency";

        productor[4]="celular satsuma";

        productor[5]="carro";

        productor[6]="dog";

        Arrays.sort(productor);
        for (int i=0;i<count;i++){
            System.out.println("Para el indice = " + i+" " + productor[i]);

        }

        System.out.println(" ---------------------------------------------------------------------------------------------------------");


        for (String prod: productor){
            System.out.println("prod = " + prod);
        }

        System.out.println(" ---------------------------------------------------------------------------------------------------------");

        int j =0;

        while (j<count){
            System.out.println("Para el indice = " + j+" " + productor[j]);
            j++;

        }
        System.out.println(" ---------------------------------------------------------------------------------------------------------");

       /* do {

            System.out.println("Para el indice = " + j+" " + productor[j]);
            j++;

        }while (j<count);]/
        int [] numero = new] int[10]*/



    }
}
