import java.util.Scanner;

public class EjemploArregloNotasAlumnos {

    public static void main(String[] args) {

        double [] claseMatematicas,claseHistoria,claseLenguaje;
        claseMatematicas=new double[7];
        claseHistoria=new double[7];
        claseLenguaje=new double[7];
        int sumaNotasMatematicas =0,sumaNotasHistoria=0,sumaNotasLenguaje=0;


        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matematicas ");

        for (int i =0;i<claseMatematicas.length;i++){

            claseMatematicas[i]=s.nextDouble();
        }


        System.out.println("Ingrese 7 notas de estudiantes para Historia ");

        for (int i =0;i<claseHistoria.length;i++){

            claseHistoria[i]=s.nextDouble();
        }


        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje ");

        for (int i =0;i<claseLenguaje.length;i++){

            claseLenguaje[i]=s.nextDouble();
        }

        for (int i=0;i<7;i++){
            sumaNotasMatematicas+=claseMatematicas[i];
            sumaNotasLenguaje+=claseLenguaje[i];
            sumaNotasHistoria+=claseHistoria[i];


        }

        double promedioMatematicas=(sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria=(sumaNotasHistoria/claseHistoria.length);
        double promedioLenguaje=(sumaNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio clase matematicas" +promedioMatematicas );

        System.out.println("Promedio clase Historia = " + promedioHistoria);

        System.out.println("Promedio clase lenguaje = " + promedioLenguaje);

        System.out.println(" promedio del curso  " + (promedioHistoria+promedioLenguaje+promedioMatematicas)/3);


        System.out.println("Ingrese el identificador del alumno 0 -6" );
        int id =s.nextInt();
        
        double promedioAluno =(claseHistoria[id]+claseLenguaje[id]+claseMatematicas[id])/3;

        System.out.println("promedioAluno = " + promedioAluno);

    }
}
