import java.util.Arrays;

public class EjemplosArreglosForInversoMutable {
    public static void arregloInverso (String[] arreglo){
        int total12=arreglo.length;
        int total =arreglo.length;
        for (int i =0;i<total12;i++){
            String actual =arreglo[i];
            String inverso =arreglo[i];

            arreglo[i]=inverso;
            arreglo[total12-1-i]=actual;
            total12--;

        }

    }
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
        arregloInverso(productor);
        System.out.println(" --------------------------------------------------------");
        for (int i=0;i<count;i++){
            System.out.println("Para el indice = " + i+" " + productor[i]);

        }




    }
}
