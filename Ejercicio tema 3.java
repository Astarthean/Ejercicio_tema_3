/* 
    Primera parte:

        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
 */

public class Main {
    private static int suma(int a, int b, int c) {
        return(a + b + c);
    }
    public static void Main(String[] args) {
        int a=10, b=20,c=30;
        System.out.println(suma(a,b,c));
    }
}

/*
    Segunda parte:

         Crear una clase coche.

         Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

         Una función que incremente el número de puertas que tiene el coche.

         Crear un objeto miCoche en el main y añadirle una puerta.

         Mostrar el número de puertas que tiene el objeto.
 */

public class Main {
    public static void Main(String[] args) {
        Coche micoche = new Coche();
        micoche.MasPuerta();
        System.out.println(micoche.puertas);
    }

}
class Coche{
    public int puertas=5;

    public void MasPuerta() {
        this.puertas++;
    }
}
