import java.util.Scanner;

public class EjemploArreglosParesImpares {


    public static void main(String[] args) {

       int []a,pares,impares;

       int totalpares =0,totalimpares=0;

       a=new int[10];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros f: ");
        for (int i=0;i<a.length;i++){

            a[i]=s.nextInt();
        }



        for (int i=0;i<a.length;i++){

                if(a[i]%2==0){
                    totalpares++;
                }else {
                    totalimpares++;
                }


        }
        pares=new int[totalpares];
        impares=new int[totalimpares];
        int j =0;
        int k=0;
        for (int i =0;i<a.length;i++){

            if(a[i]%2==0){

                pares[j++]=a[i];
            }else {
                impares[k++]=a[i];
            }

        }


        System.out.println("--------------------------------------------");


        for (int i =0;i<pares.length;i++){

            System.out.print("Pares["+i+"] : "+pares[i]+ "\n");
        }
        for (int i =0;i<impares.length;i++){
            System.out.print("Impares["+i+"]: "+impares[i]+"\n");
        }
        System.out.println();

    }










}
