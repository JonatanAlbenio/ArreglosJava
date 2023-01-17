import java.util.Arrays;

public class EjemplosArreglosForOrdenamientoBurbuja {
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
    

        productor[0]="Kignstin penndravy";

        productor[1]="computador ";

        productor[2]="Roberto carlos";

        productor[3]="helicopter pendency";

        productor[4]="celular satsuma";

        productor[5]="carro";
        productor[6]="A";

        int count =productor.length;
        System.out.println("count = " + count);
        int contador =0;
        for (int i =0;i<count-1;i++){
            
            for (int j =0;j<count-1-i;j++){
                
                if (productor[j+1].compareTo(productor[j])<0){
                    
                    String auxiiar =productor[i];
                    productor[i]=productor[j];
                    productor[j]=auxiiar;
                    
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

        for (int i=0;i<count;i++){
            System.out.println("Para el indice = " + i+" " + productor[i]);

        }

        int [] numeros = new int[4];
        numeros[0]=9;
        numeros[1]=5;
        numeros[2]=10;
        numeros[3]=1;

        System.out.println(" ----------------------------------------------------------------------------------------------------");
        for (int i =0;i<numeros.length-1;i++){

            for (int j =0;j<numeros.length-1-i;j++){

                if (((Integer) numeros[j+1]).compareTo(numeros[j])<0){

                    int auxiiar =numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=auxiiar;

                }
                contador++;
            }
        }
        for (int i =0;i<numeros.length;i++){

            System.out.println("numeros = " + numeros[i]);
        }

    }
}
