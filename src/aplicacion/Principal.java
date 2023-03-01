package aplicacion;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();

        System.out.println("Suma de los  números hasta " + n +" :"+ dominio.ej13.suma(n));
        System.out.println("Factorial de  " + n+" :"+ dominio.ej13.factorial(n));
        System.out.println("Potencia de 2 elevado a 10: " + dominio.ej13.potencia(2, 10));
        System.out.println("Suma de los elementos de la lista: " + dominio.ej13.sumalista(lista));
        System.out.println("Media de los elementos de la lista: " + dominio.ej13.media(lista));
        System.out.println("Desviación " + dominio.ej13.desviacion(lista));
        System.out.println("Suma de los elementos hasta  " +n+" :"+ dominio.ej13.sumapares(n));
        System.out.println("Suma de los elementos pares de la lista: " + dominio.ej13.sumapares(n));
        System.out.println("Lista de los elementos pares de la lista: " + dominio.ej13.nuevalistapares(lista));
        System.out.println("Lista con los elementos pares hasta "+n+" :" + dominio.ej13.listapares(n));
        System.out.println("Producto escalar de dos listas: " + dominio.ej13.productoescalar(lista, lista));
        System.out.println("Fibonacci de  " + n +" :"+ dominio.ej13.fibonacci(n));
        System.out.println("La relación entre los resultados de la razón aurea y fibonacci es "+dominio.ej13.comparar((1+Math.sqrt(5))/2));









    }
}
