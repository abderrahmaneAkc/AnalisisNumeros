package ActividadEntregable;

/**
 * Clase para analizar un conjunto de números. 
 * Permite encontrar el número máximo, contar sus repeticiones y calcular el promedio.
 */
public class AnalisisNumeros {

    /**
     * Crea un array de números y encuentra el número máximo y cuenta sus repeticiones
     * y calcula el promedio. Muestra toda la información por pantalla.
     */
    public static void main(String[] args) {

        int[] numerosArray = {5, 7, 3, 7, 2, 9, 7};

        int numeroMaximo = encontrarNumeroMaximo(numerosArray);
        int cantidadMaximo = contarRepeticiones(numerosArray, numeroMaximo);

        if (cantidadMaximo > 1) {
            System.out.println("¿El número máximo " + numeroMaximo + " se repite varias veces? SI");
        } else {
            System.out.println("¿El número máximo " + numeroMaximo + " no se repite varias veces? NO");
        }

        double promedio = calcularPromedio(numerosArray);

        System.out.println("El promedio de los números es: " + promedio);

        if (promedio >= 5) {
            System.out.println("El promedio es suficiente: BIEN");
        } else {
            System.out.println("El promedio es insuficiente: MAL");
        }
    }

    /**
     * Encuentra el número máximo en un array de enteros.
     *
     * @param numerosArray array de números a analizar
     * @return el valor máximo encontrado en el array
     */
    public static int encontrarNumeroMaximo(int[] numerosArray) {
        int maximoActual = numerosArray[0];

        for (int i = 1; i < numerosArray.length; i++) {
            if (numerosArray[i] > maximoActual) {
                maximoActual = numerosArray[i];
            }
        }
        return maximoActual;
    }

    /**
     * Cuenta cuántas veces aparece un número en un array.
     *
     * @param numerosArray array de números a analizar
     * @param numeroBuscado número que se desea contar
     * @return la cantidad de veces que aparece numeroBuscado en el array
     */
    public static int contarRepeticiones(int[] numerosArray, int numeroBuscado) {
        int contador = 0;

        for (int i = 0; i < numerosArray.length; i++) {
            if (numerosArray[i] == numeroBuscado) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Calcula el promedio de todos los números en un array.
     *
     * @param numerosArray array de números a analizar
     * @return el promedio de los números como valor double
     */
    public static double calcularPromedio(int[] numerosArray) {
        int sumaTotal = 0;

        for (int i = 0; i < numerosArray.length; i++) {
            sumaTotal = sumaTotal + numerosArray[i];
        }

        return (double) sumaTotal / numerosArray.length;
    }
}
