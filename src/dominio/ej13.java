package dominio;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ej13 {
    public static int suma(int n) {
        return Stream.iterate(0, i -> i + 1).limit(n+1).reduce(0, (a, b) -> a + b);
    }
    public static int factorial(int n){
        return Stream.iterate(1,i->i+1).limit(n).reduce(1,(a,b)->a*b);
    }
    public static int potencia (int base, int exponente) {
        return Stream.iterate(1, i -> i+1).limit(exponente).reduce(1,(a,b)->a*base);
    }
    public static int sumalista(int[]lista){
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).reduce(0, (a, b) -> a + b);
    }


    public static int media(int[]lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b)/lista.length;
    }
    public static int cuadrados(int[]lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b*b);
    }
    public static double desviacion(int [] lista){
        double media=media(lista);
        double cuadrados=cuadrados(lista);
        return Math.sqrt((cuadrados/lista.length)-(media*media));
    }

    public static int sumapares(int n){
        return Stream.iterate(0,i->i+1).limit(n+1).filter(i->i%2==0).reduce(0,(a,b)->a+b);
    }

    public static int sumalistapares (int[] lista){
        return  Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).filter(i->i%2==0).reduce(0,(a,b)->a+b);
    }

    public static ArrayList nuevalistapares(int[] lista){
        ArrayList listanueva = new ArrayList();
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).filter(i->i%2==0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList listapares(int n){
        return Stream.iterate(0,i->i+1).limit(n).filter(i->i%2==0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static int productoescalar(int[]lista1,int[]lista2){
        return Stream.iterate(0,i->i+1).limit(lista1.length).map(i->lista1[i]*lista2[i]).reduce(0,(a,b)->a+b);
    }

    public static int fibonacci(int n){
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(n).map(f -> f[0]).reduce(0, (a, b) -> b);
    }

    public static int fib13() {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(13).map(f -> f[0]).reduce(0, (a, b) ->  b);
    }

    public static int fib14() {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(14).map(f -> f[0]).reduce(0, (a, b) -> b);
    }

    public static boolean comparar(double a) {
        double fib = (double)fib14() / fib13();
        if (Math.abs(a - fib) < 0.1) {
            return true;
        } else {
            return false;
        }

    }



}
