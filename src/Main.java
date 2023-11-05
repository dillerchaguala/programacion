import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("FUNDAMENTOS DE PROGRAMACION ");


        // TODO CALCULAR EL AREA DE UN TRIANGULO
        // ENTRADA
        System.out.println("CALCULAR EL AREA DEL TRIANGULO");

        double base = 0;
        double altura = 0;
        Scanner entrada = new Scanner(System.in);

        // PROCESOS
        System.out.println("ingrese base del triangulo:  ");
        base = entrada.nextDouble();
        System.out.println("ingrese altura del triangulo:  ");
        altura = entrada.nextDouble();

        // SALIDA
        double area = base + altura;
        System.out.print("El area es:  " + area);


        System.out.println("\n****************************\n");

        // TODO   SUMA DE DOS NUMEROS

        System.out.println("SUMAR DOS NUMEROS");

        // ENTRADA
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;

        // PROCESO
        System.out.println("ingresa un numero");
        numero1 = entrada.nextDouble();
        System.out.println("ingresa un numero");
        numero2 = entrada.nextDouble();

        // SALIDA
        resultado = numero1 + numero2;
        System.out.printf("El resultado de la suma es igual a:  " + resultado);


        System.out.printf("\n***********************************\n");


        // TODO INGRESA UN NUMERO Y VISUALIZAR EL NUMERO ELEVADO AL CUADRADO
        System.out.println("NUMERO ELEVADO AL CUADRADO");

        // ENTRADA
        double num1 = 0;

        // PROCESOS
        System.out.println("ingrese numero a elevar");
        num1 = entrada.nextDouble();

        // SALIDA
        double elevado = num1 * num1;
        System.out.println("El numero elevado es:  " + elevado);

        System.out.println("\n/////////////////////////////////////////////\n");

        // TODO CONVERTIR DE EUROS A DOLORES

        System.out.println("CONVERTIDOR DE EURO A DOLARES");
        // ENTRADA
        double eruo = entrada.nextDouble();
        double dolar = 1.07;

        // proceso
        double cambio = eruo * dolar;

        // SALIDA
        System.out.println("El valor de euro a dolar es:" + cambio);


        System.out.println("\n//////////////////////////////////////////\n");

        // TODO ESCRIBIR UN PROGRAMA QUE PIDA RL LADO DE UN CUADRADO
        //  Y CALCULE EL VALOR DEL AREA Y DEL PERIMETRO
        System.out.println("CALCULAR EL AREA Y PERIMETRO DE UN CUADRADO ");

        //ENTRADA
        double lado = entrada.nextDouble();

        // proceso

        double areacuadrado = lado * lado;
        double perimetro = lado + lado + lado + lado;

        // SALIDA
        System.out.println("El area del cuadrado es:  " + areacuadrado);
        System.out.println("El perimetro del cuadrado es:  " + perimetro);


        System.out.println("\n////////////////////////////////////////////////\n");

        // TODO ESCRIBA UN PROGRAMA Q DETERMINE EL AREA
        //  Y EL VOLUMEN DE UN CILENTRO

        System.out.println("CALCULE EL AREA Y VOLUMEN DE UN CILINDRO");

        // ENTRADA
        System.out.println("ingrese base de cilindro");
        double basecilindro = entrada.nextDouble();
        System.out.println("ingrese altura de cilindro");
        double alturacilindro = entrada.nextDouble();


        // PROCESO
        double areacilindro = 2 * 3.14 * basecilindro * (basecilindro + alturacilindro);
        double volumencilindro = 3.1416 * (basecilindro * basecilindro) * alturacilindro;

        // SALIDA
        System.out.println("El area del cilindro es:  " + areacilindro + "cm²");
        System.out.println("El volumen del cilindo es:  " + volumencilindro);


        System.out.println("\n//////////////////////////////////////////////////\n");

        //TODO escribir un programa q lea el radio de una
        //circunferencia y calcule la longitud de la misma y el area del circulo

        System.out.println(" EL RADIO DE UN CIRCUNFERENCIA ");

        // ENTRADA
        System.out.println("ingrese el radio de circunferencia");
        double radio = entrada.nextDouble();

        // PROCESO
        double longitud =2 * 3.1416 *radio;
        double areacirculo = 3.1416 * (radio*radio);

        //SALIDA
        System.out.println("La longitud de una circunferencia es:  "+longitud);
        System.out.println("El area de una circunferencia es:  "+areacirculo);


        System.out.println("\n///////////////////////////////////////////////////\n");



        //TODO: calcular el promedio de tres (3) numero ingresados por teclado

        System.out.println("CALCULA EL PROMEDIO DE 3 NUMEROS ");
        //ENTRADA
        System.out.println("Ingrese primer numero");
        double primero = entrada.nextDouble();
        System.out.println("Ingrese segundo numero");
        double segundo = entrada.nextDouble();
        System.out.println("Ingrese tercer numero");
        double tercero= entrada.nextDouble();

        //PROCESO
        double promedio = (primero + segundo + tercero) /3;

        // SALIDAD
        System.out.println("El promedio es:  "+promedio);


    }
}