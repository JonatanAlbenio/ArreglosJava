import java.util.Arrays;

public class EjmeplosArregloForInverso {
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
        System.out.println(" -- INVERSO ----------------------------------------------------------------------" );

        for (int i=0;i<count;i++){
            System.out.println("Para el indice = " +(count-1-i)+" " + "Valor: "+productor[count-1-i]);

        }
        System.out.println(" ------------------------------------------------------------------------" );
        for (int i=count-1;i>=count;i--){
            System.out.println("Para el indice = " + i+" " + productor[i]);

        }
    }
}
