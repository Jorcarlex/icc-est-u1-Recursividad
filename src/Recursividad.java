public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // Caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        // si un if tiena un return no es necesasrio un else
        // return n* factorial(n-1);

        // CASO RECURSIVO: ES DONDE SE LLAMA A SI MISMA CON ARGUMENTOS MODIFICADOS
        // PARA OBORDAR UN SUBPROBLEMA
        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " factorial (" + (n - 1) + ") = " + resultado);
        return resultado;
    }

    // Calcular la suma de los numeros consecutivos
    // n = 5 resultado = 5+4+3+2+1 = 15
    public int sumConsecutivos(int n) {

        if (n == 1) {
            return 1;
        }

        return n + factorial(n - 1);
    }

    // Calcula la potencia de un numero

    public int potencial(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }

        return base * potencial(base, exponente - 1);
    }

    // Crear un metdodo que sume los digitos de un numero
    // Si mando 123 sea igual a 6
    // 1+2+3 = 6
    // usar el %mod
    public int sumaDigitos(int n) {
        // caso base
        if (n < 10) {
            return n;
        }
        return n % 10 + sumaDigitos(n / 10);

    }

    /*
     * Se trata de una secuencia infinita de números naturales; a partir
     * del 0 y el 1, se van sumando a pares, de manera que cada número es
     * igual a la suma de sus dos anteriores, de manera que: 0, 1, 1, 2, 3, 5, 8,
     * 13, 21, 34, 55…
     */

    public int fibonacci(int n) {
        // Casos base: los dos primeros numeros de fibonacci son 0 y 1

        /*
         * if (n == 0) {
         * return 0;
         * } else if (n == 1){
         * return 1;
         * }
         */

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Caso recursivo: sumar los dos numeros anteriores en la secuencia
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
