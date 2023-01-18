import java.util.Scanner;

public class Tarea15SistemasEstadisticoArreglo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int [] a = new int[7];
        for (int i =0; i<7;i++){
            System.out.println("Ingrese los numeros");
            a[i]=scanner.nextInt();

        }
        int countPositivo=0;
        int negativo=0;
        int ceros=0;
        int sumaPositivos = 0;
        int negativos =0;
        int ceros1=0;
        for (int j =0;j<7;j++){

            if(a[j]>0) {
                countPositivo++;
                sumaPositivos+=a[j];

            }else if (a[j]<-1){
                negativo ++;
                negativos+=a[j];
            }else if (a[j]==0){
                ceros++;
                ceros1+=a[j];
            }

        }
        negativos=Math.abs(negativos);

        System.out.println("ceros1 = " + negativo);
        System.out.println("ceros1 = " + (negativos/negativo));
        System.out.println("ceros1 = " + sumaPositivos);


    }
}
